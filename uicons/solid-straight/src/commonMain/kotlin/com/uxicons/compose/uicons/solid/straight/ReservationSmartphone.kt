package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationSmartphone: ImageVector? = null

val Icons.Ss.ReservationSmartphone: ImageVector
    get() = _ReservationSmartphone ?: UXIcon(name = "ReservationSmartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.11f, 11f)
                curveToRelative(-1.0f, 0f, -1.92f, -0.68f, -2.08f, -1.66f)
                curveToRelative(-0.2f, -1.25f, 0.76f, -2.34f, 1.97f, -2.34f)
                horizontalLineToRelative(8.82f)
                curveToRelative(-0.89f, -1.08f, -1.75f, -2.11f, -1.78f, -2.15f)
                curveToRelative(-0.86f, -0.92f, -0.81f, -2.37f, 0.11f, -3.23f)
                curveToRelative(0.92f, -0.86f, 2.37f, -0.82f, 3.23f, 0.1f)
                lineToRelative(1.63f, 1.82f)
                verticalLineToRelative(16.46f)
                horizontalLineToRelative(-4f)
                lineToRelative(-3.54f, -9f)
                horizontalLineToRelative(-4.36f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 18f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(16f, 5f)
                lineTo(16f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _ReservationSmartphone = it}
