import java.util.Scanner;

public class grade_using_methods { //GRADE CLASSIFICATION FUNCTION
    /*Write a program that will ask the user to enter his/her marks (out of 100).
     Define a method that will display grades according to the marks entered as below:

    Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Mark : ");
        int mark = input.nextInt();

        //String grade = gradecalculator(mark);
        System.out.println("The Grade of your mark is : "+gradecalculator(mark));
    }

    static String gradecalculator(int mark) {
        if (mark >= 91 && mark <= 100) return "AA";

        if (mark >= 81 && mark <= 90)  return "AB";

        if (mark >= 71 && mark <= 80)  return "BB";

        if (mark >= 61 && mark <= 70)  return "BC";

        if (mark >= 51 && mark <= 60)  return "CD";

        if (mark >= 41 && mark <= 50)  return "DD";

        else if (mark<=40) /*----->*/  return "Fail";

        return null;
    }


}
