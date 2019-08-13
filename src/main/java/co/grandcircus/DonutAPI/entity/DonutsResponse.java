package co.grandcircus.DonutAPI.entity;

import java.util.ArrayList;
import java.util.List;

public class DonutsResponse {

	private List<Results> results;

	public List<Results> getResults() {
		return results;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "DonutsResponse [results=" + results + "]";
	}

}
