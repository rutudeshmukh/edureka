import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DiscountComponent } from './discount/discount.component';
import { BigBillionDayComponent } from './big-billion-day/big-billion-day.component';
 
import { HttpClientModule } from '@angular/common/http';
import { ChildComponent } from './child/child.component';
import { FormsModule } from '@angular/forms';
import { SquarePipe } from './square.pipe';

@NgModule({
  declarations: [
    AppComponent,
    DiscountComponent,
    BigBillionDayComponent,
    ChildComponent,
    SquarePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
