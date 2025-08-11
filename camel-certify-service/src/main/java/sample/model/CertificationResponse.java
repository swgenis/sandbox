package sample.model;

public class CertificationResponse {

    private String certified;

    public CertificationResponse() {
        super();
    }

    public CertificationResponse(String certified) {
        this.certified = certified;
    }

    public String getCertified() {
        return certified;
    }

    public void setCertified(String certified) {
        this.certified = certified;
    }

}
