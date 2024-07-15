import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // Importa HttpClientModule
import { AppRoutingModule } from './routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
    // Otros componentes
  ],
  imports: [
    BrowserModule,
    HttpClientModule, // Añade HttpClientModule aquí
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
