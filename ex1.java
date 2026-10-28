interface developer{
	void develop();
}

interface tester{
	void test();
}

class ex1 implements developer,tester{

public void develop(){
System.out.println("Develops");
}

public void test(){
System.out.println("Tester");
}

public static void main(String[] args){
ex1 project = new ex1();

project.develop();
project.test();
System.out.println("Jesus is God");
}
}