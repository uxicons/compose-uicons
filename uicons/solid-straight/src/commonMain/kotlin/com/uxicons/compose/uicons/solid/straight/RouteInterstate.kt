package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteInterstate: ImageVector? = null

val Icons.Ss.RouteInterstate: ImageVector
    get() = _RouteInterstate ?: UXIcon(name = "RouteInterstate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8.01f)
                lineTo(2f, 0.86f)
                lineToRelative(1.38f, 0.56f)
                curveToRelative(0.97f, 0.4f, 2.16f, 0.6f, 3.4f, 0.58f)
                curveToRelative(1.84f, -0.03f, 3.47f, -0.56f, 4.58f, -1.49f)
                lineTo(12f, -0.02f)
                lineToRelative(0.64f, 0.54f)
                curveToRelative(1.11f, 0.93f, 2.73f, 1.46f, 4.58f, 1.49f)
                curveToRelative(1.24f, 0.02f, 2.43f, -0.19f, 3.4f, -0.58f)
                lineToRelative(1.38f, -0.56f)
                verticalLineToRelative(7.14f)
                lineTo(2f, 8.01f)
                close()
                moveTo(2f, 10.01f)
                verticalLineToRelative(1.97f)
                curveToRelative(0f, 6.57f, 7.01f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-1.97f)
                lineTo(2f, 10.0f)
                close()
            }
        }.also { _RouteInterstate = it}
