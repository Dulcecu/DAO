package proyecto;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, SQLException, ClassNotFoundException {

        users ud= new users(2,"TiroJeta","Calle Tiro en la cara");
        //ud.insert();
        //ud.update();
        //ud.delete();
        ud.select();

    }
}
