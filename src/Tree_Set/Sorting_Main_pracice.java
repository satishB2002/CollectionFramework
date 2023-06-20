package Tree_Set;

import java.util.HashSet;
import java.util.TreeSet;

import javax.sound.midi.Track;

import Weekly_test_14_feb.newthread;

public class Sorting_Main_pracice {
public static void main(String[] args) {
	HashSet<Sorting_Practice> hs	=new	HashSet();
	
	hs.add(new Sorting_Practice(45, "QSDF", 97000.0)) ;
	hs.add(new Sorting_Practice(15, "JSDA", 51000.0)) ;
	hs.add(new Sorting_Practice(35, "LSDF", 81000.0)) ;
	System.out.println(hs);
	TreeSet<Sorting_Practice> ts= new	TreeSet<>(hs);
	System.out.println("TreeSet ="+ts);
	System.out.println("Using ForEachLoop");
	for (Sorting_Practice a : ts) {
		System.out.println(a);
		
	}
}
}
