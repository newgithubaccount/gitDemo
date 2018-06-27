package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	ArrayList<String> data=new ArrayList<String>();
	ArrayList<String> data1=new ArrayList<String>();
	public void addData()
	{
		
		data.add("Monika");
		data.add("Sunitha");
		data.add("Swapna");	
		data1.add("new word");
		data1.add("first word");
	}
	
	public void readData()
	{
		System.out.println(data.get(1));
	}
	
	public void readAll()
	{
		for(int i=0;i<data.size();++i)
			System.out.println(data.get(i));
		
		System.out.println("for each type");
		
		for(String str:data)
			System.out.println(str);
	}


	public void allmethods()
	{
		System.out.println(data.containsAll(data1));
		data.addAll(data1);
		System.out.println(data.containsAll(data1));
		data.removeAll(data1);
		System.out.println(data.containsAll(data1));
		
		
	}
	
	public void removedata()
	{
		data.remove(0);
	}
	public void readItr()
	{
		Iterator<String> itr=data.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo demo=new ArrayListDemo();
		demo.addData();
		demo.allmethods();
		demo.removedata();
		demo.readAll();
		System.out.println("-------------------");
		demo.readItr();
	}

}
