package Firefly.RegistrationWebsite.entity;

import java.util.Date;

public class Notepad {
    private Integer code;

    private String name;

    private String msg;

    private Integer islike;

    private Date date;

    private Integer likenum;

    private Integer dislikenum;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public Integer getIslike() {
        return islike;
    }

    public void setIslike(Integer islike) {
        this.islike = islike;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getDislikenum() {
        return dislikenum;
    }

    public void setDislikenum(Integer dislikenum) {
        this.dislikenum = dislikenum;
    }
}