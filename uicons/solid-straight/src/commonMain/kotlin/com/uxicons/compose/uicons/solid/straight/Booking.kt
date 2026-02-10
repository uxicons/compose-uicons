package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Booking: ImageVector? = null

val Icons.Ss.Booking: ImageVector
    get() = _Booking ?: UXIcon(name = "Booking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 16.46f)
                lineToRelative(9f, 3.54f)
                verticalLineToRelative(4f)
                lineTo(7.54f, 24f)
                lineToRelative(-1.82f, -1.63f)
                curveToRelative(-0.92f, -0.86f, -0.96f, -2.31f, -0.1f, -3.23f)
                curveToRelative(0.86f, -0.92f, 2.31f, -0.97f, 3.23f, -0.11f)
                curveToRelative(0.03f, 0.03f, 1.07f, 0.9f, 2.15f, 1.78f)
                verticalLineToRelative(-8.82f)
                curveToRelative(0f, -1.22f, 1.08f, -2.18f, 2.34f, -1.97f)
                curveToRelative(0.98f, 0.16f, 1.66f, 1.08f, 1.66f, 2.08f)
                verticalLineToRelative(4.36f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(21f)
                close()
                moveTo(4.16f, 17.78f)
                curveToRelative(1.27f, -1.36f, 3.22f, -1.71f, 4.84f, -1.0f)
                verticalLineToRelative(-4.77f)
                curveToRelative(0f, -1.15f, 0.5f, -2.24f, 1.36f, -3f)
                lineTo(0f, 9f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.13f, -0.81f, 0.5f, -1.58f, 1.09f, -2.22f)
                close()
                moveTo(17f, 12.11f)
                verticalLineToRelative(2.99f)
                lineToRelative(4f, 1.57f)
                verticalLineToRelative(-7.67f)
                horizontalLineToRelative(-5.39f)
                curveToRelative(0.85f, 0.76f, 1.39f, 1.88f, 1.39f, 3.11f)
                close()
            }
        }.also { _Booking = it}
