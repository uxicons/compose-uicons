package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReservationSmartphone: ImageVector? = null

val Icons.Bs.ReservationSmartphone: ImageVector
    get() = _ReservationSmartphone ?: UXIcon(name = "ReservationSmartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.11f, 11f)
                horizontalLineToRelative(-5.2f)
                lineToRelative(1.71f, 6f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.75f)
                lineToRelative(-2.57f, -9f)
                horizontalLineToRelative(-4.18f)
                curveToRelative(-0.75f, 0f, -1.44f, -0.54f, -1.56f, -1.27f)
                curveToRelative(-0.15f, -0.94f, 0.57f, -1.74f, 1.48f, -1.74f)
                lineToRelative(7.39f, 0.01f)
                lineToRelative(-0.83f, -1.15f)
                curveToRelative(-0.72f, -0.87f, -0.6f, -2.15f, 0.26f, -2.87f)
                curveToRelative(0.87f, -0.72f, 2.15f, -0.6f, 2.87f, 0.26f)
                lineToRelative(2.89f, 3.77f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.29f, 13f)
                lineToRelative(1.71f, 5.99f)
                verticalLineToRelative(2.01f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                lineTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.29f)
                close()
                moveTo(10.01f, 20.01f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }.also { _ReservationSmartphone = it}
