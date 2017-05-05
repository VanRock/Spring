package net.metrosystems.vvv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.metrosystems.vvv.model.Currency;

@RestController
public class CurrencyController {
	private static final String template = "From EUR in %s = %d!";

	private double total(double currencyAmount) {
		double value = 4.45;
		return currencyAmount * value;
	}

	@GetMapping("/convertTo")
	public String convertToRON(@RequestParam(value = "currencyAmount") float currencyAmount) {
		return String.format("From Euro in RON is %.2f", total(currencyAmount));
	}
}
