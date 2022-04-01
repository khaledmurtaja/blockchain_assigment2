/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockStructure;

/**
 *
 * @author khaled
 */
public class testing {

    public static void main(String[] args) {
        Block.readFromStorage();
        if(Block.blockChain.size()==0){
            Block genesisBlock = new Block("Hi im the first block", "null");
        genesisBlock.SetBlock(genesisBlock);
            
        }
        Block genesisBlock = new Block("Hi im the first block", Block.blockChain.get(Block.blockChain.size()-1).Hash);
        genesisBlock.SetBlock(genesisBlock);
        Block secondBlock = new Block("Yo im the second block", genesisBlock.Hash);
        secondBlock.SetBlock(secondBlock);
        Block thirdBlock = new Block("Hey im the third block", secondBlock.Hash);
        thirdBlock.SetBlock(thirdBlock);
       // Block.ExploreBlocks();
        Block.storeBlockData(Block.blockChain);

    }

}
