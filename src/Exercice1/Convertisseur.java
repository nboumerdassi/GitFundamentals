package Exercice1;

import java.util.Scanner;

public class Convertisseur {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String answer = null;
		do{
			Convertisseur.chooseConversion();
			String userChoice = sc.next();
			while(!userChoice.equals("1") && !userChoice.equals("2")){
				Convertisseur.chooseConversion();
				userChoice = sc.next();
			}
		
			Convertisseur.enterNumberToConvert();
			double value = sc.nextDouble();
			if("1".equals(userChoice)){
				Convertisseur.computeFtoC(value);
			}
			if("2".equals(userChoice)){
				Convertisseur.computeCtoF(value);
			}
			Convertisseur.computeMore();
			answer = sc.next();
		}
		while(answer.equalsIgnoreCase("Y"));	
		Convertisseur.endingMessage();
	}
	public static void chooseConversion(){
		String greetingMessage = "Which conversion would you like to do? \n"
				+ "1: F to C \n"
				+ "2: C to F \n";
		System.out.println(greetingMessage);
	}
	
	public static void enterNumberToConvert(){
		String input = "Enter a number you would like to convert:  \n";
		System.out.println(input);
	}
	
	public static void computeFtoC(Double number){
		Double result = ((number-32)*5)/9;
		System.out.println(result);
	}
	
	public static void computeCtoF(Double number){
		Double result = (9/5)*number+32;
		System.out.println(result);
	}
	public static void computeMore(){
		String moreToCompute = "would you like to convert another number? \n"
				+ "Y/N";
		System.out.println(moreToCompute);
	}
	public static void endingMessage(){
		String message = "Thank you! Use our convertor soon again";
		System.out.println(message);
				
	}
}
