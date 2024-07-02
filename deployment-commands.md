<!-- Manuellement -->
npm install -g angular-cli-ghpages


Configure Write Permissions for Actions:
repository/setting/actions/general
-Read and write permissions
- Allow GitHub Actions to create and approve pull requests


ng build --output-path=dist --base-href=/frontend-cours-maths-pc-angular/
npx angular-cli-ghpages --dir=dist/browser

Website link
https://mboup1.github.io/frontend-cours-maths-pc-angular/



<!-- ng build --output-path=dist/frontend-cours-maths-pc-angular --base-href=/frontend-cours-maths-pc-angular/
npx angular-cli-ghpages --dir=dist/frontend-cours-maths-pc-angular -->

Deploy Manually
ng build --configuration production

cd dist/app-test-hostinger

Compress-Archive -Path * -DestinationPath ../app-test-hostinger.zip or drag and drop in public_html for hostinger
