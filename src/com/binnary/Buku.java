/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binnary;

/**
 *
 * @author mamen
 */
public class Buku {
        private String Title;
	private int IdBuku;

	public Buku(String Title,int IdBuku) {
		this.Title=Title;
		this.IdBuku=IdBuku;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public int getIdBuku() {
		return IdBuku;
	}

	public void setIdBuku(int IdBuku) {
		this.IdBuku = IdBuku;
	}

	@Override
	public String toString() {
		return "Person [Title=" + Title + ", IdBuku=" + IdBuku + "]";
	}
	
    
}
