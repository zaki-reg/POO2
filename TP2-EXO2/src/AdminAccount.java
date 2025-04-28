class AdminAccount extends Account {

    public AdminAccount(String username, String password) {
        super(username, password);
    }
    
    @Override
    public void login() {
        System.out.println("Admin " + username + " logged in.");
    }
    
    @Override
    public void logout() {
        System.out.println("Admin " + username + " logged out.");
    }
    
    public void linkProfSubject() {
        System.out.println("Admin " + username + " is linking a professor to a subject.");
    }
    
    public void uploadStudentLists() {
        System.out.println("Admin " + username + " is uploading student lists.");
    }
    
    public void downloadStudentResults() {
        System.out.println("Admin " + username + " is downloading student results.");
    }
    
    public void creatAccounts() {  // Note: Consider renaming to createAccounts in production code!
        System.out.println("Admin " + username + " is creating accounts.");
    }
}
