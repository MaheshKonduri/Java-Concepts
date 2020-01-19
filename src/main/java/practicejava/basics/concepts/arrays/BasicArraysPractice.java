package practicejava.basics.concepts.arrays;

public class BasicArraysPractice {

	public void arrayTestmodel1() {
		System.out.println("Started BasicArraysPractice arrayTestmodel1 : ");

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Values displying based on index : ");

		System.out.print(a[0]);
		System.out.print(a[1]);
		System.out.print(a[2]);
		System.out.print(a[3]);
		System.out.print(a[4]);
		System.out.print(a[5]);
		System.out.print(a[6]);
		System.out.print(a[7]);

		System.out.println("Values displying based on index using for loop : ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]);
		}
		System.out.println("Values displying based on index using for each : ");
		for (int aa : a) {

			System.out.print(aa);
		}
		BasicArraysPractice basicArraysPractice = new BasicArraysPractice();
		basicArraysPractice.arrayTestmodel2();
	}

	public void arrayTestmodel2() {
		System.out.println("Started BasicArraysPractice arrayTestmodel2 : ");

		int[] a = new int[5];
		a[0] = 70;
		a[1] = 10;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
		for (int aa : a) {
			System.out.print(aa);
		}
		BasicArraysPractice basicArraysPractice = new BasicArraysPractice();
		basicArraysPractice.employeeDetails();
	}

	public void employeeDetails() {
		System.out.println("Started BasicArraysPractice employeeDetails : ");

		EmployeeData e1 = new EmployeeData(1212, "Mahesh");
		EmployeeData e2 = new EmployeeData(1313, "Karthik");
		EmployeeData e3 = new EmployeeData(1414, "Chinnu");
		EmployeeData e4 = new EmployeeData(1515, "Ram");
		EmployeeData e5 = new EmployeeData(1616, "Madhu");
		EmployeeData[] employeeData = new EmployeeData[5];
		employeeData[0] = e1;
		employeeData[1] = e2;
		employeeData[2] = e3;
		employeeData[3] = e4;
		employeeData[4] = e5;
		System.out.println("Started EmployeeData :");
		for (EmployeeData ee : employeeData) {

			System.out.println("Value of employee is :" + "---->" + ee.number + "--->" + ee.name);

		}

	}

}
