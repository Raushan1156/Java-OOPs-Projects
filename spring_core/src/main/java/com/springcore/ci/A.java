package com.springcore.ci;

import java.util.*;
import java.util.Set;

public class A {
	private String name;
	private String usn;
	private B colg;
	private List<Integer> marks;
	private Set<String> subjects;
	private Properties sub_name;
	
//	public void A(String name,String usn,B colg)
//	{
//		this.name=name;
//		this.usn=usn;
//		this.colg=colg;
//	}
	public A(String name, String usn, B colg,List<Integer> marks,Set<String> subjects,Properties sub_name) {
		super();
		this.name = name;
		this.usn = usn;
		this.colg = colg;
		this.marks=marks;
		this.subjects=subjects;
		this.sub_name=sub_name;
		System.out.println("Type of name is "+((Object)name).getClass().getSimpleName());
		System.out.println("Type of name is "+((Object)usn).getClass().getSimpleName());
		System.out.println("Type of subject is "+((Object)marks).getClass().getSimpleName());
		System.out.println("Type of subject is "+((Object)sub_name).getClass().getSimpleName());
	}
	@Override
	public String toString() {
		return "<Name:> "+this.name+"\n"+"<USN> "+this.usn+"\n"+"<College-name> "+this.colg.College+"\n"+"<Marks:>"+this.marks+"\n"+"<Subjects:>"+this.subjects+"\n"+"<Subject code and names:>"+this.sub_name;
	}
}