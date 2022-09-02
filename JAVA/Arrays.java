import java.util.Arrays;
class Employee{
	String name;
	int age;
}
class Array{
	public static void main(String[] args){
		Employee[] e = new Employee[5];
		e[0] = new Employee();
		e[1] = new Employee();
		e[2] = new Employee();
		e[3] = new Employee();
		e[4] = new Employee();
		e[0].name = "abc";
		e[0].age = 24;
		e[1].name = "ssbc";
		e[1].age = 34;
		e[2].name = "addl";
		e[2].age = 23;
		e[3].name = "dldc";
		e[3].age = 32;
		e[4].name = "abcd";
		e[4].age = 84;
		System.out.println(e.length);
		/*for(int i=0;i<=4;i++)
		{
			System.out.println("Name : "+e[i].name+" Age : "+e[i].age);
		}*/
		for(Employee E:e){
			System.out.println("Name : "+E.name+" Age : "+E.age);
		}
		//Employee[] e = {new Employee(),new Employee()};
	}
}




