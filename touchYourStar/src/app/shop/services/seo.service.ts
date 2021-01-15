import { Injectable } from '@angular/core';
import { Title, Meta } from '@angular/platform-browser';
import { Router, NavigationEnd, ActivatedRoute } from '@angular/router';
import { filter, map, mergeMap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SeoService {

  constructor(
    private titleService: Title,
    private meta: Meta,
    private router: Router,
    private activatedRoute: ActivatedRoute
) { }

updateMetaInfo(brand: string, description: string) {
    this.meta.updateTag({ name: 'brand', content: brand });
    this.meta.updateTag({ name: 'description', content: description });
}

updateTitle(title?: string) {
    if (!title) {
        this.router.events
            .pipe(
                filter((event) => event instanceof NavigationEnd),
                map(() => this.activatedRoute),
                map((route) => {
                    while (route.firstChild) { route = route.firstChild; }
                    return route;
                }),
                filter((route) => route.outlet === 'primary'),
                mergeMap((route) => route.data)).subscribe((event) => {
                    this.titleService.setTitle(event['title']);
                });
    } else {
        this.titleService.setTitle(title);
    }
}
}
