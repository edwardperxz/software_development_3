import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full',
  },
  {
    path: 'map',
    loadComponent: () => import('./map/map.page').then( m => m.MapPage)
  },
  {
    path: 'rutas',
    loadComponent: () => import('./rutas/rutas.page').then( m => m.RutasComponent)
  },
  {
    path: 'terminales',
    loadComponent: () => import('./terminales/terminales.page').then( m => m.TerminalesPage)
  },
  {
    path: 'perfil',
    loadComponent: () => import('./perfil/perfil.page').then( m => m.PerfilPage)
  },
  {
    path: 'home',
    loadComponent: () => import('./home/home.page').then((m) => m.HomePage),
  },
  {
    path: 'login',
<<<<<<< HEAD
    loadComponent: () => import('./login/login.page').then( m => m.LoginComponent)
  },
  {
    path: 'register',
    loadComponent: () => import('./registro/register.page').then( m => m.RegisterComponent)
=======
    loadComponent: () => import('./login').then( m => m.LoginPage)
>>>>>>> 221680811bd3585f308015f23d641ed4a0793548
  },
]