/**
 * Created by donghe on 16/4/18.
 */
var app = angular.module('blogAPP', []);

/*
app.config('$httpProvider',function ($httpProvider) {
    $httpProvider.interceptors.push('HttpInterceptor');
    $httpProvider.defaults.useXDomain = true;
    $httpProvider.defaults.withCredentials = true;

    if(!$httpProvider.defaults.headers.get){
        $httpProvider.defaults.headers.get = {};
    }

    $httpProvider.defaults.headers.get['If-Modified-Since'] = 'Mon, 26 Jul 1997 05:00:00 GMT';
    $httpProvider.defaults.headers.get['Cache-Control'] = 'no-cache';
    $httpProvider.defaults.headers.Pragma = 'no-cache';

    delete $httpProvider.defaults.headers.common['X-Requested-With'];

// });*/
