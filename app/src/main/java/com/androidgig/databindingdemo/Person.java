package com.androidgig.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by RRR on 06-03-2016.
 */
public class Person extends BaseObservable
{
    private String firstName;
    private String lastName;
    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return this.firstName;
    }
    @Bindable
    public String getLastName() {
        return this.lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
        notifyPropertyChanged(com.androidgig.databindingdemo.BR.firstName);
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
        notifyPropertyChanged(com.androidgig.databindingdemo.BR.lastName);
    }
}
