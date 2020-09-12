export class User {
    role:string;
    userName: string; 
    password: string;
    token:string;
    constructor(userName:string,password:string){
        this.userName=userName;
        this.password=password;
        this.role='ADMIN';
        this.token=null;
    };
}
