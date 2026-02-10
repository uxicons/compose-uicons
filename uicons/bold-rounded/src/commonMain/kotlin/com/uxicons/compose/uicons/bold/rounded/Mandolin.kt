package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mandolin: ImageVector? = null

val Icons.Br.Mandolin: ImageVector
    get() = _Mandolin ?: UXIcon(name = "Mandolin") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.49f, 1.6f)
            lineToRelative(-1.09f, -1.09f)
            curveToRelative(-0.6f, -0.6f, -1.56f, -0.69f, -2.25f, -0.19f)
            lineToRelative(-1.15f, 0.9f)
            curveToRelative(-0.64f, 0.5f, -1.04f, 1.23f, -1.13f, 2.03f)
            lineToRelative(-0.1f, 0.86f)
            lineToRelative(-1.89f, 1.89f)
            horizontalLineToRelative(-6.88f)
            curveTo(4.04f, 6f, 0f, 10.04f, 0f, 15f)
            curveToRelative(0f, 2.4f, 0.94f, 4.66f, 2.64f, 6.37f)
            curveToRelative(1.7f, 1.7f, 3.96f, 2.63f, 6.36f, 2.63f)
            curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
            verticalLineToRelative(-6.88f)
            lineToRelative(1.89f, -1.89f)
            lineToRelative(0.86f, -0.1f)
            curveToRelative(0.8f, -0.09f, 1.53f, -0.5f, 2.03f, -1.13f)
            lineToRelative(0.9f, -1.15f)
            curveToRelative(0.49f, -0.7f, 0.41f, -1.65f, -0.19f, -2.25f)
            close()
            moveTo(15f, 15f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            curveToRelative(-1.6f, 0f, -3.11f, -0.62f, -4.24f, -1.76f)
            curveToRelative(-1.13f, -1.13f, -1.76f, -2.64f, -1.76f, -4.24f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            horizontalLineToRelative(3.88f)
            lineToRelative(-3.1f, 3.1f)
            curveToRelative(-0.25f, -0.07f, -0.51f, -0.1f, -0.78f, -0.1f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -0.27f, -0.04f, -0.53f, -0.1f, -0.78f)
            lineToRelative(3.1f, -3.1f)
            verticalLineToRelative(3.88f)
            close()
        }
    }.also { _Mandolin = it }
