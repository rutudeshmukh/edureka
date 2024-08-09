import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //title = 'estoreApp';

  @Input() count:number =0;
  @Output() countChange: EventEmitter<number> = new EventEmitter<number>();

  increment(){
    this.count++;
    this.countChange.emit(this.count);
  }
  clickData=0;
  clickMe(){
    this.clickData++;
  }
  value:String | undefined;
  clearName(){
    this.value="";
  }
  title:string ='pipe demo';
  toDate: Date = new Date();

  a:string= "learning angular pipes";
  msg:string=" Welcome to angular 14";

}
