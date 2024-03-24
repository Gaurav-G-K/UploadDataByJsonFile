package com.data.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Media {
	


    private List<String> photo_links;

	public Media(List<String> photo_links) {
		super();
		this.photo_links = photo_links;
	}

    
}
