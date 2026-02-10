package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnergyDrink: ImageVector? = null

val Icons.Ss.EnergyDrink: ImageVector
    get() = _EnergyDrink ?: UXIcon(name = "EnergyDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.12f, 4.16f)
                lineToRelative(-1.08f, -2.15f)
                horizontalLineToRelative(-2.04f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8.04f)
                lineToRelative(-1.08f, 2.15f)
                curveToRelative(-0.58f, 1.15f, -0.88f, 2.45f, -0.88f, 3.74f)
                verticalLineToRelative(10.21f)
                curveToRelative(0f, 1.29f, 0.31f, 2.59f, 0.88f, 3.74f)
                lineToRelative(1.08f, 2.15f)
                horizontalLineToRelative(12.08f)
                lineToRelative(1.08f, -2.15f)
                curveToRelative(0.58f, -1.15f, 0.88f, -2.45f, 0.88f, -3.74f)
                verticalLineToRelative(-10.21f)
                curveToRelative(0f, -1.29f, -0.31f, -2.59f, -0.88f, -3.74f)
                close()
                moveTo(15.34f, 13.25f)
                lineTo(11.07f, 18f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(1.03f, -3f)
                horizontalLineToRelative(-1.71f)
                curveToRelative(-0.55f, 0f, -0.94f, -0.57f, -0.79f, -1.1f)
                lineToRelative(2.16f, -4.9f)
                horizontalLineToRelative(3.33f)
                lineToRelative(-1.3f, 3f)
                horizontalLineToRelative(1.96f)
                curveToRelative(0.64f, 0f, 1.02f, 0.71f, 0.67f, 1.25f)
                close()
            }
        }.also { _EnergyDrink = it}
