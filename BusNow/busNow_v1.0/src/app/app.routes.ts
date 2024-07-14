import { Routes } from '@angular/router';
import { HomePage } from './home/home.page';

export const routes: Routes = [
<<<<<<< HEAD
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full',
  },
  {
    path: 'home',
    loadComponent: () => import('./home/home.page').then((m) => m.HomePage),
  },
=======
  { path: '', component: HomePage },
>>>>>>> 32b6d913eebebf0e86db35c99ae07f071d199006
  {
    path: 'login',
    loadComponent: () => import('./login/login.page').then( m => m.LoginPage)
  },
  {
<<<<<<< HEAD
    path: 'registro',
    loadComponent: () => import('./registro/registro.page').then( m => m.RegistroPage)
  },
=======
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
  

>>>>>>> 32b6d913eebebf0e86db35c99ae07f071d199006

];
