class Hello
{
        void Welcome()
        {
        System.out.println("Welcome to Employee Wage Computation Program on Master Computation");
        }
}

class Attend1
{
	int Emp_Wage_per_Hr,day=0,Total_Hrs=0,No_Days,Work_Hrs;
	int full_day=8,part_day=4,EmpWage,hrs,Total_Wage=0;
	public void attend(int Emp_Wage_per_Hr,int No_Days,int Work_Hrs ) 
	{
	
	while(Total_Hrs < Work_Hrs && day < No_Days)
	{
		int p=(int)Math.floor(Math.random()*10)%3;
		switch(p) 
		{
		case 1:
		System.out.println("Present");
		hrs=full_day;
		day=day+1;
		Total_Hrs=Total_Hrs+hrs;
		break;
		case 2:
		System.out.println("Part Day");
		hrs=part_day;
		day=day+(1/2);
		Total_Hrs=Total_Hrs+hrs;
		break;
		default:
		System.out.println("Absent");
		hrs=0;
		day=day+0;
		Total_Hrs=Total_Hrs+hrs;
		break;
		}
		EmpWage=Emp_Wage_per_Hr*hrs;
		System.out.println("Employee Wage: "+EmpWage+" Total Hrs: "+Total_Hrs+" On Day: " +day);
		Total_Wage=Total_Wage+EmpWage;
		
	}
	System.out.println("Total Wage: "+Total_Wage);
	}
}
class EmpWage
{
        public static void main(String[] args)
        {
                Hello A1 = new Hello();
                A1.Welcome();
		Attend1 A=new Attend1();
		A.attend(20,20,200); 

       }
}


