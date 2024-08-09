import { Component, OnInit } from '@angular/core';
import { MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-big-billion-day',
  templateUrl: './big-billion-day.component.html',
  styleUrls: ['./big-billion-day.component.css']
})
export class BigBillionDayComponent implements OnInit {

  constructor(private myservice :MyserviceService) { }
  call:any;
  call1:any;
  ngOnInit(): void {
    this.call = this.myservice.showHeroes();
    this.call1= this.myservice.addHeroes();

  }
}
