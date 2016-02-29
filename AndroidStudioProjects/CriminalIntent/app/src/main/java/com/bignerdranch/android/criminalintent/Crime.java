package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getID() {
        return mID;
    }

    public String getDate() {
       String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.ENGLISH).format(mDate.getTime());
        return date;        // Returns a string of the date
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }       // Returns whether the crime is solved

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
