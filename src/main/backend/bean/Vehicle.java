package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by shian_mac on 8/4/15.
 */
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String vin;
    private String consignmentID;
    private String color;
    private Integer saleYear;
    private Integer saleWeek;
    private Integer lane;
    private Integer run;
    private Date transactionTimeStamp;
    private String make;
    private String odometerReading;
    private String odometerReadingUnit;
    private String model;

    private String trim;
    private String year;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getConsignmentID() {
        return consignmentID;
    }

    public void setConsignmentID(String consignmentID) {
        this.consignmentID = consignmentID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSaleYear() {
        return saleYear;
    }

    public void setSaleYear(Integer saleYear) {
        this.saleYear = saleYear;
    }

    public Integer getSaleWeek() {
        return saleWeek;
    }

    public void setSaleWeek(Integer saleWeek) {
        this.saleWeek = saleWeek;
    }

    public Integer getLane() {
        return lane;
    }

    public void setLane(Integer lane) {
        this.lane = lane;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public Date getTransactionTimeStamp() {
        return transactionTimeStamp;
    }

    public void setTransactionTimeStamp(Date transactionTimeStamp) {
        this.transactionTimeStamp = transactionTimeStamp;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(String odometerReading) {
        this.odometerReading = odometerReading;
    }

    public String getOdometerReadingUnit() {
        return odometerReadingUnit;
    }

    public void setOdometerReadingUnit(String odometerReadingUnit) {
        this.odometerReadingUnit = odometerReadingUnit;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

