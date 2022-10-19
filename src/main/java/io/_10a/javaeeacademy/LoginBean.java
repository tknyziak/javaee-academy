package io._10a.javaeeacademy;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@ViewScoped
public class LoginBean implements Serializable {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	private String login;
	private String password;

	private int count;

	public LoginBean() {
		logger.info("Constructed instance: {}", this);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String takeAction() {

		logger.info("Action taken in instance: {}, login: {}, password: {}", this, login, password);
		count ++;

		if ("sezamie".equals(login) && "dupa".equals(password)) {
			return "success?faces-redirect=true";
		}

		return null;

	}

}
