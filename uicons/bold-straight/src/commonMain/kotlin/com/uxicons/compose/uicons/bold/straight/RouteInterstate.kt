package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteInterstate: ImageVector? = null

val Icons.Bs.RouteInterstate: ImageVector
    get() = _RouteInterstate ?: UXIcon(name = "RouteInterstate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.93f, 1.61f)
                curveToRelative(-0.71f, 0.29f, -1.6f, 0.41f, -2.9f, 0.39f)
                curveToRelative(-1.87f, -0.03f, -3.24f, -0.4f, -4.06f, -1.09f)
                lineToRelative(-0.96f, -0.81f)
                lineToRelative(-0.96f, 0.81f)
                curveToRelative(-0.84f, 0.7f, -2.3f, 1.11f, -4.11f, 1.14f)
                curveToRelative(-1.18f, 0.01f, -2.08f, -0.12f, -2.85f, -0.44f)
                lineTo(2f, 0.77f)
                lineTo(2f, 12f)
                curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
                lineToRelative(0.98f, 0.49f)
                lineToRelative(1.02f, -0.41f)
                curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
                lineTo(22f, 0.77f)
                lineToRelative(-2.07f, 0.85f)
                close()
                moveTo(6.98f, 5.05f)
                curveToRelative(1.46f, -0.03f, 3.4f, -0.27f, 5.02f, -1.18f)
                curveToRelative(1.28f, 0.72f, 2.92f, 1.09f, 4.97f, 1.13f)
                curveToRelative(0.75f, 0.01f, 1.42f, -0.01f, 2.03f, -0.09f)
                verticalLineToRelative(3.09f)
                lineTo(5f, 8f)
                verticalLineToRelative(-3.06f)
                curveToRelative(0.61f, 0.09f, 1.26f, 0.12f, 1.98f, 0.11f)
                close()
                moveTo(12.07f, 20.7f)
                curveToRelative(-1.93f, -1.0f, -7.07f, -4.1f, -7.07f, -8.7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 5.26f, -5.03f, 7.9f, -6.93f, 8.7f)
                close()
            }
        }.also { _RouteInterstate = it}
