package sample.model.person;

import java.util.Objects;

public class PersonResponse {

    private String instanceId;
    private String status;

    public PersonResponse() {
    }

    public PersonResponse(String instanceId, String status) {
        this.instanceId = instanceId;
        this.status = status;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonResponse that = (PersonResponse) o;
        return Objects.equals(instanceId, that.instanceId) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, status);
    }

    @Override
    public String toString() {
        return "PersonResponse{" +
                "instanceId='" + instanceId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
