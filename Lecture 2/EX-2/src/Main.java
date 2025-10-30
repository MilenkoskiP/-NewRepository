import java.util.Scanner;
void main(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the agent's full name: ");
    String fullName = scanner.nextLine();

    AgentInfo agent = new AgentInfo(fullName);
    AgentAnalyzer analyzer = new AgentAnalyzer();

    System.out.println("Agent's Full Name: " + agent.getFullName());
    int length = agent.getNameLength();
    System.out.println("Length of the name: " + length + " characters");

    char middleChar = analyzer.findMiddleCharacter(agent.getFullName());
    System.out.println("Agent "+agent.getFullName()+", the middle character of your name is '"+ middleChar +"'.");

    scanner.close();
}