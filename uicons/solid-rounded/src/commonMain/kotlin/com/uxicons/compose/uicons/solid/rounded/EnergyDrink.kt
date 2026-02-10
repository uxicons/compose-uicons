package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnergyDrink: ImageVector? = null

val Icons.Sr.EnergyDrink: ImageVector
    get() = _EnergyDrink ?: UXIcon(name = "EnergyDrink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.12f, 4.16f)
                curveToRelative(-0.55f, -1.26f, -1.74f, -2.11f, -3.12f, -2.15f)
                verticalLineToRelative(-1.01f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5.88f)
                curveToRelative(-1.42f, -0.01f, -2.68f, 0.86f, -3.24f, 2.15f)
                curveToRelative(-0.58f, 1.15f, -0.88f, 2.45f, -0.88f, 3.74f)
                verticalLineToRelative(10.21f)
                curveToRelative(0f, 1.29f, 0.31f, 2.59f, 0.88f, 3.74f)
                curveToRelative(0.56f, 1.3f, 1.82f, 2.16f, 3.24f, 2.15f)
                horizontalLineToRelative(7.75f)
                curveToRelative(1.42f, 0.01f, 2.68f, -0.86f, 3.24f, -2.15f)
                curveToRelative(0.58f, -1.15f, 0.88f, -2.45f, 0.88f, -3.74f)
                verticalLineToRelative(-10.21f)
                curveToRelative(0f, -1.29f, -0.31f, -2.59f, -0.88f, -3.74f)
                close()
                moveTo(15.38f, 13.03f)
                lineTo(11.89f, 17.7f)
                curveToRelative(-0.44f, 0.63f, -1.42f, 0.17f, -1.21f, -0.57f)
                lineToRelative(0.82f, -2.09f)
                horizontalLineToRelative(-2.28f)
                curveToRelative(-0.48f, 0f, -0.83f, -0.47f, -0.69f, -0.93f)
                lineToRelative(1.73f, -4.59f)
                curveToRelative(0.11f, -0.31f, 0.4f, -0.52f, 0.73f, -0.52f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.55f, 0f, 0.92f, 0.55f, 0.73f, 1.06f)
                lineToRelative(-0.81f, 1.88f)
                horizontalLineToRelative(2.41f)
                curveToRelative(0.56f, 0f, 0.9f, 0.62f, 0.59f, 1.09f)
                close()
            }
        }.also { _EnergyDrink = it}
