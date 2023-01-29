package onlineclasses;

import java.util.ArrayList;
public class BabyProducts {

	public static void main(String[]args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Baby Mat");
		al.add("Baby Lotion");
		al.add("Feeding Bottle");
		al.add("Milk Powder");
		al.add("Baby Cot");
		al.add("Bathing Oil");
		al.add("Diapers");
		al.add("Baby Soap");
		al.add("Bed Sheets");
		al.add("Toys");
		al.add("Baby Powder");
		al.add("Towels");
		al.add("Newborn Onesies");
		al.add("Baby Cradles");
		al.add("Baby Conch");
		System.out.println("We have "+al.size()+" " +"Baby products");
		for(int i=0;i<al.size();i++)
		{
			System.out.println((i+1)+"-"+al.get(i));
		}
	}
		
           
           
	}


