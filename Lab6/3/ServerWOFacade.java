public class ServerWOFacade {
    public static void main(String[] args) {
		ServerManager sm=new ServerManager();
		sm.startServer();
		sm.closeServer();
    }

    
}
