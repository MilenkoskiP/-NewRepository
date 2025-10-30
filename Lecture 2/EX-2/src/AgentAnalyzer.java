public class AgentAnalyzer {
    public char findMiddleCharacter(String name) {
        int length = name.length();
        if (length % 2 == 0) {
            return name.charAt(length / 2 - 1);
        } else {
            return name.charAt(length / 2);
        }
    }
}
