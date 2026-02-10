package com.uxicons.compose

import androidx.compose.ui.graphics.vector.ImageVector

enum class IconStyle(val displayName: String) {
    BRAND("Brand"),
    BOLD_ROUNDED("Bold Rounded"),
    BOLD_STRAIGHT("Bold Straight"),
    REGULAR_CHUBBY("Regular Chubby"),
    REGULAR_ROUNDED("Regular Rounded"),
    REGULAR_STRAIGHT("Regular Straight"),
    SOLID_CHUBBY("Solid Chubby"),
    SOLID_ROUNDED("Solid Rounded"),
    SOLID_STRAIGHT("Solid Straight"),
    THIN_CHUBBY("Thin Chubby"),
    THIN_ROUNDED("Thin Rounded"),
    THIN_STRAIGHT("Thin Straight")
}

object IconRegistry {

    fun getIcons(style: IconStyle): List<ImageVector> {
        return when (style) {
            IconStyle.BRAND -> brandIcons
            IconStyle.BOLD_ROUNDED -> boldRoundedIcons
            IconStyle.BOLD_STRAIGHT -> boldStraightIcons
            IconStyle.REGULAR_CHUBBY -> regularChubbyIcons
            IconStyle.REGULAR_ROUNDED -> regularRoundedIcons
            IconStyle.REGULAR_STRAIGHT -> regularStraightIcons
            IconStyle.SOLID_CHUBBY -> solidChubbyIcons
            IconStyle.SOLID_ROUNDED -> solidRoundedIcons
            IconStyle.SOLID_STRAIGHT -> solidStraightIcons
            IconStyle.THIN_CHUBBY -> thinChubbyIcons
            IconStyle.THIN_ROUNDED -> thinRoundedIcons
            IconStyle.THIN_STRAIGHT -> thinStraightIcons
        }
    }

    private val brandIcons: List<ImageVector> by lazy { AllBrandIcons }
    private val boldRoundedIcons: List<ImageVector> by lazy { AllBoldRoundedIcons }
    private val boldStraightIcons: List<ImageVector> by lazy { AllBoldStraightIcons }
    private val regularChubbyIcons: List<ImageVector> by lazy { AllRegularChubbyIcons }
    private val regularRoundedIcons: List<ImageVector> by lazy { AllRegularRoundedIcons }
    private val regularStraightIcons: List<ImageVector> by lazy { AllRegularStraightIcons }
    private val solidChubbyIcons: List<ImageVector> by lazy { AllSolidChubbyIcons }
    private val solidRoundedIcons: List<ImageVector> by lazy { AllSolidRoundedIcons }
    private val solidStraightIcons: List<ImageVector> by lazy { AllSolidStraightIcons }
    private val thinChubbyIcons: List<ImageVector> by lazy { AllThinChubbyIcons }
    private val thinRoundedIcons: List<ImageVector> by lazy { AllThinRoundedIcons }
    private val thinStraightIcons: List<ImageVector> by lazy { AllThinStraightIcons }
}
