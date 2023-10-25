package com.bw.petclinic.vet.domain;

import java.util.List;

/**
 * Wrapper class to wrap a Page of Vets.
 */
public class PagedVets {

    private List<Vet> vets;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalVets;

    public PagedVets(List<Vet> vets, int pageNumber, int pageSize, int totalPages, long totalVets) {
        this.vets = vets;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalVets = totalVets;
    }

    public List<Vet> getVets() {
        return vets;
    }

    public void setVets(List<Vet> vets) {
        this.vets = vets;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalVets() {
        return totalVets;
    }

    public void setTotalVets(long totalVets) {
        this.totalVets = totalVets;
    }

    @Override
    public String toString() {
        return "PagedVets{" +
                "vets=" + vets +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", totalVets=" + totalVets +
                '}';
    }
}
