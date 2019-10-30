package com.springreact.springreact.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
/**
 * 
 * @author GIGA-Money This is the car entity class.
 *
 */
public class CarEntity {
  /**
   * @id denotes the primary key.
   * @generatedValue denotes that the ID is automatically generated by the db. if we wanted to name
   *                 the column the @Column would be used, and the name, nullable, and length are
   *                 Defined as arguments.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String brand, model, color, regNum;
  private int year, price;

  public CarEntity(String brand, String model, String color, String regNum, int year, int price) {
    super();
    setBrand(brand);
    setModel(model);
    setColor(color);
    setRegNum(regNum);
    setYear(year);
    setPrice(price);
  }
  public CarEntity(String brand, String model,
      String color, String regNum, int year, int price, OwnerEntity owner) {
    super();
    setBrand(brand);
    setModel(model);
    setColor(color);
    setRegNum(regNum);
    setYear(year);
    setPrice(price);
  }

}
