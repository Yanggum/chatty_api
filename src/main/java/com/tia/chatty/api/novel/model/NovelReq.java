package com.tia.chatty.api.novel.model;

import lombok.Data;

@Data
public class NovelReq {
    public String novelNo;
    public String title;
    public String regId;
    public String regDt;
    public String updId;
    public String updDt;
}
