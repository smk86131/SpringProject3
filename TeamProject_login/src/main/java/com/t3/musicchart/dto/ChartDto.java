package com.t3.musicchart.dto;

public class ChartDto {
	private int idx;
	private String artist;
	private String songName;
	private int soundSource;
	private int onAir;
	private int total;
	
	@Override
	public String toString() {
		return "ChartDto [idx=" + idx + ", artist=" + artist + ", songName=" + songName + ", soundSource=" + soundSource
				+ ", onAir=" + onAir + ", total=" + total + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public int getSoundSource() {
		return soundSource;
	}
	public void setSoundSource(int soundSource) {
		this.soundSource = soundSource;
	}
	public int getOnAir() {
		return onAir;
	}
	public void setOnAir(int onAir) {
		this.onAir = onAir;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
