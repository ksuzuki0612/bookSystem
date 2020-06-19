public class ResetPassword{
    SqlMethod sqlmethod = new SqlMethod();


    public boolean checkResetPass(final int ID,final String pass,final String checkPass){
        int empID = ID;
        String password = pass;
        String checkPassword = checkPass;
        if(password.equals(checkPassword)){
            sqlmethod.dbUpdatePassword(empID, password);
            return true;
        }else{
            return false;
        }
    }

    public boolean checkLoginID(int ID){
        int id = ID;
        int checkID = LibraryMain.loginID;
        if(id == checkID){
            return true;
        }else{
            return false;
        }
    }
}




