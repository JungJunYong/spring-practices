package com.douzone.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public DVDPlayer() {
		
	};
	
	
	public DigitalVideoDisc getDvd() {
		return dvd;
	}

	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void play() {
		dvd.play();
	}

}
