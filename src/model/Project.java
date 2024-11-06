/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    // Thuộc tính
    private int id;
    private String name;
    private Date startDate;
    private Date finishDate;
    private String description;
    private List<String> members;

    // Constructor
    public Project(int id, String name, Date startDate, Date finishDate, String description) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.description = description;
        this.members = new ArrayList<>();
    }

    // Phương thức tạo project
    public static Project createProject(int id, String name, Date startDate, Date finishDate, String description) {
        return new Project(id, name, startDate, finishDate, description);
    }

    // Phương thức cập nhật chi tiết project
    public void updateProjectDetails(String newName, Date newStartDate, Date newFinishDate, String newDescription) {
        this.name = newName;
        this.startDate = newStartDate;
        this.finishDate = newFinishDate;
        this.description = newDescription;
    }

    // Phương thức xóa project
    public void deleteProject() {
        this.id = 0;
        this.name = null;
        this.startDate = null;
        this.finishDate = null;
        this.description = null;
        this.members.clear();
    }

    // Phương thức thêm thành viên vào project
    public void addMemberToProject(String member) {
        if (!members.contains(member)) {
            members.add(member);
        }
    }

    // Phương thức xóa thành viên khỏi project
    public void removeMemberFromProject(String member) {
        members.remove(member);
    }

    // Các phương thức getter và setter cho các thuộc tính
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}

