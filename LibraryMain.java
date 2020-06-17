import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * メインクラス
 * 
 * @author 平松和貴
 * @see Login MainMenu
 */

public class LibraryMain extends HttpServlet {
	static Logger logger = Logger.getLogger(LibraryMain.class.getName());
    static UI mainUI = new UI();
    static Login login = new Login();
    static MainMenu mainMenu = new MainMenu();
    public static int loginID = 0;

    public static void main(final String[] args) throws SecurityException, IOException, SQLException,
            ClassNotFoundException {
        try {
            final FileHandler handler = new FileHandler("log.txt");
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            // ログレベルの設定
            logger.setLevel(Level.FINER);

            int checkEmpID = login.begin();
            loginID = checkEmpID;//dame 勝手にいじられないように変更の必要あり
            boolean checkRight = login.checkRight(checkEmpID);
                
            if (checkRight == true) {
                mainMenu.choiceMenuAdmin();
            } 
            else {
                mainMenu.choiceMenuUser();
            }
        }
        finally{
            logger.exiting(LogUtil.getClassName(), LogUtil.getMethodName());
        }
    }
}