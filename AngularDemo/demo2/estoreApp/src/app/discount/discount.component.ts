import { Component, OnInit,SimpleChange,OnChanges,SimpleChanges } from '@angular/core';
import { MyserviceService } from '../myservice.service';
import { CallServiceApiService } from '../call-service-api.service';

@Component({
  selector: 'app-discount',
  templateUrl: './discount.component.html',
  styleUrls: ['./discount.component.css']
})
export class DiscountComponent implements OnInit {

  constructor(private callService :CallServiceApiService) { }
 
  posts:any;
  ngOnInit(): void {
    
    this.callService.getPosts().subscribe(response=>{this.posts=response});

  }
  ngOnChanges(changes:SimpleChanges){
    for(let property in changes){
      if(property in changes){
        if(property=='count'){
        console.log('Previous',changes[property].previousValue);
        console.log('Current',changes[property].currentValue);
        console.log('firstChange',changes[property].firstChange);
      }
      }
    }
  }

}
export { CallServiceApiService }
