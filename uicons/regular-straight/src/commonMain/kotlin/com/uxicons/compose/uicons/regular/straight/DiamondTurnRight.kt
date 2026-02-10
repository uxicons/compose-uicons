package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Rs.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 8.88f)
                lineTo(14.12f, 0.89f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineTo(1.89f, 8.88f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.56f, 0.88f, 2.12f)
                lineToRelative(10.12f, 10.12f)
                lineToRelative(10.12f, -10.12f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(20.7f, 11.71f)
                lineToRelative(-8.7f, 8.7f)
                lineTo(3.3f, 11.71f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.71f)
                lineTo(11.29f, 2.3f)
                curveToRelative(0.2f, -0.2f, 0.45f, -0.29f, 0.71f, -0.29f)
                reflectiveCurveToRelative(0.51f, 0.1f, 0.71f, 0.29f)
                lineToRelative(7.99f, 7.99f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
                moveTo(16.46f, 8.71f)
                curveToRelative(0.34f, 0.34f, 0.54f, 0.8f, 0.54f, 1.29f)
                reflectiveCurveToRelative(-0.19f, 0.95f, -0.54f, 1.29f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.64f, -1.64f)
                horizontalLineToRelative(-2.93f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.59f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-1.58f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.93f)
                lineToRelative(-1.64f, -1.64f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.76f, 2.76f)
                close()
            }
        }.also { _DiamondTurnRight = it}
