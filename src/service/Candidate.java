package service;

public class Candidate {
    private Integer id;
    private String name;
    private String photo;
    private double votes;
    private double allVotes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public double getVotes() {
        return votes;
    }

    public void setVotes(double votes) {
        this.votes = votes;
    }

    public double getAllVotes() {
        return allVotes;
    }

    public void setAllVotes(double allVotes) {
        this.allVotes = allVotes;
    }

    public Candidate(Integer id, String name, String photo, double votes, double allVotes) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.votes = votes;
        this.allVotes = allVotes;
    }
}
