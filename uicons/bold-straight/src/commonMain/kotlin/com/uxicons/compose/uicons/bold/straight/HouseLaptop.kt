package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLaptop: ImageVector? = null

val Icons.Bs.HouseLaptop: ImageVector
    get() = _HouseLaptop ?: UXIcon(name = "HouseLaptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(0f, 19f)
                lineTo(0f, 8.16f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineTo(7.34f, 0.71f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(2.34f, 1.83f)
                lineTo(13.99f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.89f)
                lineToRelative(0.66f, 0.51f)
                curveToRelative(0.89f, 0.7f, 1.34f, 1.57f, 1.34f, 2.59f)
                horizontalLineToRelative(-3f)
                reflectiveCurveToRelative(0f, -0.05f, 0f, -0.05f)
                curveToRelative(0f, 0f, -0.03f, -0.06f, -0.19f, -0.18f)
                lineTo(9.81f, 3.07f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.62f, 0f)
                lineTo(3.19f, 7.77f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                verticalLineToRelative(7.84f)
                close()
                moveTo(24f, 20f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(8f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(18f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(10.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(4f)
                lineToRelative(1f, -1f)
                close()
            }
        }.also { _HouseLaptop = it}
