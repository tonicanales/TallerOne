package com.taller.main;

import java.util.ArrayList;

public class ListGeometry {
	
	
	private ArrayList<Geometry> list;
	
	
	
	public ListGeometry() {
		this.list = new ArrayList<>();
	}

	public void add(Geometry item){
		
		list.add(item);
	}

	public void remove(Geometry item){
		
		
	}
	
	public Geometry get(int index){
		
		return null;
	}
	
	public int size(){
		
		return 0;
	}
	
	
	/**
	 *  
	 */
	
	public ArrayList<Geometry> sortByArea(){
		
		ArrayList<Geometry> ordenada = new ArrayList<>();
		ordenada.addAll(list);
		
		for(int i=0;i<(list.size()-1);i++){
            for(int j=i+1;j<list.size();j++){
                if(ordenada.get(i).computeArea()<ordenada.get(j).computeArea()){
                    //Intercambiamos valores
                    Geometry variableauxiliar=ordenada.get(i);
                    ordenada.set(i, ordenada.get(j));
                    ordenada.set(j, variableauxiliar);
 
                }
            }
        }
			
		return ordenada;
	}
	
	public ArrayList<Geometry> sortByPerimetro(){
		
		ArrayList<Geometry> ordenada = new ArrayList<>();
		ordenada.addAll(list);
		
		for(int i=0;i<(list.size()-1);i++){
            for(int j=i+1;j<list.size();j++){
                if(ordenada.get(i).computePerimetro()<ordenada.get(j).computePerimetro()){
                    //Intercambiamos valores
                    Geometry variableauxiliar=ordenada.get(i);
                    ordenada.set(i, ordenada.get(j));
                    ordenada.set(j, variableauxiliar);
 
                }
            }
        }
			
		return ordenada;
	}
	
	public ArrayList<Geometry> sortBySize(){
		
		return null;
	}
	
}
