class ProfAccount extends Account {

    public ProfAccount(String username, String password) {
        super(username, password);
    }
    
    @Override
    public void login() {
        System.out.println("Professor " + username + " logged in.");
    }
    
    @Override
    public void logout() {
        System.out.println("Professor " + username + " logged out.");
    }
    
    public void uploadCoursMaterial() {
        System.out.println("Professor " + username + " is uploading course material.");
    }
    
    public void proposeOnlineTest() {
        System.out.println("Professor " + username + " is proposing an online test.");
    }
    
    public void sendMessage() {
        System.out.println("Professor " + username + " is sending a message.");
    }
    
    public void readMessage() {
        System.out.println("Professor " + username + " is reading messages.");
    }
}
