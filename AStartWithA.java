package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AStartWithA {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("anusha");
		names.add("divya");
		names.add("sri");
		
		
	names.stream().filter(name->name.startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);
	}

}
