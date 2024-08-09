import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DiscountComponent } from './discount/discount.component';
import { BigBillionDayComponent } from './big-billion-day/big-billion-day.component';

const routes: Routes = [
  // {
  //   path:'discount',
  //   component:DiscountComponent,
  //   title:'Discount page'
  // },
  // {
  //   path:'bigBillionDay',
  //   component:BigBillionDayComponent,
  //   title:'Big Billion Day page'
  // }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
