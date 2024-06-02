import { Component, OnInit } from '@angular/core';
import { Router, RouterModule } from '@angular/router';
import { IonicModule } from '@ionic/angular';
import { IonToolbar } from '@ionic/angular/standalone';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss'],
  standalone: true,
  imports: [RouterModule,IonicModule,IonToolbar,FormsModule]
})
export class HeaderComponent  {
  constructor (private router: Router) {}
 
  openMapas()
  {
    this.router.navigate(['/mapas']);
  }

  openRutas(){
    this.router.navigate(['/rutas']);
  }
}

