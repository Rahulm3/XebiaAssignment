package com.rahul.sample.xebia.models;

import java.util.ArrayList;

public class NyResponse {
	private String copyright;
	private ArrayList<ResultsItem> results;
	private int numResults;
	private String status;

	public void setCopyright(String copyright){
		this.copyright = copyright;
	}

	public String getCopyright(){
		return copyright;
	}

	public void setResults(ArrayList<ResultsItem> results){
		this.results = results;
	}

	public ArrayList<ResultsItem> getResults(){
		return results;
	}

	public void setNumResults(int numResults){
		this.numResults = numResults;
	}

	public int getNumResults(){
		return numResults;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"NyResponse{" +
			"copyright = '" + copyright + '\'' + 
			",results = '" + results + '\'' + 
			",num_results = '" + numResults + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}