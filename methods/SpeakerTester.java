package com.Xworkz.methods;

import com.Xworkz.methods.music.Speaker;

public class SpeakerTester {
public static void main(String[] args) {
		
		Speaker speaker=new Speaker("blue",6);
		System.out.println(speaker.getBrand());
		System.out.println(speaker.isConnectivity());
		
		speaker.onOrOff();
		
		
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		speaker.volumeTurned();
		
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
		speaker.volumeDecrease();
	}

}
