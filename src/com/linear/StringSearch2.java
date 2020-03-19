/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linear;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author mamen
 */
public class StringSearch2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Mentari");
        list.add("Ando");
        list.add("Andi");
        list.add("Ferdinand");
        list.add("Terserah");

        List<String> result = list
                .stream()
                //inputan static & case sensitive
                .filter(x -> x.contains("and"))
                //kalau mau nyetak si Ferdinand berarti inputin "and" 
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
