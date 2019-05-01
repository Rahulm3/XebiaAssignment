package com.rahul.sample.xebia.models;

import java.util.List;

public class MediaItem{
	private String copyright;
	private List<MediaMetadataItem> mediaMetadata;
	private String subtype;
	private Object caption;
	private String type;
	private int approvedForSyndication;

	public void setCopyright(String copyright){
		this.copyright = copyright;
	}

	public String getCopyright(){
		return copyright;
	}

	public void setMediaMetadata(List<MediaMetadataItem> mediaMetadata){
		this.mediaMetadata = mediaMetadata;
	}

	public List<MediaMetadataItem> getMediaMetadata(){
		return mediaMetadata;
	}

	public void setSubtype(String subtype){
		this.subtype = subtype;
	}

	public String getSubtype(){
		return subtype;
	}

	public void setCaption(Object caption){
		this.caption = caption;
	}

	public Object getCaption(){
		return caption;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setApprovedForSyndication(int approvedForSyndication){
		this.approvedForSyndication = approvedForSyndication;
	}

	public int getApprovedForSyndication(){
		return approvedForSyndication;
	}

	@Override
 	public String toString(){
		return 
			"MediaItem{" + 
			"copyright = '" + copyright + '\'' + 
			",media-metadata = '" + mediaMetadata + '\'' + 
			",subtype = '" + subtype + '\'' + 
			",caption = '" + caption + '\'' + 
			",type = '" + type + '\'' + 
			",approved_for_syndication = '" + approvedForSyndication + '\'' + 
			"}";
		}
}