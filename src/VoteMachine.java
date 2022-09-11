import com.sun.net.httpserver.HttpExchange;
import server.BasicServer;
import service.CandidateService;

import java.io.IOException;

public class VoteMachine extends BasicServer {

    private CandidateService service = new CandidateService();
    protected VoteMachine(String host, int port) throws IOException {
        super(host, port);

        registerGet("/", this::mainHandler);
    }

    private void mainHandler(HttpExchange exchange) {
        renderTemplate(exchange, "candidates.ftl", service.getAllCandidates());
    }
}
