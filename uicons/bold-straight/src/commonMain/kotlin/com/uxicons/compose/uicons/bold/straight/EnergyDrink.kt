package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnergyDrink: ImageVector? = null

val Icons.Bs.EnergyDrink: ImageVector
    get() = _EnergyDrink ?: UXIcon(name = "EnergyDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.34f, 13.25f)
                lineToRelative(-4.28f, 4.75f)
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
                moveTo(21f, 8.15f)
                verticalLineToRelative(9.7f)
                curveToRelative(0f, 1.31f, -0.31f, 2.63f, -0.9f, 3.8f)
                lineToRelative(-1.18f, 2.35f)
                horizontalLineToRelative(-13.85f)
                lineToRelative(-1.18f, -2.35f)
                curveToRelative(-0.59f, -1.17f, -0.9f, -2.49f, -0.9f, -3.8f)
                verticalLineToRelative(-9.7f)
                curveToRelative(0f, -1.31f, 0.31f, -2.63f, 0.9f, -3.8f)
                lineToRelative(1.18f, -2.35f)
                horizontalLineToRelative(7.93f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.93f)
                lineToRelative(1.18f, 2.35f)
                curveToRelative(0.59f, 1.17f, 0.9f, 2.49f, 0.9f, 3.8f)
                close()
                moveTo(18f, 8.15f)
                curveToRelative(0f, -0.85f, -0.2f, -1.7f, -0.58f, -2.46f)
                lineToRelative(-0.35f, -0.69f)
                horizontalLineToRelative(-10.14f)
                lineToRelative(-0.35f, 0.69f)
                curveToRelative(-0.38f, 0.76f, -0.58f, 1.61f, -0.58f, 2.46f)
                verticalLineToRelative(9.7f)
                curveToRelative(0f, 0.85f, 0.2f, 1.7f, 0.58f, 2.46f)
                lineToRelative(0.35f, 0.69f)
                horizontalLineToRelative(10.15f)
                lineToRelative(0.35f, -0.69f)
                curveToRelative(0.38f, -0.76f, 0.58f, -1.61f, 0.58f, -2.46f)
                verticalLineToRelative(-9.7f)
                close()
            }
        }.also { _EnergyDrink = it}
