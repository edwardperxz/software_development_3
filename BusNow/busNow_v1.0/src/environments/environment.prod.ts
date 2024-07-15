// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyC9dtj6PAfSN1d_2gzXxrMv6YdvIh24ftI",
  authDomain: "busnow1.firebaseapp.com",
  projectId: "busnow1",
  storageBucket: "busnow1.appspot.com",
  messagingSenderId: "148302962501",
  appId: "1:148302962501:web:087ef3c48363b9788f282c",
  measurementId: "G-RLPZ6PGT60"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);