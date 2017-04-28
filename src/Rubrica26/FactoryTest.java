package Rubrica26;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {

	List<Container> cont;
	Factory factoria;
	
	@Test
	public void createListTest() {
		factoria = new Factory();
		cont = new ArrayList<Container>();
		cont = factoria.createList();
		
		for (int i = 0; i < cont.size(); i++) {
			for (int j = i+1; j < cont.size(); j++) {
				assertTrue(cont.get(i) != cont.get(j));
			}
		}	
	}
}