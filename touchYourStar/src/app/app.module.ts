import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
// COMPONENTS
import { AppComponent } from './app.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
// MATERIAL UI COMPONENT
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { TabsBarComponent } from './components/tabs-bar/tabs-bar.component';



@NgModule({
  declarations: [
    AppComponent,
    ToolbarComponent,
    TabsBarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatToolbarModule,
    MatButtonModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
