/**
 * 
 */

window.onload = function() {

	//////////////////////////////LOGIN JS
	// coding working on the login page here
	if (document.getElementById("loginPage") != null) {
		var password = document.getElementById("password");
		var password_error = document.getElementById("password_error");
		var email = document.getElementById("email");
		var email_error = document.getElementById("email_error");
		// when both empty button disabled
		//if (password.value == "" || email.value == "") {
			//document.getElementById("submitBtn").style.color = "red";
		//}

		// attaching events
		password.addEventListener("blur", function(event) {
			// password
			validateOnBlur(password, password_error, "fill in your password");

		});
		// email
		email.addEventListener("blur", function(event) {
			event.preventDefault();
			// email
			validateOnBlur(email, email_error, "fill your email");
		});
		// on keyup
		// Email
		email.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(email, email_error, "email cant't be empty");
		});// end of validate email on keyup
		// password
		password.addEventListener("keyup",
				function(event) {
					event.preventDefault();
					validateOnKeyup(password, password_error,
							"password can't be empty");
				});

		

	}// end of login area
   //\\\\\\\\\\\\\\\\\\\\\\\\\END LOGIN
	
	
	
	////////////////////////////REGISTRATION/////////////
	// /registratiotn region
	if (document.getElementById("registrationPage") != null) {
		var firstname = document.getElementById("firstname");
		var firstname_error = document.getElementById("firstname_error");
		var lastname = document.getElementById("lastname");
		var lastname_error = document.getElementById("lastname_error");
		var username = document.getElementById("username");
		var username_error = document.getElementById("username_error");
		var email = document.getElementById("email");
		var email_error = document.getElementById("email_error");
		var password = document.getElementById("password");
		var password_error = document.getElementById("password_error");
		var cpassword = document.getElementById("cpassword");
		var cpassword_error = document.getElementById("cpassword_error");
		var submitbtn =document.getElementById("register"); 
		///to deactvate the register buttton if any field is empty
		
		//and to activate the submit button if all the fields are filled
		
		/*submitbtn.addEventListener("mouseover" , function (event){
			event.preventDefault();
			if(firstname.value=="" || lastname.value=="" || username.value=="" || email.value=="" || password.value=="" || cpassword.value==""){
				submitbtn.disabled=true;
				//submitbtn.class="btn-danger";
				submitbtn.style.color="green";
			}else{
				//submitbtn.class="btn-primary";
				submitbtn.style.color="green";
				submitbtn.disabled=false;
			}
			
		});//botton mouseenter
		*/
		// attach blur event
		// /--------firstname
		firstname.addEventListener("blur",
				function(event) {
					event.preventDefault();
					validateOnBlur(firstname, firstname_error,
							"fill in your firstname");
				});
		// /-------lastname

		lastname.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(lastname, lastname_error, "fill in your lastname");
		});
		// /--------username

		username.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(username, username_error, "fill in your username");
		});
		// /-------email

		email.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(email, email_error, "fill in your email");
		});
		// /-------password

		password.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(password, password_error, "fill in your password");
		});
		// /--------cpassword

		cpassword.addEventListener("blur",
				function(event) {
					event.preventDefault();
					validateOnBlur(cpassword, cpassword_error,
							"confirm your password");
					checkPasswords(password , cpassword , cpassword_error);
				});

		
		
		// /------attaching keyup event
		// ------firstname
		firstname.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(firstname, firstname_error,
					"firstname cannot be empty");
		});
		// /---------lastname
		lastname.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(lastname, lastname_error,
					"lastname cannot be empty");
		});
		// /----username

		username.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(username, username_error,
					"username cannot be empty");
		});
		// /-------email

		email.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(email, email_error, "email cannot be empty");
		});
		// /----password

		password.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(password, password_error,
					"password cannot be empty");
		});
		// /----cpassword

		cpassword.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(cpassword, cpassword_error,
					"cpassword cannot be empty");
		});

	}// end of registration js
	
	//\\\\\\\\\\\\\\\\\\\\\\\\end of registration
	
	
	
	
	////////////////////////update page
	if(document.getElementById("updatePage") !=null){

		var firstname = document.getElementById("firstname");
		var firstname_error = document.getElementById("firstname_error");
		var lastname = document.getElementById("lastname");
		var lastname_error = document.getElementById("lastname_error");
		var username = document.getElementById("username");
		var username_error = document.getElementById("username_error");
		var email = document.getElementById("email");
		var email_error = document.getElementById("email_error");
		var submitbtn =document.getElementById("updatebtn"); 
		///to de-activate the register buttton
		/*if(firstname.value=="" || lastname.value=="" || username.value=="" || email.value=="" ){
			submitbtn.style.color="red";
		}
		//to activate the submit button
		
		submitbtn.addEventListener("mouseenter" , function(event){
			event.preventDefault();
			if(firstname.value !="" && lastname.value !="" && username.value !="" && email.value ){
				submitbtn.style.color="white";
			}else{
				submitbtn.style.color="red";
			}
		});
	*/
	//attaching events
	
		// ------firstname
		firstname.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(firstname, firstname_error,
					"firstname cannot be empty");
		});
		// /---------lastname
		lastname.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(lastname, lastname_error,
					"lastname cannot be empty");
		});
		// /----username

		username.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(username, username_error,
					"username cannot be empty");
		});
		// /-------email

		email.addEventListener("keyup", function(event) {
			event.preventDefault();
			validateOnKeyup(email, email_error, "email cannot be empty");
		});
	}
	//\\\\\\\\\\\\\\\\update page
	
	if(document.getElementById("passwordRcoveryPage") !=null){
	
	  var password = document.getElementById("password");
	  var password_error = document.getElementById("password_error");
	  var cpassword = document.getElementById("cpassword");
	  var cpassword_error = document.getElementById("cpassword_error");
	 var submitbtn = document.getElementById("passwordRecovery");
	//  if(password.value =="" || cpassword.value==""){
		//  submitbtn.disabled=true;
	  //}
	  //to activate the button
	  /*submitbtn.addEventListener("mouseenter" , function(event){
		  event.preventDefault();
		  if(password.value !="" && cpassword.value!=""){
			  submitbtn.disabled=false;
		  }
		  
	  });
	  */
	  
	  //attach events
	  ///key up
	  password.addEventListener("keyup" , function(event){
		  event.preventDefault();
		  validateOnKeyup(password, password_error, "password cant be empty");
	  });
	  
	  ///-----cpassword
	  cpassword.addEventListener("keyup" , function(event){
		  event.preventDefault();
		  validateOnKeyup(cpassword, cpassword_error, "confirm your password");
	  });
	  
        //on blur to confirm password
	// /----cpassword
	  cpassword.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(cpassword, cpassword_error, "comfirm password required");
			//if(cpassword.value!="" && cpassword.value!=password.value){
			//	checkPasswords(password , cpassword , "passwirds donot match");
			//}
	});
		///-----password
	  password.addEventListener("blur", function(event) {
			event.preventDefault();
			validateOnBlur(password, password_error, "password required");
	});
		
	  
	  
	}
	//\\\\end of password recovery
	
	
	
	
/////////////////
// Validating methods
///////////////	
	// validating methods
	
	//checking password
	function checkPasswords(p , c , e){
		if (p.value != c.value) {
			e.innerHTML = "passwords donnot match";
		}
	}
	
	// blur
	function validateOnBlur(element, element_error, error_message) {
		if (element.value == "") {
			element.style.border = "1px solid red";
			element_error.style.color = "red";
			element_error.innerHTML = error_message;

		}
	}// end of validate on blur

	function validateOnKeyup(element, element_error, error_message) {
		if (element.value == "") {
			element.style.border = "1px solid red";
			element_error.style.color = "red";
			element_error.innerHTML = error_message;

		} else {
			element.style.border = "1px solid green";
			element_error.innerHTML = "";
		}

	}// end of validate on keyup

};