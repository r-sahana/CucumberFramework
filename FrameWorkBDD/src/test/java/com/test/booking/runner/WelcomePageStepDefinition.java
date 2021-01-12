package com.test.booking.runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePageStepDefinition {

	@Given("User is in welcome page of Booking com")
	public void user_is_in_welcome_page_of_booking_com() {
		System.out.println("hello");
	}

	@When("user searches for a destination")
	public void user_searches_for_a_destination() {
		System.out.println("bye");
	}

	@Then("relevant destinations should be suggested")
	public void relevant_destinations_should_be_suggested() {
	}

}
