package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Bs.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.93f, 8.55f)
                lineTo(14.47f, 1.09f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.36f, -4.95f, 0f)
                lineTo(2.07f, 8.55f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.02f, 2.48f)
                lineToRelative(9.93f, 9.94f)
                lineToRelative(9.93f, -9.93f)
                curveToRelative(0.66f, -0.66f, 1.03f, -1.54f, 1.03f, -2.48f)
                reflectiveCurveToRelative(-0.36f, -1.81f, -1.02f, -2.48f)
                close()
                moveTo(19.81f, 11.38f)
                lineToRelative(-7.81f, 7.81f)
                lineToRelative(-7.81f, -7.81f)
                curveToRelative(-0.13f, -0.13f, -0.15f, -0.28f, -0.15f, -0.35f)
                reflectiveCurveToRelative(0.02f, -0.23f, 0.15f, -0.35f)
                lineTo(11.65f, 3.21f)
                curveToRelative(0.1f, -0.1f, 0.23f, -0.15f, 0.35f, -0.15f)
                reflectiveCurveToRelative(0.26f, 0.05f, 0.35f, 0.15f)
                lineToRelative(7.46f, 7.46f)
                curveToRelative(0.13f, 0.13f, 0.15f, 0.28f, 0.15f, 0.35f)
                reflectiveCurveToRelative(-0.02f, 0.23f, -0.15f, 0.35f)
                close()
                moveTo(8.0f, 12.5f)
                verticalLineToRelative(-0.0f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(16.16f, 9.65f)
                curveToRelative(0.46f, 0.46f, 0.46f, 1.19f, 0f, 1.65f)
                lineToRelative(-3.16f, 3.23f)
                verticalLineToRelative(-2.53f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                lineToRelative(-3f, -3.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.58f)
                lineToRelative(3.16f, 3.23f)
                close()
            }
        }.also { _DiamondTurnRight = it}
