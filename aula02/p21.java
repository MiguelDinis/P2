/*************************************************************************
 * Compilation: javac j21.java 
 * Execution: java j21
 *************************************************************************/
import static java.lang.System.*;
import  java.util.*;

public class p21
{
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args)
  {
	  Scanner kb = new Scanner(System.in);
	  out.print("Re: ");
	  double re = kb.nextDouble();
	  out.print("Im: ");
	  double im = kb.nextDouble();
    Complexo a = new Complexo(re, im);

    // Vamos usar métodos de 'a'
    out.println("(" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  fase   =  %2.2f\n", a.phase());
  }

}
