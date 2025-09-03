import java.util.*;
public class basic_calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to basic calculator screen");
        System.out.println("Enter the query to be calculated in a single line without spaces:");
        String statement = sc.nextLine();
        statement = statement + '&';
        int res = 0;
        int i = 0;
        String num1 = "";
        while(statement.charAt(i)!='+'&& statement.charAt(i)!='-' && statement.charAt(i)!='*' && statement.charAt(i)!='/'  ){
            num1 = num1 + statement.charAt(i);
            i++;
        }
        char opr = statement.charAt(i);
        i++;
        
        int n1 = Integer.parseInt(num1);
        res = res + n1;
        
        while(statement.charAt(i)!='&'){
            String numtem = "";
            while(statement.charAt(i)!='+'&& statement.charAt(i)!='-' && statement.charAt(i)!='*' && statement.charAt(i)!='/' && statement.charAt(i)!='&'){
                numtem = numtem + statement.charAt(i);
                i++;
            }
           
            int temp = Integer.parseInt(numtem);
            switch(opr){
                case '+' : res = res + temp; break;
                case '-' : res = res - temp; break;
                case '/' : res = res / temp; break;
                case '*' : res = res*temp; break;
            }
            if(statement.charAt(i) == '&') break;
            opr = statement.charAt(i);
            i++;
        }
        System.out.println(res);
    }
}