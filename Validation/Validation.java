package Validation;

import CustomException.StudentExecptionHandler;
import com.app.core.Course;
import com.app.core.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import static com.app.core.Student.sdf;
public class Validation {

    public static String validateEmail(String email){
        return email;
    }
    public static String validatePassword(String password){
        return password;
    }

    public static Date convertDate(String date) throws ParseException {
        return sdf.parse(date);
    }
    public static Course convertCourse(String course){
        return Course.valueOf(course.toUpperCase());
    }

    public static boolean pnrVarification(String pnr , ArrayList<Student> student) throws StudentExecptionHandler{
        if(student.contains(new Student(pnr)))
            return true;
        throw new StudentExecptionHandler("Invalid PNR entered");
    }





}
