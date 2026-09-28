package com.eventmate.model;
import jakarta.persistence.*;
@Entity
public class Booking {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String customerName, phone, email, eventDate, bookingType, address;
 private Long materialId;
 private Integer quantity;
 public Long getId(){return id;} public String getCustomerName(){return customerName;}
 public void setCustomerName(String v){customerName=v;} public String getPhone(){return phone;}
 public void setPhone(String v){phone=v;} public String getEmail(){return email;}
 public void setEmail(String v){email=v;} public Long getMaterialId(){return materialId;}
 public void setMaterialId(Long v){materialId=v;} public Integer getQuantity(){return quantity;}
 public void setQuantity(Integer v){quantity=v;} public String getEventDate(){return eventDate;}
 public void setEventDate(String v){eventDate=v;} public String getBookingType(){return bookingType;}
 public void setBookingType(String v){bookingType=v;} public String getAddress(){return address;}
 public void setAddress(String v){address=v;}
}