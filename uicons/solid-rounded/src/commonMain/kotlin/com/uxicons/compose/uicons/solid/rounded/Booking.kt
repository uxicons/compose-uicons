package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Booking: ImageVector? = null

val Icons.Sr.Booking: ImageVector
    get() = _Booking ?: UXIcon(name = "Booking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7f)
                lineTo(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(20.84f, 18.82f)
                lineToRelative(-5.83f, -2.29f)
                verticalLineToRelative(-5.46f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(9.92f)
                curveToRelative(-1.08f, -0.89f, -2.11f, -1.75f, -2.15f, -1.78f)
                curveToRelative(-0.92f, -0.86f, -2.37f, -0.81f, -3.23f, 0.11f)
                curveToRelative(-0.86f, 0.92f, -0.82f, 2.37f, 0.1f, 3.23f)
                lineToRelative(1.82f, 1.63f)
                horizontalLineToRelative(16.46f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -2.06f, -1.26f, -3.9f, -3.17f, -4.65f)
                close()
                moveTo(9.01f, 16.84f)
                verticalLineToRelative(-5.88f)
                curveToRelative(0f, -0.7f, 0.2f, -1.37f, 0.54f, -1.96f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.11f, 1.32f, 3.92f, 3.18f, 4.65f)
                curveToRelative(0.18f, -0.65f, 0.49f, -1.28f, 0.98f, -1.8f)
                curveToRelative(1.27f, -1.36f, 3.22f, -1.71f, 4.84f, -1.0f)
                close()
                moveTo(20.71f, 16.62f)
                curveToRelative(0.18f, -0.51f, 0.29f, -1.05f, 0.29f, -1.62f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4.54f)
                curveToRelative(0.35f, 0.61f, 0.55f, 1.32f, 0.55f, 2.07f)
                verticalLineToRelative(4.1f)
                lineToRelative(3.7f, 1.45f)
                close()
            }
        }.also { _Booking = it}
