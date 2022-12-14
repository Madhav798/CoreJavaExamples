package practicejava.core.exp;

public class ControlFlow {
     public int Passing( String yearOfPassing1,  String yearOfPassing2)
     {
         if((yearOfPassing1 == "january" || yearOfPassing1 == "march")&&(yearOfPassing2 == "april" || yearOfPassing2 == "febraury"))
         {
             return 1;
         }
         else if (yearOfPassing1 == "september" || yearOfPassing2 == "october")
         {
             return 2;
         }
         else if (yearOfPassing1 == "december" && yearOfPassing2 == "november")
         {
             return 3;
         }
         else
         {
             return 9;
         }
     }
         public static void main(String[]args){
         ControlFlow cf = new ControlFlow();
         System.out.println(cf.Passing("january","april"));
         System.out.println(cf.Passing("march","january"));
         System.out.println(cf.Passing("september","october"));
         System.out.println(cf.Passing("december","november"));
     }
}
