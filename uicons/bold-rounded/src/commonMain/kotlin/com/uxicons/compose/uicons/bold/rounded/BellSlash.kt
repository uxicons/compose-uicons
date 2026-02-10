package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Br.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.06f, 17.03f)
            lineToRelative(4.45f, 4.45f)
            curveToRelative(-0.95f, 1.48f, -2.56f, 2.52f, -4.41f, 2.52f)
            curveToRelative(-2.41f, 0f, -4.43f, -1.77f, -5.08f, -3.97f)
            horizontalLineToRelative(-0.53f)
            curveToRelative(-1.68f, 0f, -3.24f, -0.75f, -4.29f, -2.06f)
            curveToRelative(-1.05f, -1.31f, -1.44f, -3.0f, -1.08f, -4.63f)
            lineToRelative(1.44f, -5.79f)
            lineToRelative(2.48f, 2.48f)
            lineToRelative(-0.99f, 3.97f)
            curveToRelative(-0.17f, 0.74f, 0.01f, 1.51f, 0.49f, 2.11f)
            curveToRelative(0.48f, 0.59f, 1.19f, 0.94f, 1.95f, 0.94f)
            horizontalLineToRelative(5.56f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.45f, 2.45f)
            curveToRelative(1.73f, -1.8f, 4.15f, -2.89f, 6.82f, -2.89f)
            curveToRelative(4.23f, 0f, 7.97f, 2.84f, 9.1f, 6.92f)
            lineToRelative(1.87f, 6.14f)
            curveToRelative(0.46f, 1.67f, 0.13f, 3.42f, -0.92f, 4.8f)
            curveToRelative(-0.28f, 0.36f, -0.59f, 0.69f, -0.94f, 0.96f)
            lineToRelative(2.62f, 2.62f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            close()
            moveTo(7.14f, 5.02f)
            lineToRelative(11.64f, 11.64f)
            curveToRelative(0.27f, -0.16f, 0.5f, -0.37f, 0.7f, -0.63f)
            curveToRelative(0.48f, -0.63f, 0.63f, -1.42f, 0.42f, -2.18f)
            lineToRelative(-1.87f, -6.14f)
            curveToRelative(-0.77f, -2.78f, -3.33f, -4.72f, -6.21f, -4.72f)
            curveToRelative(-1.84f, 0f, -3.51f, 0.76f, -4.68f, 2.02f)
            close()
        }
    }.also { _BellSlash = it }
