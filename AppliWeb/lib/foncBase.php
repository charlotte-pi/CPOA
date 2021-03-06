<?php

function choixAlert($message)
{
  $alert = array();
  switch($message)
  {
	case 'connexion':
		$alert['messageAlert'] = ERREUR_CONNECT_BDD;
		break;
	case 'login' :
		$alert['messageAlert'] = ERREUR_INSCRIPTION;
		break;
	case 'query' :
		$alert['messageAlert'] = ERREUR_QUERY_BDD;
		break;
	case 'url_non_valide' :
		$alert['messageAlert'] = TEXTE_PAGE_404;
		break;
	case 'methode_non_autorisee' :
		$alert['messageAlert'] = TEXTE_PAGE_405;
		$alert['classAlert']='danger';
		break;   
	case 'connecte' :
		$alert['messageAlert'] = CONNECTED;
		$alert['classAlert'] = 'success';
		break;
	case 'deconnecte' :
		$alert['messageAlert'] = DECONNECTED;
		$alert['classAlert'] = 'success';
		break;
	case 'wrongpwd' :
		$alert['messageAlert'] = WRONG_PWD;
		$alert['classAlert'] = 'danger';
		break;
	case 'nopwd' :
		$alert['messageAlert'] = NO_PWD;
		$alert['classAlert'] = 'danger';
		break;
	case 'wrongid' :
		$alert['messageAlert'] = WRONG_ID;
		$alert['classAlert'] = 'danger';
		break;
	case 'missPrice' : 
		$alert['messageAlert'] = MISS_PRICE;
		$alert['classAlert'] = 'danger';
		break;
	case 'modifeffected' :
		$alert['messageAlert'] = MODIF_EFFECTED;
		$alert['classAlert'] = 'success';
		break;  
	case 'placemaxover' :
		$alert['messageAlert'] = MAX_OVER;
		$alert['classAlert'] = 'danger';
		break;
	case 'codedetruit' :
		$alert['messageAlert'] = CODE_DETRUIT;
		$alert['classAlert'] = 'success';
		break;
	case 'ajoute' :
		$alert['messageAlert'] = CODE_AJOUTE;
		$alert['classAlert'] = 'success';
		break;  
	case 'pbqte' :
		$alert['messageAlert'] = PB_QTE;
		$alert['classAlert'] = 'danger';
		break;
	case 'pbreduc' :
		$alert['messageAlert'] = PB_REDUC;
		$alert['classAlert'] = 'danger';
		break;
	case 'pbnom' :
		$alert['messageAlert'] = PB_NOM;
		$alert['classAlert'] = 'danger';
		break;
	default :
	  $alert['messageAlert'] = MESSAGE_ERREUR;
  }
  return $alert;
}
