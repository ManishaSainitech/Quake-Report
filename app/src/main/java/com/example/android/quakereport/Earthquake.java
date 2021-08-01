package com.example.android.quakereport;

public class Earthquake {


    //mag
    private Double mMagnitude;


    //loc
    private String mLocation;


    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;





    /**
     * Constructs a new {@link Earthquake} object.
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * @param url
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }


    //return mag
    public Double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the time of the earthquake.
     */
    //return loc
    public String getmLocation() {
        return mLocation;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
