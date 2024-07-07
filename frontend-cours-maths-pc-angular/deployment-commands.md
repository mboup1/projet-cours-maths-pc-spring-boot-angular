<!-- Manuellement -->
npm install -g angular-cli-ghpages


Configure Write Permissions for Actions:
repository/setting/actions/general
-Read and write permissions
- Allow GitHub Actions to create and approve pull requests

 ng build --configuration production
 
ng build --output-path=dist --base-href=/frontend-cours-maths-pc-angular/
npx angular-cli-ghpages --dir=dist/browser

Website link
https://mboup1.github.io/frontend-cours-maths-pc-angular/




<!-- ng build --output-path=dist/frontend-cours-maths-pc-angular --base-href=/frontend-cours-maths-pc-angular/
npx angular-cli-ghpages --dir=dist/frontend-cours-maths-pc-angular -->


<!-- Contact
<section class="page-section" id="contact">
  <div class="container">
    <div class="text-center">
      <h2 class="section-heading text-uppercase">Contact</h2>
      <p class="section-subheading text-muted">N'hésitez pas à nous contacter pour toute question ou demande d'information.
      </p>
    </div>

    <form id="contactForm" data-sb-form-api-token="API_TOKEN">
      <div class="row align-items-stretch mb-5">
        <div class="col-md-6">
          <div class="form-group">
            <input class="form-control" id="name" type="text" placeholder="Votre Nom *"
              data-sb-validations="required" />
            <div class="invalid-feedback" data-sb-feedback="name:required">Un nom est requis.</div>
          </div>
          <div class="form-group">
            <input class="form-control" id="email" type="email" placeholder="Votre Email *"
              data-sb-validations="required,email" />
            <div class="invalid-feedback" data-sb-feedback="email:required">Un email est requis.</div>
            <div class="invalid-feedback" data-sb-feedback="email:email">Email invalide.</div>
          </div>
          <div class="form-group mb-md-0">
            <input class="form-control" id="phone" type="tel" placeholder="Votre Téléphone *"
              data-sb-validations="required" />
            <div class="invalid-feedback" data-sb-feedback="phone:required">Un numéro de téléphone est requis.</div>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group form-group-textarea mb-md-0">
            <textarea class="form-control" id="message" placeholder="Votre message *"
              data-sb-validations="required"></textarea>
            <div class="invalid-feedback" data-sb-feedback="message:required">Un message est requis.</div>
          </div>
        </div>
      </div>
      <div class="text-center"><button class="btn btn-primary btn-xl text-uppercase disabled">Envoyer</button></div>

      <div class="d-none" id="submitSuccessMessage">
        <div class="text-center text-white mb-3">
          <div class="fw-bolder">Soumission du formulaire réussie!</div>
          Pour activer ce formulaire, inscrivez-vous sur
          <br />
          <a
            href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
        </div>
      </div>
        <div class="text-center text-danger mb-3">Erreur lors de l'envoi du message!</div>
      </div>
    </form>
  </div>
</section> -->
