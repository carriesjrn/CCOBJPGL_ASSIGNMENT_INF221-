package Planets;

import Explorers.Explorer;

public class Earth implements Planet {
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy