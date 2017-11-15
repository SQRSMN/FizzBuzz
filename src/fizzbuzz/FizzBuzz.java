/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author schlomo
 */
public class FizzBuzz {


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        
        fizzBuzzer(100);
//        System.out.println(CountToM.countToM(9));
    
        }
    
    
    private static void fizzBuzzer(int endVal){
        for(int i=1; i<=endVal; i++){
            System.out.println(checkDividable(i));
        }
        
        
    }
    
    
    static String checkDividable(int divVal){
        String result = "";
    /*if(divVal%3 == 0 && divVal%5 == 0)
        return "FizzBuzz"; */
    
    
        result += (divVal % 3) == 0 ? "Fizz" : "";
    
        result += (divVal % 5) == 0 ? "Buzz" : "";
        
        
        
        /*if(result.equals("")){
            result = String.valueOf(divVal);
        }*/
        //More aesthetic than gnarly if condition...
        result += (result.equals("")) == true ? String.valueOf(divVal) : "";
        
        
    return result;
    }
    
    
    
}
