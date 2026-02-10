package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirConditioner: ImageVector? = null

val Icons.Bs.AirConditioner: ImageVector
    get() = _AirConditioner ?: UXIcon(name = "AirConditioner") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(7.5f)
                lineTo(24f, 11f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                lineTo(5f, 6f)
                verticalLineToRelative(2f)
                lineTo(3f, 8f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.19f, -4.5f, 4f, -4.5f)
                verticalLineToRelative(3f)
                lineToRelative(0.04f, -0.0f)
                curveToRelative(-0.25f, 0.05f, -1.04f, 0.68f, -1.04f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22f, 19.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.79f, -1.46f, -1.04f, -1.5f)
                lineToRelative(0.04f, -3.0f)
                curveToRelative(1.81f, 0f, 4f, 2.01f, 4f, 4.5f)
                close()
            }
        }.also { _AirConditioner = it}
