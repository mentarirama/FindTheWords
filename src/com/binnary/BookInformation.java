/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binnary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author mamen
 */

/* Comparator adalah salah satu interface , 
di class library java (java.util), yang  mendefinisikan method .compare() secara default,
yang fungsinya digunakan untuk implementasi pengurutan data, 
dari perbandingan dua argument, untuk setiap objek dari class 
yang didefinisikan oleh user.
*/

public class BookInformation {
    public static void main(String[] args) {
    Comparator<Buku> comIdBuku =new Comparator<Buku>() {//  Comparator for to compare by IdBuku  		
	public int compare(Buku IdBuku1, Buku IdBuku2) {
        int a1=IdBuku1.getIdBuku();
        int a2=IdBuku2.getIdBuku();
    	if(a1>a2){
                return 1;
            }else {
                return -1;
            }
        }
};
    Comparator<Buku> comTitle =new Comparator<Buku>() {			
	public int compare(Buku Title1, Buku Title2) {
	String n1=Title1.getTitle();
	String n2=Title2.getTitle();
            return n1.compareTo(n2);			
        }
    };

    Scanner input=new Scanner (System.in);
    ArrayList<Buku>judul=new ArrayList<Buku>(); // Comparator for to compare by Title .    
    int IdBuku=0;
    boolean found =true;
    
    System.out.println("*****Empty Title will terminate this simple Programme*****");
    System.out.println("----------------------------------------------------");
    while(found!=false)
    {
	System.out.println("Enter your Title: ");
	String Title=input.nextLine();
	if(Title.isEmpty()) // if Title is empty then break
	{
		found=false;
		break;
	}
	System.out.print("Enter your IdBuku:  ");
	IdBuku=input.nextInt();
	judul.add(new Buku(Title,IdBuku));
	input.nextLine();
	
	}

        Collections.sort(judul,comTitle);

        System.out.println();
        
        System.out.println("**Printing all the records**");
            // for each loop to  print all the records 
            for(Buku d:judul){
                System.out.println("Title: "+ d.getTitle()+" ;"+ "IdBuku: "+d.getIdBuku());
            }
                System.out.println();// single empty line printing 
                System.out.println("*****After sorting*****");
	
	Collections.sort(judul,comIdBuku);// sort method to sort ArrayList 
             // for each loop  to print all records after  Collections.sort method
            for(Buku c:judul){
		System.out.println("Title: "+ c.getTitle()+" ;"+ "IdBuku: "+c.getIdBuku());
		}
                    System.out.println();
                    System.out.println("====Search Your Title By IdBuku :====");

		boolean flag=false;
		int search=0;
		System.out.println("Enter your IdBuku:");
		search=input.nextInt();
                
		// if judul Array is not Empty then  it will search
		if(!judul.isEmpty()) {
                    for(Buku e:judul){
                        if(e.getIdBuku()==search){
                            flag=true;
				System.out.println("Title:  " +e.getTitle() +"  , "+ "IdBuku: "+ e.getIdBuku());
			}
                    }
                     // flag is not true then Unknown Search Item
                    if(flag==false){
                        System.out.println("Unknkown  Search Item !! No record found in the Array !!");
                    }
		}else{
			System.out.println("Empty ! ");
		}
	}
}
