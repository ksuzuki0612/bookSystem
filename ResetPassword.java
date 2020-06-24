public class ResetPassword{
    SqlMethod sqlmethod = new SqlMethod();

    public boolean checkResetPass(final int ID,final String pass,final String checkPass){
        int empID = ID;
        String password = pass;
        String checkPassword = checkPass;

        if(password.equals(checkPassword)){

            boolean result = sqlmethod.dbUpdatePassword(empID, password);

            return result;
        }else{
            return false;
        }
    }

}




