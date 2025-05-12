/**
 * 
 */
package main;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author NGUYEN THI LANG
 *
 */
public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<String> stackChuoi = new Stack<String>();
	
	//stackChuoi.push("giatri"): dua giatri vao stach
	//stackChuoi.pop(): lay giatri ra, xoa khoi stack
	//stackChuoi.peek(): lay giatri ra, khong xoa khoi stack 
	//stackChuoi.clear(): xoa tat ca phan tu trong stack
	//stackChuoi.contains("giatri"): xac dinh xem co giatri do trong stack hay khong
	//stackChuoi.size(): do lon stack
	
	
	//Vd chuoi dao nguoc:
	System.out.println("Nhap vao chuoi: ");
	String s = sc.nextLine();
	for (int i=0; i<s.length(); i++) {
		stackChuoi.push(s.charAt(i)+"");
	}
	System.out.println("Chuoi dao nguoc: ");
	for (int i=0; i<s.length(); i++) {
		System.out.print(stackChuoi.pop());
	}
	System.out.println();
	//Vd chuyen tu he thap phan sang he nhi phan
	Stack<String> stackSoDu = new Stack<String>();
	System.out.println("Nhap 1 so tu ban phim");
	int x = sc.nextInt();
	while(x>0) {
		int soDu = x%2;
		System.out.println(soDu);
		stackSoDu.push(soDu+"");
		x = x/2;
	}
	
	System.out.println("So nhi phan la:");
	int n = stackSoDu.size();
	for(int i=0; i<n; i++) {
		System.out.print(stackSoDu.pop());
		
	}
	
}
}
