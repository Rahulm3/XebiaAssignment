package com.rahul.sample.xebia.models;

import java.util.List;

public class ResultsItem  {

	public String perFacet;
	private int emailCount;
	private int etaId;
	private String subsection;
	private String countType;
	private List<String> orgFacet;
	private Object column;
	private String nytdsection;
	private String section;
	private long assetId;
	private String jsonMemberAbstract;
	private String source;
	private List<MediaItem> media;
	private String type;


	public String title;
	private List<String> desFacet;
	private String uri;
	private String url;
	private String adx_keywords;
	private String geoFacet;
	private long id;
	private String byline;

	public String published_date;
	private String updated;

	public void setPerFacet(String perFacet){
		this.perFacet = perFacet;
	}

	public String getPerFacet(){
		return perFacet;
	}

	public void setEmailCount(int emailCount){
		this.emailCount = emailCount;
	}

	public int getEmailCount(){
		return emailCount;
	}

	public void setEtaId(int etaId){
		this.etaId = etaId;
	}

	public int getEtaId(){
		return etaId;
	}

	public void setSubsection(String subsection){
		this.subsection = subsection;
	}

	public String getSubsection(){
		return subsection;
	}

	public void setCountType(String countType){
		this.countType = countType;
	}

	public String getCountType(){
		return countType;
	}

	public void setOrgFacet(List<String> orgFacet){
		this.orgFacet = orgFacet;
	}

	public List<String> getOrgFacet(){
		return orgFacet;
	}

	public void setColumn(Object column){
		this.column = column;
	}

	public Object getColumn(){
		return column;
	}

	public void setNytdsection(String nytdsection){
		this.nytdsection = nytdsection;
	}

	public String getNytdsection(){
		return nytdsection;
	}

	public void setSection(String section){
		this.section = section;
	}

	public String getSection(){
		return section;
	}

	public void setAssetId(long assetId){
		this.assetId = assetId;
	}

	public long getAssetId(){
		return assetId;
	}

	public void setJsonMemberAbstract(String jsonMemberAbstract){
		this.jsonMemberAbstract = jsonMemberAbstract;
	}

	public String getJsonMemberAbstract(){
		return jsonMemberAbstract;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setMedia(List<MediaItem> media){
		this.media = media;
	}

	public List<MediaItem> getMedia(){
		return media;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDesFacet(List<String> desFacet){
		this.desFacet = desFacet;
	}

	public List<String> getDesFacet(){
		return desFacet;
	}

	public void setUri(String uri){
		this.uri = uri;
	}

	public String getUri(){
		return uri;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setAdxKeywords(String adxKeywords){
		this.adx_keywords = adxKeywords;
	}

	public String getAdxKeywords(){
		return adx_keywords;
	}

	public void setGeoFacet(String geoFacet){
		this.geoFacet = geoFacet;
	}

	public String getGeoFacet(){
		return geoFacet;
	}

	public void setId(long id){
		this.id = id;
	}

	public long getId(){
		return id;
	}

	public void setByline(String byline){
		this.byline = byline;
	}

	public String getByline(){
		return byline;
	}

	public void setPublishedDate(String publishedDate){
		this.published_date = publishedDate;
	}

	public String getPublishedDate(){
		return published_date;
	}

	public void setUpdated(String updated){
		this.updated = updated;
	}

	public String getUpdated(){
		return updated;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"per_facet = '" + perFacet + '\'' + 
			",email_count = '" + emailCount + '\'' + 
			",eta_id = '" + etaId + '\'' + 
			",subsection = '" + subsection + '\'' + 
			",count_type = '" + countType + '\'' + 
			",org_facet = '" + orgFacet + '\'' + 
			",column = '" + column + '\'' + 
			",nytdsection = '" + nytdsection + '\'' + 
			",section = '" + section + '\'' + 
			",asset_id = '" + assetId + '\'' + 
			",abstract = '" + jsonMemberAbstract + '\'' + 
			",source = '" + source + '\'' + 
			",media = '" + media + '\'' + 
			",type = '" + type + '\'' + 
			",title = '" + title + '\'' + 
			",des_facet = '" + desFacet + '\'' + 
			",uri = '" + uri + '\'' + 
			",url = '" + url + '\'' + 
			",adx_keywords = '" + adx_keywords + '\'' +
			",geo_facet = '" + geoFacet + '\'' + 
			",id = '" + id + '\'' + 
			",byline = '" + byline + '\'' + 
			",published_date = '" + published_date + '\'' +
			",updated = '" + updated + '\'' + 
			"}";
		}
}