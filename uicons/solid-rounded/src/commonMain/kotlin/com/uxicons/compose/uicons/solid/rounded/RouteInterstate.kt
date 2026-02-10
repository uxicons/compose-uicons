package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteInterstate: ImageVector? = null

val Icons.Sr.RouteInterstate: ImageVector
    get() = _RouteInterstate ?: UXIcon(name = "RouteInterstate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 8.01f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -1.87f, 1.45f, -3.22f, 3.45f, -3.22f)
                lineToRelative(1.35f, 0.01f)
                curveToRelative(1.31f, 0f, 1.92f, -0.43f, 2.69f, -0.98f)
                curveToRelative(0.32f, -0.23f, 0.64f, -0.45f, 0.99f, -0.65f)
                curveToRelative(0.94f, -0.52f, 2.06f, -0.52f, 3.0f, 0f)
                curveToRelative(0.35f, 0.19f, 0.67f, 0.41f, 0.98f, 0.63f)
                curveToRelative(0.79f, 0.55f, 1.42f, 0.99f, 2.73f, 0.99f)
                lineToRelative(1.35f, -0.01f)
                curveToRelative(2.0f, 0f, 3.45f, 1.35f, 3.45f, 3.22f)
                verticalLineToRelative(2.79f)
                lineTo(2f, 8.0f)
                close()
                moveTo(2f, 10.01f)
                verticalLineToRelative(2.39f)
                curveToRelative(0f, 5.5f, 4.89f, 9.2f, 7.8f, 10.91f)
                lineToRelative(0.15f, 0.09f)
                curveToRelative(0.49f, 0.29f, 1f, 0.6f, 2.06f, 0.6f)
                curveToRelative(1.1f, 0f, 1.75f, -0.29f, 2.43f, -0.65f)
                curveToRelative(2.83f, -1.48f, 7.57f, -4.87f, 7.57f, -10.96f)
                verticalLineToRelative(-2.39f)
                lineTo(2f, 10.01f)
                close()
            }
        }.also { _RouteInterstate = it}
