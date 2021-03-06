import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Person{
    private String name;
    private int height;
    private double weight;
    
    public Person(String a,int b, double c)
    {
    	this.name=a;
    	this.height=b;
    	this.weight=c;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double getWeight()
    {
    	return weight;
    }
    public void setWeight(double weight)
    {
    	this.weight=weight;
    }
    public String toString(){
        return "Name: "+this.name+"-- Height: "+this.height+"-- Weight: "+this.weight;
    }
}

class WeightComp implements Comparator<Person>{
	 
    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getWeight() < p2.getWeight()){
            return 1;
        } 
        if(p1.getWeight()==p2.getWeight())
        {
        	if(p1.getHeight()<p2.getHeight())
        	{
        		return 1;
        	}
        	else
        	{
        		return -1;
        	}
        }
        else 
        {
            return -1;
        }
    }
}
    
public class A3Q1 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	TreeSet<Person> person = new TreeSet<Person>(new WeightComp());
    	person.add(new Person("Shyam",182,82));
    	person.add(new Person("Raj",172,72));
    	person.add(new Person("Navin",162,70));
    	person.add(new Person("Navi",167,83));
    	person.add(new Person("Sameer",184,56));
    	
    	for(Person p:person){
            System.out.println(p);
        }
    }
}