package pl.zagorski.model.rest.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultModeSearch {
    @SerializedName(value = "n_results")
    private int nResults;
    @SerializedName(value = "page_number")
    private int pageNumber;
    @SerializedName(value = "results_per_page")
    private int resultPerPage;
    @SerializedName(value = "n_pages")
    private int nPages;
    @SerializedName(value = "available_n_pages")
    private int availableNPages;
    private List<Word> results;

    public int getnResults() {
        return nResults;
    }

    public void setnResults(int nResults) {
        this.nResults = nResults;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getResultPerPage() {
        return resultPerPage;
    }

    public void setResultPerPage(int resultPerPage) {
        this.resultPerPage = resultPerPage;
    }

    public int getnPages() {
        return nPages;
    }

    public void setnPages(int nPages) {
        this.nPages = nPages;
    }

    public int getAvailableNPages() {
        return availableNPages;
    }

    public void setAvailableNPages(int availableNPages) {
        this.availableNPages = availableNPages;
    }

    public List<Word> getResults() {
        return results;
    }

    public void setResults(List<Word> results) {
        this.results = results;
    }
}
