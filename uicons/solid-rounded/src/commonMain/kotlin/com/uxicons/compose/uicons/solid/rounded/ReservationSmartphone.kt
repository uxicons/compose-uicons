package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationSmartphone: ImageVector? = null

val Icons.Sr.ReservationSmartphone: ImageVector
    get() = _ReservationSmartphone ?: UXIcon(name = "ReservationSmartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.54f)
                verticalLineToRelative(16.46f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(-2.06f, 0f, -3.9f, -1.26f, -4.65f, -3.17f)
                lineToRelative(-2.29f, -5.83f)
                horizontalLineToRelative(-5.46f)
                curveToRelative(-1.0f, 0f, -1.92f, -0.68f, -2.08f, -1.66f)
                curveToRelative(-0.2f, -1.25f, 0.76f, -2.34f, 1.97f, -2.34f)
                horizontalLineToRelative(9.92f)
                curveToRelative(-0.89f, -1.08f, -1.75f, -2.11f, -1.78f, -2.15f)
                curveToRelative(-0.86f, -0.92f, -0.81f, -2.37f, 0.11f, -3.23f)
                curveToRelative(0.92f, -0.86f, 2.37f, -0.82f, 3.23f, 0.1f)
                lineToRelative(1.63f, 1.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 17f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 17f)
                close()
                moveTo(9f, 21.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-6f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                close()
            }
        }.also { _ReservationSmartphone = it}
