package com.interview.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UST {

	public static void main(String[] args) {
		List<FolksList> folks = new ArrayList<>();
		int id =8;

		boolean isFolkAvailable = false;

		for(int i = 0; i < folks.size(); i++)
		{
			FolksList folk = folks.get(i);
		    
		    if(folk.getId() == id)
		    {
		        isFolkAvailable = true;
		        break;    
		    }
		}
		folks.stream().map(x->x.getId()==id? true: false).collect(Collectors.toList());
		folks.stream().filter(x->x.getId()==id? true: false).collect(Collectors.toList());

	}

}
class FolksList{
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int id;
	private String name;
}