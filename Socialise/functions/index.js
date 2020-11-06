// const functions = require('firebase-functions');

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//
// exports.helloWorld = functions.https.onRequest((request, response) => {
//   functions.logger.info("Hello logs!", {structuredData: true});
//   response.send("Hello from Firebase!");
// });

"use strict";

const { firebaseConfig } = require("firebase-functions");
const functions = require("firebase-functions");
const nodemailer = require("nodemailer");

const gmailEmail = functions.config().gmail.gmail.email;
const gmailPassword = functions.config().gmail.password;

const mailTransport = nodemailer.createTransport({
  service: "gmail",
  auth: {
    user: gmailEmail,
    pass: gmailPassword,
  },
});
const APP_NAME = "Socialise";

exports.sendWelcomeEmail = functions.auth.user().onCreate((user) => {
  const email = user.email;
  // const displayName = user.displayName;
  return this.sendWelcomeEmail(email, diplayName);
});

async function sendWelcomeEmail(email, displayName) {
  const mailOptions = {
    from: `${APP_NAME} <noreply@firebase.com`,
    to: email,
  };
  mailOptions.subject = `Welcome to {APP_NAME}!`;
  mailOptions.text = `Hey ${
    displayName || ""
  }! Welcome to ${APP_NAME}, a platform to broaden and connect to your social circle. We hope you enjoy our service.`;

  await mailTransport.sendMail(mailOptions);
  console.log("New email sent to:", email);
  return null;
}
