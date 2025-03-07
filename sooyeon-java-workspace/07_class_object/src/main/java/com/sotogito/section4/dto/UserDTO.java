package com.sotogito.section4.dto;

public class UserDTO {
    private String id;
    private String pwd;
    private String name;

    public UserDTO() {
    }

    public UserDTO(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        return "ID"+id+"PW"+pwd+"name"+name;
    }


}
