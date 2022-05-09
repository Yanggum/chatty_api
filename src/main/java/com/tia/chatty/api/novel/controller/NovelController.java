package com.tia.chatty.api.novel.controller;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.tia.chatty.api.common.util.CHMap;
import com.tia.chatty.api.novel.model.NovelReq;
import com.tia.chatty.api.novel.service.NovelService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/nv")
public class NovelController {
    final int pageSize = 10;

    @Autowired
    NovelService ns;

    @PostMapping(value="/get-novel-list")
    public String getNovelList() throws Exception {
        NovelReq   list        = new NovelReq();
        JsonObject result      = new JsonObject();
        Gson       gson        = new Gson();

        // populate your list
        JsonElement element = gson.toJsonTree(ns.listBy(list), new TypeToken<List<CHMap>>() {}.getType());

        if (!element.isJsonArray()) {
            throw new Exception();
        }

        JsonArray jsonArray = element.getAsJsonArray();

        result.add("novelList", jsonArray);
        result.addProperty("respCode", "00000");
        result.addProperty("respMsg", "성공");

        return gson.toJson(result).toString();
    }
}
