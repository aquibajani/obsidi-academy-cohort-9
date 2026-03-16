package com.bptn.course._08_smart_home_devices;

//Controllable.java - The "Can Change Settings" contract
public interface Controllable {
 void changeSetting(String settingName, String value); // Anyone implementing this MUST provide this method
}
