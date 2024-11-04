package com.omr;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class A2 {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<A1> data;
	private C support;
}
