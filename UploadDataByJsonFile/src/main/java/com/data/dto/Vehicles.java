package com.data.dto;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class Vehicles{

	private long vehicleId;
	
	private String scraped_at_date;
	private int dom;
    private String stock_no;
    private boolean carfax_clean_title;
    private String source;
    private Media media;
    
    private String last_seen_at_date;
    private long price;
    private long msrp;
    private String seller_type;
    private String vin;
    private long ref_price;
    private String id;
    private String interior_color;
    private String first_seen_at_date;
    private String heading;
    private String ref_price_dt;
    private String vdp_url;
    private long dom_180;
    private long first_seen_at;
    private String data_source;
    private boolean carfax_1_owner;
    private String exterior_color;
    private Build build;
    private long scraped_at;
    private int dom_active;
    private String ref_miles_dt;
    private List<FinancingOption> financing_options;
    
    private Dealer dealer;
    
    private String inventory_type;
    private long last_seen_at;
    private String ref_miles;
    private String miles;
    private int is_certified;
	public Vehicles(String scraped_at_date, int dom, String stock_no, boolean carfax_clean_title, String source,
			Media media, String last_seen_at_date, long price, long msrp, String seller_type, String vin,
			long ref_price, String id, String interior_color, String first_seen_at_date, String heading,
			String ref_price_dt, String vdp_url, long dom_180, long first_seen_at, String data_source,
			boolean carfax_1_owner, String exterior_color, Build build, long scraped_at, int dom_active,
			List<FinancingOption> financing_options, Dealer dealer, String inventory_type, long last_seen_at,
			String refMilesDt, String refMiles, String miles, int is_certified) {
		super();
		this.scraped_at_date = scraped_at_date;
		this.dom = dom;
		this.stock_no = stock_no;
		this.carfax_clean_title = carfax_clean_title;
		this.source = source;
		this.media = media;
		this.last_seen_at_date = last_seen_at_date;
		this.price = price;
		this.msrp = msrp;
		this.seller_type = seller_type;
		this.vin = vin;
		this.ref_price = ref_price;
		this.id = id;
		this.interior_color = interior_color;
		this.first_seen_at_date = first_seen_at_date;
		this.heading = heading;
		this.ref_price_dt = ref_price_dt;
		this.vdp_url = vdp_url;
		this.dom_180 = dom_180;
		this.first_seen_at = first_seen_at;
		this.data_source = data_source;
		this.carfax_1_owner = carfax_1_owner;
		this.exterior_color = exterior_color;
		this.build = build;
		this.scraped_at = scraped_at;
		this.dom_active = dom_active;
		this.financing_options = financing_options;
		this.dealer = dealer;
		this.inventory_type = inventory_type;
		this.last_seen_at = last_seen_at;
		this.ref_miles_dt=refMilesDt;
		this.ref_miles=refMiles;
		this.miles=miles;
		this.is_certified=is_certified;
	}    
}
