public class Engine {
    private boolean isStarted;
    public Engine() {
        isStarted = false;
    }
    public void start(){
        if(!isStarted){
            isStarted = true;
            System.out.println("Engine is started");
        }else {
            System.out.println("Engine is already started");
        }
    }
    public void Stop(){
        if(isStarted){
            isStarted = false ;
            System.out.println("Engine is stoped");
        }else {
            System.out.println("Engine is already stoped");
        }
    }

}
