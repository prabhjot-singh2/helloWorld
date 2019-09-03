package Examples;

import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

class person{
	
	private String name;
	private int age;
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class test1 {
	
	public static void main(String[] args) {
		
		
		String s1="a";
		String s2 ="a";
		
		int i1=1;
		int i2=2;
		
		Set<String> s = new HashSet<String>();
		
		s.add(s1);
		s.add(s2);
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
Set<person> se = new HashSet<person>();
		
		se.add(new person("abc",22));
		se.add(new person("abc",22));
		
		Iterator<person> itr1 = se.iterator();
		
		while(itr1.hasNext()){
			
			System.out.println(itr1.next());
		}
	}

}
