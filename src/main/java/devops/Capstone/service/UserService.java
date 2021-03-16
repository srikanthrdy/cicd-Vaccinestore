package devops.Capstone.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import devops.Capstone.db.UserDb;
import devops.Capstone.model.User;

import java.util.ArrayList;

public class UserService {
	UserDb userDb;

	public UserService() {
		userDb = new UserDb();
	}

	public boolean isAuthorized(User signup) {
		boolean isValidUser = false;

		if (signup != null && signup.getEmail() != null && signup.getPassword() != null) {
			Set entrySet = userDb.userProfile.entrySet();
			Iterator it = entrySet.iterator();

			while (it.hasNext()) {
				Map.Entry u = (Map.Entry) it.next();
				// System.out.println(u.getKey()+"\t"+u.getValue());
				if (u.getKey().equals(signup.getEmail())) {
					isValidUser = true;
				}
			}
		}

		return isValidUser;
	}

	public boolean updatePassword(User user) {
		boolean isUpdated = false;
		if (user != null && user.getEmail() != null) {

			for (Map.Entry<String, User> entry : userDb.userProfile.entrySet()) {
				if (entry.getKey().equals(user.getEmail())) {
					user.setFirstName(entry.getValue().getFirstName());
					user.setLastName(entry.getValue().getLastName());
					user.setEmail(entry.getValue().getEmail());
					user.setPassword(user.getPassword());
					entry.setValue(user);
					isUpdated = true;
					// System.out.println(user);
				}
			}

		}
		return isUpdated;

	}

	public boolean doRegistration(User user) {
		boolean isCreated = false;
		if (user != null && user.getEmail() != null) {
			userDb.userProfile.put(user.getEmail(), user);
			isCreated = true;
			System.out.println("Number of records available: " + userDb.userProfile.size());
		}
		return isCreated;
	}

	public ArrayList<String> getIndianVaccines() {

		ArrayList<String> vacc = new ArrayList<String>();
		vacc.add("Covaxin ~ 86%");
		vacc.add("Zydus Cadila's ZyCoV-D ~ 85%");
		vacc.add("Oxford - AstraZeneca Vaccine ~ 82%");
		vacc.add("Biological E ~ 79%");
		vacc.add("Mynvax ~ 75%");
		vacc.add("Gennova Biopharmaceuticals ~ 72%");
		vacc.add("NVX-Cov 2373 ~ 66%");
		return vacc;
	}

	public ArrayList<String> getAmericanVaccines() {

		ArrayList<String> vacc = new ArrayList<String>();
		vacc.add("Pfizer vaccine - 86%");
		vacc.add("Johnson and Johnson vaccine ~ 82%");
		vacc.add("Moderna ~ 79%");
		vacc.add("AstraZeneca COVID-19 vaccine ~ 75%");
		vacc.add("Novavax COVID-19 vaccine ~ 70%​");
		vacc.add("Gennova Biopharmaceuticals ~ 62%");
		vacc.add("NVX-Cov 2373 ~ 56% ");
		return vacc;
	}

}
