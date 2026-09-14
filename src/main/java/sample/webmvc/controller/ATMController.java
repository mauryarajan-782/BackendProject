package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import atm_management.ATM;

@Controller
public class ATMController {
	
	ATM atm = new ATM(1234, 10000);
	
	@RequestMapping("/atm")
	public String atm() {
		return "atm-login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("pin") int enteredPin, Model model) {
		
		if (atm.login(enteredPin)) {
			return "atm-menu";
		}else {
			model.addAttribute("message", "Wrong PIN!");
		}
		return "atm-login";
	}
	
	@RequestMapping("/balance")
	public String balance(Model model) {
		
		model.addAttribute("balance", atm.getBalance());
		
		return "atm-balance";
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.GET)
	public String showDeposit() {
	    return "atm-deposit";
	}
	
	@RequestMapping(value = "/depositMoney", method = RequestMethod.POST)
	public String depositMoney(@RequestParam("amount") double amount, Model model) {
		
		atm.depositMoney(amount);
		
		model.addAttribute("message", "Money deposited successfully!");
		model.addAttribute("balance", atm.getBalance());
		
		return "atm-menu";
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
	public String showWithdraw() {
	    return "atm-withdraw";
	}
	
	@RequestMapping(value = "/withdrawMoney", method = RequestMethod.POST)
	public String withdrawMoney(@RequestParam("amount") double amount, Model model) {

	    atm.withdrawMoney(amount);

	    model.addAttribute("balance", atm.getBalance());

	    return "atm-menu";
	}
	
	@RequestMapping(value = "/statement", method = RequestMethod.GET)
	public String statement(Model model) {

	    model.addAttribute("statement", atm.getStatement());

	    return "atm-statement";
	}
	
	@RequestMapping(value = "/changePin", method = RequestMethod.GET)
	public String showChangePin() {
	    return "atm-change-pin";
	}
	
	@RequestMapping(value = "/changePinProcess", method = RequestMethod.POST)
	public String changePinProcess(
	        @RequestParam("oldPin") int oldPin,
	        @RequestParam("newPin") int newPin,
	        Model model) {

	    atm.changePin(oldPin, newPin);

	    return "atm-menu";
	}
	
	@RequestMapping(value = "/exit", method = RequestMethod.GET)
	public String exit() {
	    return "atm-login";
	}
}
