#!/bin/bash

git init 

git config --local user.email j2gl.edu@gmail.com
git config --local user.name "Juan J. Garcia"
git config --local core.hookspath "./githooks/"

git config --list --local
