package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Ts.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.28f, 6.29f)
                lineToRelative(2.76f, -3.65f)
                lineToRelative(-2.65f, -2.65f)
                horizontalLineToRelative(-4.79f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(2.76f, 3.65f)
                curveToRelative(-3.86f, 1.01f, -6.72f, 4.53f, -6.72f, 8.71f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -4.17f, -2.86f, -7.69f, -6.72f, -8.71f)
                close()
                moveTo(12.5f, 6.01f)
                verticalLineToRelative(-2.12f)
                lineToRelative(2.89f, -0.72f)
                lineToRelative(-2.2f, 2.91f)
                curveToRelative(-0.23f, -0.03f, -0.46f, -0.05f, -0.69f, -0.07f)
                close()
                moveTo(10.02f, 1f)
                horizontalLineToRelative(3.97f)
                lineToRelative(1.19f, 1.19f)
                lineToRelative(-3.17f, 0.79f)
                lineToRelative(-3.17f, -0.79f)
                lineToRelative(1.19f, -1.19f)
                close()
                moveTo(8.61f, 3.17f)
                lineToRelative(2.89f, 0.72f)
                verticalLineToRelative(2.12f)
                curveToRelative(-0.23f, 0.01f, -0.46f, 0.04f, -0.69f, 0.07f)
                lineToRelative(-2.2f, -2.91f)
                close()
                moveTo(12.0f, 23f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(7.59f, 7f, 12f, 7f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.also { _RingDiamond = it}
