import java.util.Scanner;

public class Calc {
	static public void main(String[] args){

	Scanner scan=new Scanner (System.in);

	Numero n1=new Numero();
	Numero n2=new Numero();
	Numero soma=new Numero();
	Numero sub=new Numero();
	Numero mult=new Numero();
	Numero div=new Numero();
	Numero res=new Numero();
	Equacao e=new Equacao(); 
	
	System.out.printf("%nDigite 1 para soma, 2 para subtração, 3 para multiplicacao, 4 para divisao: " );
	e.setEquacao(scan.nextInt());
	System.out.printf("%nDigite o valor 1:" );
	n1.setValor(scan.nextInt());
	System.out.printf("%nDigite o valor 2:" );
	n2.setValor(scan.nextInt());

	if (equacao == 1){
	soma.setValor(n1.getValor() + n2.getValor());
	System.out.printf("%d + %d = %d", n1.getValor(), n2.getValor(), res.getValor());
	} 
	if (equacao == 2){
	soma.setValor(n1.getValor() - n2.getValor());
	System.out.printf("%d - %d = %d", n1.getValor(), n2.getValor(), res.getValor());
	} 
	if (equacao == 3){
	soma.setValor(n1.getValor() * n2.getValor());
	System.out.printf("%d * %d = %d", n1.getValor(), n2.getValor(), res.getValor());
	} 
	if (equacao == 4){
	soma.setValor(n1.getValor() / n2.getValor());
	System.out.printf("%d / %d = %d", n1.getValor(), n2.getValor(), res.getValor());
	} 
	
}
}