import Server.BasicServer;
import Server.Utils;
import com.sun.net.httpserver.HttpExchange;
import service.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class VoteMachine extends BasicServer {
    private final CandidateService service;
    public VoteMachine(String host, int port) throws IOException {
        super(host, port);
        service = new CandidateService();
        registerGet("/", this::mainHandler);
        registerPost("/thankyou", this::thankHandler);
        registerGet("/votes", this::votesHandler);
    }

    private void votesHandler(HttpExchange exchange) {
        renderTemplate(exchange, "votes.html", new CandidateDataModel(service.getAllCandidates()));
    }

    private void thankHandler(HttpExchange exchange) {
        String raw = getBody(exchange);
        Map<String, String> parsed = Utils.parseUrlEncoded(raw, "&");
        int id = Integer.parseInt(parsed.get("candidateId"));
        Candidate candidate = service.getCandidate(id);
        List<Candidate> candidates = service.candidates;

        renderTemplate(exchange, "thankyou.html", getSingleCandidate(candidate, candidates));
    }

    private void mainHandler(HttpExchange exchange){
        renderTemplate(exchange, "candidates.html", new CandidateDataModel(service.getAllCandidates()));
    }

    private SingleCandidateDataModel getSingleCandidate(Candidate candidate, List<Candidate> candidates){
        SingleCandidateDataModel singleCandidateDataModel = new SingleCandidateDataModel(candidate);
        candidate.setVotes(candidate.getVotes() + 1);
        double allVotes = service.sumVotes();

        for (Candidate can : candidates) {
            can.setAllVotes((can.getVotes() / allVotes) * 100);
        }

        new CandidateDataModel(service.getAllCandidates());

        return singleCandidateDataModel;
    }
}
