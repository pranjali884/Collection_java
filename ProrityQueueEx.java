package collection;



import java.util.Objects;
import java.util.PriorityQueue;

class Employee implements Comparable < Employee >
{
    private String name;
    private double salary;

    public Employee (String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public Employee ()
    {
       
    }
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public double getSalary ()
    {
        return salary;
    }

    public void setSalary (double salary)
    {
        this.salary = salary;
    }

   
   /* @Override public int hashCode ()
    {
        return Objects.hash (name, salary);
    }*/

    @Override public String toString ()
    {
        return "Employee{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }

	/*@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}*/

    // Compare two employee objects by their salary
    @Override public int compareTo (Employee employee)
    {
        if (this.getSalary () > employee.getSalary ())
        {
            return 1;
        }
        else if (this.getSalary () < employee.getSalary ())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

public class ProrityQueueEx
{
    public static void main (String[]args)
    {
        // Create a PriorityQueue
        PriorityQueue < Employee > employeePriorityQueue = new PriorityQueue <> ();

        // Add items to the Priority Queue
        Employee e=new Employee();
        e.setName("Pranjali");
        e.setSalary(23456);
        
        employeePriorityQueue.add(e);
        employeePriorityQueue.add (new Employee ("Rajeev", 100000.00));
        employeePriorityQueue.add (new Employee ("Chris", 147000.00));
        employeePriorityQueue.add (new Employee ("Andrea", 115000.00));
        employeePriorityQueue.add (new Employee ("Jack", 137000.00));

        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
        while (!employeePriorityQueue.isEmpty ())
        {
            System.out.println (employeePriorityQueue.remove ());
        }
    }
}
