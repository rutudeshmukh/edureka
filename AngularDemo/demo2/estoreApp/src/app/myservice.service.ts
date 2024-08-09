import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyserviceService {

  constructor() { }

  async getHeroes(){
    let name:String = "Hello Angular Service";
    return name;
  }
  async showHeroes(){
    let name:String = "Hello Angular Service2";
    return name;
  }
  async addHeroes(){
    let name:String = "Hello Angular Service3";
    return name;
  }

}
