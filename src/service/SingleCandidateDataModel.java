package service;

public class SingleCandidateDataModel {
    private Candidate candidate;

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public SingleCandidateDataModel(Candidate candidate) {
        this.candidate = candidate;
    }

    public void getVoted(Candidate candidate){
        candidate.setVotes(candidate.getVotes() + 1);
    }
}
