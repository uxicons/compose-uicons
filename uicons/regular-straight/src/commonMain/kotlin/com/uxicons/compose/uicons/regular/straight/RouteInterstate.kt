package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteInterstate: ImageVector? = null

val Icons.Rs.RouteInterstate: ImageVector
    get() = _RouteInterstate ?: UXIcon(name = "RouteInterstate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.62f, 1.43f)
                curveToRelative(-0.97f, 0.4f, -2.16f, 0.61f, -3.4f, 0.58f)
                curveToRelative(-1.84f, -0.03f, -3.47f, -0.56f, -4.58f, -1.49f)
                lineTo(12f, -0.02f)
                lineToRelative(-0.64f, 0.54f)
                curveToRelative(-1.11f, 0.93f, -2.73f, 1.46f, -4.58f, 1.49f)
                curveToRelative(-1.24f, 0.01f, -2.43f, -0.19f, -3.4f, -0.58f)
                lineToRelative(-1.38f, -0.56f)
                lineTo(2f, 11.97f)
                curveToRelative(0f, 6.57f, 7.01f, 10.58f, 9.15f, 11.65f)
                lineToRelative(0.81f, 0.4f)
                lineToRelative(0.84f, -0.34f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                lineTo(22f, 0.86f)
                lineToRelative(-1.38f, 0.56f)
                close()
                moveTo(6.82f, 4.01f)
                curveToRelative(1.98f, -0.04f, 3.79f, -0.56f, 5.18f, -1.48f)
                curveToRelative(1.39f, 0.92f, 3.2f, 1.44f, 5.18f, 1.48f)
                curveToRelative(0.95f, 0.01f, 1.93f, -0.09f, 2.82f, -0.3f)
                verticalLineToRelative(4.29f)
                lineTo(4f, 8.01f)
                lineTo(4f, 3.71f)
                curveToRelative(0.89f, 0.21f, 1.87f, 0.31f, 2.82f, 0.3f)
                close()
                moveTo(12.05f, 21.84f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.44f, -8.05f, -9.86f)
                verticalLineToRelative(-1.97f)
                lineTo(20f, 10.01f)
                verticalLineToRelative(1.97f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                close()
            }
        }.also { _RouteInterstate = it}
