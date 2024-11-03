/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class SampleRecordAttribute {
    private String sampleRecordAttribute_type;
    private String sampleRecordAttribute_name;

    // Constructor
    public SampleRecordAttribute(String type, String name) {
        this.sampleRecordAttribute_type = type;
        this.sampleRecordAttribute_name = name;
    }

    // Thêm thuộc tính
    public void addAttribute() {
        // Logic thêm thuộc tính
    }

    // Xóa thuộc tính
    public void deleteAttribute() {
        // Logic xóa thuộc tính
    }

    // Lấy chi tiết thuộc tính
    public String getAttributeDetails() {
        return "Type: " + sampleRecordAttribute_type + ", Name: " + sampleRecordAttribute_name;
    }

    // Cập nhật thuộc tính
    public void updateAttribute(String name) {
        this.sampleRecordAttribute_name = name;
    }

    // Getter và Setter
    public String getAttributeType() {
        return sampleRecordAttribute_type;
    }

    public String getAttributeName() {
        return sampleRecordAttribute_name;
    }

    public void setAttributeName(String name) {
        this.sampleRecordAttribute_name = name;
    }
}
