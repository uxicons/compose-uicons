package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckBox: ImageVector? = null

val Icons.Bs.TruckBox: ImageVector
    get() = _TruckBox ?: UXIcon(name = "TruckBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(3f, 18f)
                verticalLineToRelative(-6f)
                lineTo(0f, 12f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3.06f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(8.12f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(3.06f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 9f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(11f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(11f)
                lineTo(11f, 2f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TruckBox = it}
