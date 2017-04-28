package Rubrica26;

import java.util.ArrayList;
import java.util.List;

public class Factory {
	
	List<Container> contenedor;

	public Factory(){
	}
	
	public List<Container> createList(){
		
		contenedor = new ArrayList<Container>();
		for (int i = 0; i < 5; i++) {
			contenedor.add(new Container());
		}
		
	return contenedor;
	}
}