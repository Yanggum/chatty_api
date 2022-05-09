package com.tia.chatty.api.novel.service;

import com.github.pagehelper.Page;
import com.tia.chatty.api.common.util.CHMap;
import com.tia.chatty.api.novel.model.Novel;
import com.tia.chatty.api.novel.model.NovelReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NovelServiceImpl {

    public Page<CHMap> listBy(NovelReq nr);

    public Page<CHMap> listChapterBy(NovelReq nr);

    public CHMap itemBy(NovelReq nr);

    public void insertNovel(Novel n);

    public void updateNovel(Novel n);
}