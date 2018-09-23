package com.example.joel_.studentportal;

public class Portal {

    private String mLinkUrl;
    private String mLinkName;


    public Portal(String mLinkUrl, String mLinkName)
    {
        this.mLinkUrl = mLinkUrl;
        this.mLinkName = mLinkName;
    }

    //Getters
    public String getmLinkUrl()
    {
        return mLinkUrl;
    }

    public String getmLinkName()
    {
        return mLinkName;
    }

    //Setters
    public void setmLinkUrl(String mLinkUrl)
    {
        this.mLinkUrl = mLinkUrl;
    }
    public void setmLinkName(String mLinkName)
    {
        this.mLinkName = mLinkName;
    }

}
