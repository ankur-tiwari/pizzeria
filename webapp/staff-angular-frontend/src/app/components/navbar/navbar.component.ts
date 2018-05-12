import {Component, OnInit} from "@angular/core";
import {AuthenticationService} from "../../services/authentication.service";

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private authenticationService: AuthenticationService) { }

  ngOnInit() {
  }

  logout(): void {
    this.authenticationService.logout();
  }

  isAuthenticated(): boolean {
    return this.authenticationService.isAuthenticated();
  }
}
