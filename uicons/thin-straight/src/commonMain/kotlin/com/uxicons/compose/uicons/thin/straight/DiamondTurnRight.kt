package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Ts.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.24f, 9.22f)
                lineTo(13.84f, 0.77f)
                curveToRelative(-0.98f, -0.99f, -2.7f, -0.99f, -3.68f, 0f)
                lineTo(1.76f, 9.22f)
                curveToRelative(-1.01f, 1.02f, -1.01f, 2.67f, 0f, 3.69f)
                lineToRelative(10.24f, 10.3f)
                lineToRelative(10.24f, -10.3f)
                curveToRelative(1.01f, -1.02f, 1.01f, -2.67f, 0f, -3.69f)
                close()
                moveTo(21.53f, 12.2f)
                lineToRelative(-9.53f, 9.59f)
                lineTo(2.47f, 12.2f)
                curveToRelative(-0.63f, -0.63f, -0.63f, -1.65f, 0f, -2.28f)
                lineTo(10.87f, 1.47f)
                curveToRelative(0.3f, -0.3f, 0.7f, -0.47f, 1.13f, -0.47f)
                reflectiveCurveToRelative(0.83f, 0.17f, 1.13f, 0.47f)
                lineToRelative(8.4f, 8.45f)
                curveToRelative(0.63f, 0.63f, 0.63f, 1.65f, 0f, 2.28f)
                close()
                moveTo(16.61f, 8.58f)
                curveToRelative(0.52f, 0.52f, 0.52f, 1.36f, 0f, 1.88f)
                lineToRelative(-2.9f, 2.9f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.63f, -2.63f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.48f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.13f)
                lineToRelative(-2.63f, -2.63f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.9f, 2.9f)
                close()
            }
        }.also { _DiamondTurnRight = it}
