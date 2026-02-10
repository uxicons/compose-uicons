package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peapod: ImageVector? = null

val Icons.Rs.Peapod: ImageVector
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
                moveTo(16.01f, 16.01f)
                curveToRelative(-4.9f, 4.9f, -11.45f, 5.8f, -13.95f, 5.96f)
                curveToRelative(0.21f, -2.55f, 1.22f, -9.25f, 5.94f, -13.97f)
                curveToRelative(4.72f, -4.72f, 11.43f, -5.72f, 13.97f, -5.94f)
                curveToRelative(-0.16f, 2.5f, -1.04f, 9.03f, -5.96f, 13.95f)
                close()
                moveTo(8f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(8f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
            }
        }.also { _Peapod = it}
