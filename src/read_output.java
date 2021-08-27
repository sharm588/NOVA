package com.company;
import java.io.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.io.BufferedReader;
import java.io.FileReader;
class test {
	public static void main(String args[]) throws IOException {
		System.out.println(getOutput());
	}
	public static String getOutput() throws IOException {
		FileReader reader = new FileReader("../sexData.txt");

		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		String output = line.substring(line.indexOf("n is") + 5, line.length() - 1);
		return output;
	}
}
