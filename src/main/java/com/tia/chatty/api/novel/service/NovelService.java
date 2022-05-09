package com.tia.chatty.api.novel.service;

import com.github.pagehelper.Page;
import com.tia.chatty.api.common.util.CHMap;
import com.tia.chatty.api.novel.model.Novel;
import com.tia.chatty.api.novel.model.NovelReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovelService {

    @Autowired
    NovelServiceImpl nm;

    public Page<CHMap> listBy(NovelReq nr){
        return nm.listBy(nr);
    }

    public Page<CHMap> listChapterBy(NovelReq nr) { return nm.listChapterBy(nr); }

    public CHMap itemBy(NovelReq nr) { return nm.itemBy(nr); }

    public void insertNovel(Novel n){
        nm.insertNovel(n);
    }

    public void updateNovel(Novel n){
        nm.updateNovel(n);
    }

}
