package com.ms.newproject;

import com.ms.newproject.Models.NewsHeadLine;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadLine> list, String message);
    void onError(String message);
}
