package com.bptn.course._08_smart_home_devices;

//Dimmable.java - The "Can Dim" contract
public interface Dimmable {
 void dim(int level); // Anyone implementing this MUST provide this method (e.g., 0-100%)
}