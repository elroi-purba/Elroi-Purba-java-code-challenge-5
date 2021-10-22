class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Elroi Purba", 20, 175);
      hero.profile();
      
  // challenge:
    /*
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    Group 7: jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Group 8: jalan 6x, lari 1x, makan 2x, minum 3x, lompat 1x, duduk 6x
    Group 9: jalan 1x, lari 2x, makan 1x, minum 2x, lompat 8x, duduk 4x
    */
      // jalankan aktivitas disini (GROUP 7)...
      hero.jalan();

      hero.lari();
      hero.lari();
      hero.lari();

      hero.makan();

      hero.minum();

      hero.lompat();
      hero.lompat();

      hero.duduk();
      
      // tampilkan status terkini...
      hero.profile();
      
    }
  }