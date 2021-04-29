package jtest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class user {
	

		private Pattern pattern;
		private Matcher matcher;
		private Pattern pattern1;
		private Matcher matcher1;
		private Pattern pattern2;
		private Matcher matcher2;
		private Pattern pattern3;
		private Matcher matcher3;
		private Pattern pattern4;
		private Matcher matcher4;
		

		private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		private static final String FIRST_NAME="[A-Z][a-z]*{3,}";
		private static final String Last_NAME="[A-Z][a-z]*{3,}";
		private static final String phoneNumber="^[1-9]{2}[0-9]{7,12}$";
		private static final String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

		public user()
		{
			pattern1 = Pattern.compile(EMAIL_REGEX);
			pattern = Pattern.compile(FIRST_NAME);
			pattern2 = Pattern.compile(Last_NAME);
			pattern3 = Pattern.compile(phoneNumber);
			pattern4 = Pattern.compile(password);
		}


		public boolean validateFirstName(final String email)
		{
			matcher = pattern.matcher(email);
			return matcher.matches();

		}
		public boolean validateEmail(final String email)
		{
			matcher1 = pattern1.matcher(email);
			return matcher1.matches();

		}
		public boolean validateLastName(final String email)
		{
			matcher2 = pattern2.matcher(email);
			return matcher2.matches();

		}
		public boolean validatePhone(final String email)
		{
			matcher3 = pattern3.matcher(email);
			return matcher3.matches();

		}
		public boolean validatePassword(final String email)
		{
			matcher4 = pattern4.matcher(email);
			return matcher4.matches();

		}
	}

