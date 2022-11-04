package com.gzeinnumer.recyclerviewinfinitecachev2.adapter;

public interface BaseCallBackAdapter<T> {
    void onClick(int type, int position, T data);
}