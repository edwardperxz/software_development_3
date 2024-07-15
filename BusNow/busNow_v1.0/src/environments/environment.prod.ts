import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";

const firebaseConfig = {
  apiKey: "AIzaSyC9dtj6PAfSN1d_2gzXxrMv6YdvIh24ftI",
  authDomain: "busnow1.firebaseapp.com",
  projectId: "busnow1",
  storageBucket: "busnow1.appspot.com",
  messagingSenderId: "148302962501",
  appId: "1:148302962501:web:087ef3c48363b9788f282c",
  measurementId: "G-RLPZ6PGT60"
};

const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);