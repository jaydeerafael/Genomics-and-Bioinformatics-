import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/***********************************************************************************************************************
 *  Nafn    : Hálfdan Andri Henrysson
 *  T-póstur: haha130@hi.is
 *
 *  Lýsing  : Inniheldur skipun til að fá andverfu á lit.
 *
 *
 **********************************************************************************************************************/
public class BlastParser {
    public static void main(String[] args) {
        In in = new In(args[0]);
        Out out = new Out(args[1]);
        while (in.hasNextLine()) {
            if (in.readChar() == '>') {
                //System.out.println(identifier(in));
                out.printf(identifierToSpecies(identifier(in)));
                out.println();
                in.readLine();
            }
            out.printf(in.readLine());
            out.println();

        }
    }

    private static String identifier(In in) {
        char test = in.readChar();
        StringBuilder ss = new StringBuilder();
        while (test != ':') {
            ss.append(test);
            test = in.readChar();
        }
        return ss.toString();
    }

    private static String identifierToSpecies(String s) {
        String species = "not found";
        switch (s) {
            case "hsa":
                species = "Homo sapiens";
                break;
            case "mmu":
                species = "Mus musculus";
                break;
            case "dme":
                species = "Drosophila melanogaster";
                break;
            case "cel":
                species = "Caenorhabditis elegans";
                break;
            case "dre":
                species = "Danio rerio";
                break;
            case "nve":
                species = "Nematostella vectensis";
                break;
            case "aqu":
                species = "Amphimedon queenslandica";
                break;
            case "spu":
                species = "Strongylocentrotus purpuratus";
                break;
            case "hmg":
                species = "Hydra vulgaris";
                break;
            case "gga":
                species = "Gallus gallus";
                break;
            case "xla":
                species = "Xenopus laevis";
                break;
            case "ssc":
                species = "Bos taurus";
                break;
            case "lav":
                species = "Loxodonta africana";
                break;
            case "rno":
                species = "Rattus norvegicus";
                break;
            case "oas":
                species = "Ovis aries";
                break;
            case "ocu":
                species = "Oryctolagus cuniculus";
                break;
            case "ecb":
                species = "Equus caballus";
                break;
            case "chx":
                species = "Capra hircus";
                break;
            case "fca":
                species = "Felis catus";
                break;
            case "cfa":
                species = "Canis lupus familiaris";
                break;
            case "cav":
                species = "Cavia porcellus";
                break;
            case "cjc":
                species = "Callithrix jacchus";
                break;
            case "mcc":
                species = "Macaca mulatta";
                break;
            case "ptr":
                species = "Pan troglodytes";
                break;
            case "pon":
                species = "Pongo pygmaeus";
                break;
            case "ggo":
                species = "Gorilla gorilla";
                break;
            case "bbub":
                species = "Bubalus bubalis";
                break;
            case "maua":
                species = "Mesocricetus auratus";
                break;
            case "nle":
                species = "Nomascus leucogenys";
                break;
            case "etf":
                species = "Echinops telfairi";
                break;
            case "dnm":
                species = "Dasypus novemcinctus";
                break;
            case "pcla":
                species = "Procavia capensis";
                break;
            case "pwc":
                species = "Phascolarctos cinereus";
                break;
            case "shr":
                species = "Sarcophilus harrisii";
                break;
            case "ccat":
                species = "Ceratitis capitata";
                break;
            case "hcg":
                species = "Hemidactylus capensis";
                break;
            case "tca":
                species = "Tribolium castaneum";
                break;
            case "obi":
                species = "Octopus vulgaris";
                break;
            case "cgi":
                species = "Crassostrea gigas";
                break;
            case "ola":
                species = "Oryzias latipes";
                break;
            case "mmer":
                species = "Mercenaria mercenaria";
                break;
            case "svg":
                species = "Sturnus vulgaris";
                break;
            case "ccar":
                species = "Cyprinus carpio";
                break;
            case "pma":
                species = "Parus major";
                break;
            case "pmoa":
                species = "Passer motanus";
                break;
            case "tgu":
                species = "Taeniopygia guttata";
                break;
            case "cbrc":
                species = "Corvus brachyrhynchos";
                break;
            case "mdo":
                species = "Monodelphis domestica";
                break;
            case "acs":
                species = "Anolis carolinensis";
                break;
            case "lcm":
                species = "Latimeria chalumnae";
                break;
            case "gat":
                species = "Gasterosteus aculeatus";
                break;
            case "omy":
                species = "Oncorhynchus mykiss";
                break;
            case "xma":
                species = "Xiphophorus maculatus";
                break;
            case "amex":
                species = "Astyanax mexicanus";
                break;
            case "hro":
                species = "Helobdella robusta";
                break;
            case "bta":
                species = "Bos taurus";
                break;

        }
        if (species.equals("not found")) throw new IllegalArgumentException("unidentified species code found");
        return species;
    }
}

