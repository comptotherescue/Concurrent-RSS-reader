/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

public interface RSSStoreFeed {
    void clear();
    void add(ItemRSSClass currentItem);
}
