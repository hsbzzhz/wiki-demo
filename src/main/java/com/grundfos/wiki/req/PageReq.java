package com.grundfos.wiki.req;

import org.apache.ibatis.annotations.Mapper;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class PageReq {
    @NotNull(message = "page is not null!")
    private int page;

    @NotNull(message = "size is not null!")
    @Max(value = 1000,message = "not over 1000!")
    private int size;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PageReq{");
        sb.append("page=").append(page);
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
