package day9;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings1 gr = new Greetings1();
		gr.greeting1(); //1
		
		String str = gr.greeting2();  //2
        System.out.println(str);
        
       gr.greeting3("John");   //3
       
       String strr = gr.greeting4("Johny"); //4
       System.out.println(strr);
        
	}

}
