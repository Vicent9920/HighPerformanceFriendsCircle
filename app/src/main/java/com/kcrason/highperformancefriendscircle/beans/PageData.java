package com.kcrason.highperformancefriendscircle.beans;

import java.util.List;

/**
 * 创建日期：2018/9/21 0021on 上午 9:10
 * 描述：
 *
 * @author Vincent
 * QQ：3332168769
 * 备注：
 */
public class PageData<T> {

    /**
     * page : 1
     * size : 10
     * prevPage : 1
     * nextPage : 1
     * currentPageElements : 2
     * totalPage : 1
     * totalElements : 2
     * sort : {"property":"id","direction":"ASC"}
     * content : []
     * lastPage : true
     * firstPage : true
     */

    private int page;
    private int size;
    private int prevPage;
    private int nextPage;
    private int currentPageElements;
    private int totalPage;
    private int totalElements;
    private SortBean sort;
    private boolean lastPage;
    private boolean firstPage;
    private List<T> content;

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

    public int getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(int prevPage) {
        this.prevPage = prevPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getCurrentPageElements() {
        return currentPageElements;
    }

    public void setCurrentPageElements(int currentPageElements) {
        this.currentPageElements = currentPageElements;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public SortBean getSort() {
        return sort;
    }

    public void setSort(SortBean sort) {
        this.sort = sort;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public boolean isFirstPage() {
        return firstPage;
    }

    public void setFirstPage(boolean firstPage) {
        this.firstPage = firstPage;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public static class SortBean {
        /**
         * property : id
         * direction : ASC
         */

        private String property;
        private String direction;

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        public String getDirection() {
            return direction;
        }

        public void setDirection(String direction) {
            this.direction = direction;
        }
    }
}
