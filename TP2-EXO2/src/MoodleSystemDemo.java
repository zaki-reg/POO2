public class MoodleSystemDemo {
    public static void main(String[] args) {

        StudentAccount student = new StudentAccount("student01", "pass123");
        student.login();
        student.downloadCoursMaterial();
        student.passOnlineTest();
        student.checkTestResult();
        student.readMessage();
        student.sendMessage();
        student.logout();
        

        ProfAccount professor = new ProfAccount("prof01", "secure456");
        professor.login();
        professor.uploadCoursMaterial();
        professor.proposeOnlineTest();
        professor.sendMessage();
        professor.readMessage();
        professor.logout();
        

        AdminAccount admin = new AdminAccount("admin", "admin789");
        admin.login();
        admin.linkProfSubject();
        admin.uploadStudentLists();
        admin.downloadStudentResults();
        admin.creatAccounts();
        admin.logout();
    }
}
