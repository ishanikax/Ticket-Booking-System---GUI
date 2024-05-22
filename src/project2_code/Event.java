/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2_code;

/**
 *
 * @author Ishanika
 */
public class Event{
   
    private String loc = "";
    private String date = "";
    private String artistName = "";
    private String time = "";
    private double price = 0;
    private String genre = "";
    
    //the constructor for the event, all information needed for an event 
    public Event(String loc, String date, String artistName, String time, double price, String genre) {
        this.setLoc(loc);
        this.setDate(date);
        this.setArtistName(artistName);
        this.setTime(time);
        this.setPrice(price);
        this.setGenre(genre);
    }
    


    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @param artistName the artistName to set
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @return the artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }
}
