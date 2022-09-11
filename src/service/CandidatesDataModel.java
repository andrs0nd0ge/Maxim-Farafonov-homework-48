package service;

import java.util.List;

public class CandidatesDataModel {
    private List<Candidate> candidates;

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public CandidatesDataModel(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
