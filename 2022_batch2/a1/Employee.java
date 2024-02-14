package a1;

public class Employee {
	static String Company_name = "ABC PHARMA";
	String e_name;
	int e_id,basic_pay;
	double gross;
	Employee(String name, int id, int b_pay)
	{
		e_name = name;
		e_id = id;
		basic_pay = b_pay;
		gross = this.calculate();
		
	}
	Employee(Employee e)
	{
		
		e_name = e.e_name;
		e_id = e.e_id;
		basic_pay = e.basic_pay;
		gross = e.calculate();
	}
	
	public double calculate()
	{
		double HRA = basic_pay * 12/100;
		double DA = basic_pay * 3/100;
		gross = basic_pay + HRA + DA;
		if(gross > 50000)
		{
			System.out.println("Company name: "+ Company_name + "\nEmployee name: " + e_name + "\nEmployee id: " + e_id + "\nGross pay: " + gross + "\n------------------------------------\n");
		}
		return gross;
	}
	{	
		
	}
	public static void main(String args[])
	{
		new Employee("Ajay", 12, 300000);
		new Employee("Bijay", 22, 30000);
		Employee e3 = new Employee("Sujay", 32, 70000);
		new Employee(e3);
	}
}
