class StudentAccount extends Account {

    public StudentAccount(String username, String password) {
        super(username, password);
    }
    
    @Override
    public void login() {
        System.out.println("Student " + username + " logged in.");
    }
    
    @Override
    public void logout() {
        System.out.println("Student " + username + " logged out.");
    }
    
    public void downloadCoursMaterial() {
        System.out.println("Student " + username + " is downloading course material.");
    }
    
    public void passOnlineTest() {
        System.out.println("Student " + username + " is taking an online test.");
    }
    
    public void checkTestResult() {
        System.out.println("Student " + username + " is checking their test results.");
    }
    
    public void readMessage() {
        System.out.println("Student " + username + " is reading a message.");
    }
    
    public void sendMessage() {
        System.out.println("Student " + username + " is sending a message.");
    }
}
