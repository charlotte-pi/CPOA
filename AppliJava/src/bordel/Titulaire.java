/***********************************************************************
 * Module:  Titulaire.java
 * Author:  Ilan
 * Purpose: Defines the Class Titulaire
 ***********************************************************************/

import java.util.*;

/** @pdOid df50b15b-79ea-470a-b32b-29354b61e4d7 */
public class Titulaire {
   /** @pdOid e9f29c86-bc55-473d-9072-8b9dc93464bd */
   public int idTitulaire;
   /** @pdOid aee6eb7d-4e88-4d0e-b116-d50f9cf7478b */
   public java.lang.String nomTitulaire;
   /** @pdOid 181fe4c2-9f02-42a8-b2bf-99aa96e4cbc2 */
   public java.lang.String prenomTitulaire;
   /** @pdOid 65218d1f-95df-4923-9c1f-04b00a8ef252 */
   public java.lang.String mailTitulaire;
   
   /** @pdRoleInfo migr=no name=Billet assc=reference3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Billet> billet;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Billet> getBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBillet() {
      if (billet == null)
         billet = new java.util.HashSet<Billet>();
      return billet.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBillet */
   public void setBillet(java.util.Collection<Billet> newBillet) {
      removeAllBillet();
      for (java.util.Iterator iter = newBillet.iterator(); iter.hasNext();)
         addBillet((Billet)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBillet */
   public void addBillet(Billet newBillet) {
      if (newBillet == null)
         return;
      if (this.billet == null)
         this.billet = new java.util.HashSet<Billet>();
      if (!this.billet.contains(newBillet))
      {
         this.billet.add(newBillet);
         newBillet.setTitulaire(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBillet */
   public void removeBillet(Billet oldBillet) {
      if (oldBillet == null)
         return;
      if (this.billet != null)
         if (this.billet.contains(oldBillet))
         {
            this.billet.remove(oldBillet);
            oldBillet.setTitulaire((Titulaire)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBillet() {
      if (billet != null)
      {
         Billet oldBillet;
         for (java.util.Iterator iter = getIteratorBillet(); iter.hasNext();)
         {
            oldBillet = (Billet)iter.next();
            iter.remove();
            oldBillet.setTitulaire((Titulaire)null);
         }
      }
   }

}