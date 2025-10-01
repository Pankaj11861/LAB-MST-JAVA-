import java.util.*;
class invalidenrollexception extends Exception{
    public invalidenrollexception(String msg){
        super(msg);
    }
}
public class universityenrollment{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            String name=sc.nextLine();
            int age=sc.nextInt();
            int courseid=sc.nextInt();
            int credits=sc.nextInt();
            if(age<17 || age>30){
                throw new invalidenrollexception("invalid age, must be between 17 and 30");
            }
            if(courseid<10000 || courseid>99999){
                throw new invalidenrollexception("invalid course ID, must be a 5 digit number");
            }
            if(credits<1 || credits>30){
                throw new invalidenrollexception("invalid no. of credits, must be between 1 and 30");
            }
            System.out.println("enrollment successful");
            System.out.println("Student name "+ name);
            System.out.println("age "+age);
            System.out.println("Course ID "+courseid);
            System.out.println("Credits "+credits);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input, please enter a numeric value for age, courseid and credits");
        }
        catch(invalidenrollexception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}