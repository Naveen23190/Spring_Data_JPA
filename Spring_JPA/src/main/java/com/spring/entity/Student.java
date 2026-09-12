package com.spring.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Entity
public class Student 
{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String name;
   private int age;
   @CreationTimestamp
   private LocalDateTime createdAt;
//   @Transient
//   private String state; // This data will not be stored in DB
   public long getId() {
	return id;
   }
   public void setId(long id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getAge() {
	return age;
   }
   public void setAge(int age) {
	this.age = age;
   }
   public LocalDateTime getCreatedAt() {
	return createdAt;
   }
   public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
   }
   @Override
   public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", createdAt=" + createdAt + "]";
   }
   
   
   
   
   
}
