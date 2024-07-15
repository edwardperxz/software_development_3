import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { getAuth, signInWithEmailAndPassword } from 'firebase/auth';
import { ApiService } from '../services/../api.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  users: any[] = []; // Si necesitas manejar usuarios aquí, de lo contrario, puedes eliminar esta línea

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private apiService: ApiService // Asegúrate de que ApiService esté inyectado si lo necesitas
  ) {
    this.loginForm = this.fb.group({
      correo: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  ngOnInit() {
  }
  async login() {
    const { correo, password } = this.loginForm.value;
    const auth = getAuth();
    try {
      await signInWithEmailAndPassword(auth, correo, password);
      this.router.navigate(['/home']);
    } catch (error) {
      console.error('Error logging in', error);
    }
  }

}

