import React, {useState} from 'react';
import "./styles.css";

// Function for client-side validation
function validateForm(event) {
  const form = event.target;
  const email = form.querySelector('input[name="email"]').value;
  const password = form.querySelector('input[name="password"]').value;
  
  if (form.id === 'signup-form') {
    const confirmPassword = form.querySelector('input[name="confirmPassword"]').value;
    
    if (password !== confirmPassword) {
      alert('Passwords do not match');
      event.preventDefault(); // Prevent form submission
      return false;
    }
    
    // Store user details in localStorage
    localStorage.setItem('userEmail', email);
    localStorage.setItem('userPassword', password);
    alert('Sign up successful!');
  }
  
  if (form.id === 'signin-form') {
    const storedEmail = localStorage.getItem('userEmail');
    const storedPassword = localStorage.getItem('userPassword');
    
    if (email !== storedEmail || password !== storedPassword) {
      alert('Invalid email or password');
      event.preventDefault(); // Prevent form submission
      return false;
    }
    
    alert('Sign in successful!');
  }
  
  return true;
}

export default function Login() {
  const [isSignIn, setIsSignIn] = useState(true);
  
  const handleTabChange = (event) => {
    setIsSignIn(event.target.id === 'signin-tab');
  };
  
  return (
    <div className="form-body">
      <div className="form-container">
        <input type="radio" id="signin-tab" name="tab" checked={isSignIn} onChange={handleTabChange}/>
        <label className="form-label" htmlFor="signin-tab">Sign In</label>
        {/*Signin/Signup Toggle*/}
        <input type="radio" id="signup-tab" name="tab" checked={!isSignIn} onChange={handleTabChange}/>
        <label className="form-label" htmlFor="signup-tab">Sign Up</label>
        {/*Sign in Form*/}
        <div className="form signin-form">
          <h2>Sign In</h2>
          <form id="signin-form" action="#" method="POST" onSubmit={validateForm}>
            <input type="email" name="email" placeholder="Email Address" required/>
            <input type="password" name="password" placeholder="Password" required/>
            <button type="submit">Sign In</button>
          </form>
          <p className="form-text">Don't have an account? <label className="form-label" htmlFor="signup-tab">Sign Up
            Here</label></p>
        </div>
        {/*Signup Form*/}
        <div className="form signup-form">
          <h2>Sign Up</h2>
          <form id="signup-form" action="#" method="POST" onSubmit={validateForm}>
            <input type="text" name="fullname" placeholder="Full Name" required/>
            <input type="email" name="email" placeholder="Email Address" required/>
            <input type="password" name="password" placeholder="Password" required/>
            <input type="password" name="confirmPassword" placeholder="Confirm Password" required/>
            <button type="submit">Sign Up</button>
          </form>
          <p className="form-text">Already have an account? <label className="form-label" htmlFor="signin-tab">Sign In
            Here</label></p>
        </div>
      </div>
    </div>
  );
}
