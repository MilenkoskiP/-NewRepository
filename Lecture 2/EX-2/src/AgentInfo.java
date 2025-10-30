public class AgentInfo {
    private String fullName;

    public AgentInfo(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNameLength() {
        return fullName.length();
    }
}
