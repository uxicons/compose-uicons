package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Booking: ImageVector? = null

val Icons.Bs.Booking: ImageVector
    get() = _Booking ?: UXIcon(name = "Booking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.41f, 17f)
                curveToRelative(-0.71f, 0.87f, -0.99f, 1.95f, -0.86f, 3f)
                lineTo(0f, 20f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1.5f)
                lineTo(5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(9.82f)
                lineToRelative(-3f, -0.86f)
                verticalLineToRelative(-6.46f)
                lineTo(3f, 8f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3.41f)
                close()
                moveTo(15f, 15.68f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0f, -0.75f, -0.54f, -1.44f, -1.27f, -1.56f)
                curveToRelative(-0.94f, -0.15f, -1.74f, 0.57f, -1.74f, 1.48f)
                lineToRelative(0.01f, 7.39f)
                lineToRelative(-1.15f, -0.83f)
                curveToRelative(-0.87f, -0.72f, -2.15f, -0.6f, -2.87f, 0.26f)
                curveToRelative(-0.72f, 0.87f, -0.6f, 2.15f, 0.26f, 2.87f)
                lineToRelative(3.77f, 2.89f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.2f)
                lineToRelative(6f, 1.71f)
                verticalLineToRelative(3.48f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.75f)
                lineToRelative(-9f, -2.57f)
                close()
            }
        }.also { _Booking = it}
