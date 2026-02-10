package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peapod: ImageVector? = null

val Icons.Ss.Peapod: ImageVector
    get() = _Peapod ?: UXIcon(name = "Peapod") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 0.97f)
                lineToRelative(-0.03f, -0.97f)
                horizontalLineToRelative(-0.97f)
                curveTo(22.6f, 0f, 13.08f, 0.07f, 6.58f, 6.58f)
                curveTo(0.08f, 13.08f, 0f, 22.6f, 0f, 23.0f)
                verticalLineToRelative(0.97f)
                reflectiveCurveToRelative(1.07f, 0.03f, 1.19f, 0.03f)
                curveToRelative(1.48f, 0f, 9.94f, -0.29f, 16.23f, -6.58f)
                curveTo(24.19f, 10.65f, 24.01f, 1.36f, 24.0f, 0.97f)
                close()
                moveTo(6f, 20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(10f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(14f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(18f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Peapod = it}
