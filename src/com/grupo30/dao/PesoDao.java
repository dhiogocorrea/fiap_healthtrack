package com.grupo30.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.grupo30.model.Peso;

public class PesoDao implements Dao<Peso> {

	@Override
	public Peso get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Peso> getAll() {
		Calendar c = Calendar.getInstance();
		
		List<Peso> mockPeso = new ArrayList<Peso>();

		c.set(2020, 9, 1, 0, 0);  
		mockPeso.add(new Peso(1, 70.0, c.getTime()));
		c.set(2020, 9, 5, 0, 0);  
		mockPeso.add(new Peso(2, 72.0, c.getTime()));
		c.set(2020, 9, 10, 0, 0);  
		mockPeso.add(new Peso(3, 71.6, c.getTime()));
		c.set(2020, 9, 15, 0, 0);  
		mockPeso.add(new Peso(4, 70.2, c.getTime()));
		c.set(2020, 9, 17, 0, 0);  
		mockPeso.add(new Peso(5, 69.8, c.getTime()));
		c.set(2020, 9, 20, 0, 0);  
		mockPeso.add(new Peso(6, 69.8, c.getTime()));
		c.set(2020, 9, 22, 0, 0);  
		mockPeso.add(new Peso(7, 69.9, c.getTime()));
		c.set(2020, 9, 24, 0, 0);  
		mockPeso.add(new Peso(8, 68.7, c.getTime()));
		c.set(2020, 9, 29, 0, 0);  
		mockPeso.add(new Peso(9, 68.5, c.getTime()));
		c.set(2020, 10, 1, 0, 0);  
		mockPeso.add(new Peso(10, 67.3, c.getTime()));
		
		return mockPeso;
	}

	@Override
	public void save(Peso t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Peso t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Peso t) {
		// TODO Auto-generated method stub
		
	}

}
