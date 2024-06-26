import { Routes } from '@angular/router';
import { HomePage } from './home/home.page';

export const routes: Routes = [
  { path: '', component: HomePage },
  {
    path: '',
    redirectTo: 'home',
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
  


];
