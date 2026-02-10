package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Bs.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 3.5f)
                verticalLineToRelative(15.38f)
                lineToRelative(-4.93f, -4.93f)
                curveToRelative(1.18f, -0.92f, 1.94f, -2.36f, 1.94f, -3.94f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.93f, 0f, -1.78f, 0.37f, -2.41f, 0.97f)
                lineToRelative(-2.97f, -2.97f)
                horizontalLineToRelative(15.38f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(13.9f, 11.78f)
                lineToRelative(-3.69f, -3.69f)
                curveToRelative(0.08f, -0.06f, 0.18f, -0.09f, 0.29f, -0.09f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.77f, -0.44f, 1.45f, -1.1f, 1.78f)
                close()
                moveTo(3f, 5.12f)
                lineToRelative(15.88f, 15.88f)
                lineTo(3f, 21f)
                lineTo(3f, 5.12f)
                close()
                moveTo(10.05f, 15f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.05f)
                lineToRelative(3.05f, 3.05f)
                close()
            }
        }.also { _ParkingSlash = it}
