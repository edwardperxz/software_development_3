import { Routes } from '@angular/router';

export const routes: Routes = [
 /* {
    path: 'home',
    loadComponent: () => import('./home/home.page').then((m) => m.HomePage),
  },*/
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path:'mapas',
    loadComponent: ( )=> import('./mapas/mapas.page').then(m=> m.MapasPage)
    
  },
  {
    path: 'rutas',
    loadComponent: () => import('./rutas/rutas.page').then( m => m.RutasPage)
  }

];
