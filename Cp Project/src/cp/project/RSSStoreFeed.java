/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

/**
 *
 * @author akulk
 */
public interface RSSStoreFeed {
    void clear();
    void add(ItemRSSClass currentItem);
}
