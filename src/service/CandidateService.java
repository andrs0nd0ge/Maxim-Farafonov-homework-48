package service;

import java.util.List;

public class CandidateService {
    public CandidatesDataModel getAllCandidates(){
        List<Candidate> candidates = FileService.readCandidates();

        return new CandidatesDataModel(candidates);
    }

}
