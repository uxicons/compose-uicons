package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Br.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.45f, 8.26f)
            lineTo(15.74f, 1.55f)
            curveToRelative(-2.06f, -2.06f, -5.42f, -2.06f, -7.49f, 0f)
            lineTo(1.55f, 8.26f)
            curveToRelative(-2.06f, 2.06f, -2.06f, 5.42f, 0f, 7.49f)
            lineToRelative(6.71f, 6.71f)
            curveToRelative(1.03f, 1.03f, 2.39f, 1.55f, 3.74f, 1.55f)
            reflectiveCurveToRelative(2.71f, -0.52f, 3.74f, -1.55f)
            lineToRelative(6.71f, -6.71f)
            curveToRelative(2.06f, -2.06f, 2.06f, -5.42f, 0f, -7.49f)
            close()
            moveTo(20.33f, 13.62f)
            lineToRelative(-6.71f, 6.71f)
            curveToRelative(-0.9f, 0.9f, -2.35f, 0.9f, -3.25f, 0f)
            lineTo(3.67f, 13.62f)
            curveToRelative(-0.89f, -0.9f, -0.89f, -2.35f, 0f, -3.25f)
            lineTo(10.38f, 3.67f)
            curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0f)
            lineToRelative(6.71f, 6.71f)
            curveToRelative(0.89f, 0.9f, 0.89f, 2.35f, 0f, 3.25f)
            close()
            moveTo(17.72f, 10.81f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -1.65f, 0.18f, -1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, 1.04f, -1.29f, 1.65f, -0.69f)
            lineToRelative(3.06f, 3.06f)
            close()
        }
    }.also { _DiamondTurnRight = it }
