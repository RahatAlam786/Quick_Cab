import java.util.*;
class CabDriver
{
	static int driverId = 123;
	private int id;
	private String name; //get set
	private Long contact; //get set
	private String type; //get
	private String car; //get
	private Long account; //get set
	private String status = "Available";

	CabDriver(String name, Long contact, String type, String car, Long account)
	{
		super();
		this.name = name;
		this.contact = contact;
		this.type = type;
		this.car = car;
		this.account = account;
		this.id = driverId++;
	}

	public String getName()
	{
		return this.name;
	}
    public void setName(String newName)
	{
		this.name = newName;
	}


	public Long getContact()
	{
		return this.contact;
	}
    public void setContact(Long newContact)
	{
		this.contact = newContact;
	}


	public String getType()
	{
		return this.type;
	}
   

	public String getCar()
	{
		return this.car;
	}
   

	public Long getAccount()
	{
		return this.account;
	}
    public void setAccount(Long newAccount)
	{
		this.account = newAccount;
	}


	public String getStatus()
	{
		return this.status;
	}
    public void setStatus(String newStatus)
	{
		this.status = newStatus;
	}


    public int getId()
	{
		return this.id;
	}

	public void displayCabDriver()
	{
		System.out.println();
		System.out.println("  ******* CAB DETAILS ********  ");
		System.out.println("Booking Id : " + this.id);
		System.out.println("Driver Name : " + this.getName());
		System.out.println("Type Of Car : " + this.getType());
		System.out.println("Status : " + this.getStatus());
	}

	public void displayCabDriverAfterBooking()
	{
		System.out.println();
		System.out.println("******* CAB DETAILS ********  ");
		System.out.println("Booking Id : " + this.id);
		System.out.println("Driver Name : " + this.getName());
		System.out.println("Driver Contact : " + this.getContact());
		System.out.println("Type Of Car : " + this.getType());
		System.out.println("Car Number : " + this.getCar());
		System.out.println("Account Number : " + this.getAccount());
		System.out.println("Status : " + this.getStatus());
	}
}

class Passenger
{
	String name; //get set
	String start; //get set
	String end; //get set
	Long contact; //get set
	int noPass; //get set

	Passenger(String name, String start, String end, Long contact, int noPass)
	{
		super();
		this.name = name;
		this.start = start;
		this.end = end;
		this.contact = contact;
		this.noPass = noPass;
	}

	public String getName()
	{
		return this.name;
	}
    public void setName(String newName)
	{
		this.name = newName;
	}


	public String getStart()
	{
		return this.start;
	}
    public void setStart(String newStart)
	{
		this.start = newStart;
	}

	public String getEnd()
	{
		return this.end;
	}
    public void setEnd(String newEnd)
	{
		this.end = newEnd;
	}

	public Long getContact()
	{
		return this.contact;
	}
    public void setContact(Long newContact)
	{
		this.contact = newContact;
	}

	public int getNoPass()
	{
		return this.noPass;
	}
    public void setNoPass(int newNoPass)
	{
		this.noPass = newNoPass;
	}
}

class QuickCabDriver
{
	static ArrayList<CabDriver> listCab = new ArrayList<>();

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		CabDriver obj1 = new CabDriver("Ramesh", 9876543210l, "Sedan", "MH12AA1234", 123412341234l);
		CabDriver obj2 = new CabDriver("Suresh", 8876543210l, "Hatch back", "MH12AA5678", 823412341234l);
		CabDriver obj3 = new CabDriver("Mahesh", 7876543210l, "SUV", "MH12AA3456", 523412341234l);
		CabDriver obj4 = new CabDriver("Ganesh", 6876543210l, "XUV", "MH12AA6789", 793412341234l);

		listCab.add(obj1);
		listCab.add(obj2);
		listCab.add(obj3);
		listCab.add(obj4);

		String start = null;
		String end = null;
		String name = null;
		Long contact = 0l;
		int noPass = 0;

		for(; ;)
		{
			System.out.println();
			System.out.println("WELCOME TO QUICK CAB");
			System.out.println();

			System.out.println("Book a Ride");
			System.out.print("Enter Your Name : ");
			name = sc.nextLine();

			System.out.print("Start Destination : ");
			start = sc.nextLine();

			System.out.print("End Destination : ");
			end = sc.nextLine();

			System.out.print("Contact : ");
			contact = sc.nextLong();

			System.out.print("No Of Passenger : ");
		    noPass = sc.nextInt();


		    Passenger pass = new Passenger(name, start, end, contact, noPass);
		    System.out.println();
		    for(CabDriver i : listCab)
		    {
		    	if(i.getStatus().equals("Available"))
		    	{
		    		i.displayCabDriver();
		    	}
		    }

		    System.out.println();
		    System.out.print("Enter The Booking Id : ");
		    int bookid = sc.nextInt();

		    for(CabDriver i : listCab)
		    {
		    	if(bookid == i.getId())
		    	{
		    		i.setStatus("Occupied");
		    		i.displayCabDriverAfterBooking();
		    		System.out.println();
		    		System.out.println("Your Ride Has Been Booked");
		    	}
		    }
		}
	}
}