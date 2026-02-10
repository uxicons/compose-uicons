package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sailboat: ImageVector? = null

val Icons.Sr.Sailboat: ImageVector
    get() = _Sailboat ?: UXIcon(name = "Sailboat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 24f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(-5.72f, 0f, -8.21f, -3.25f, -9.18f, -5.19f)
                curveToRelative(-0.41f, -0.81f, -0.36f, -1.76f, 0.12f, -2.54f)
                curveToRelative(0.49f, -0.79f, 1.33f, -1.27f, 2.27f, -1.27f)
                horizontalLineToRelative(18.68f)
                curveToRelative(0.93f, 0f, 1.78f, 0.48f, 2.27f, 1.27f)
                curveToRelative(0.48f, 0.78f, 0.52f, 1.73f, 0.1f, 2.55f)
                curveToRelative(-0.99f, 1.94f, -3.5f, 5.18f, -9.21f, 5.18f)
                close()
                moveTo(7.67f, 13f)
                lineTo(2.33f, 13f)
                curveToRelative(-0.92f, 0f, -1.76f, -0.54f, -2.13f, -1.39f)
                curveToRelative(-0.38f, -0.84f, -0.22f, -1.82f, 0.4f, -2.51f)
                lineTo(5.91f, 2.8f)
                curveToRelative(0.67f, -0.74f, 1.7f, -0.99f, 2.59f, -0.64f)
                curveToRelative(0.89f, 0.34f, 1.5f, 1.22f, 1.5f, 2.18f)
                lineToRelative(0.0f, 6.33f)
                curveToRelative(0f, 0.62f, -0.24f, 1.21f, -0.68f, 1.65f)
                curveToRelative(-0.44f, 0.44f, -1.03f, 0.69f, -1.65f, 0.69f)
                close()
                moveTo(21.67f, 13f)
                horizontalLineToRelative(-7.33f)
                curveToRelative(-0.62f, 0f, -1.21f, -0.24f, -1.65f, -0.68f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.44f, -0.44f, -0.68f, -1.03f, -0.68f, -1.65f)
                lineToRelative(0.0f, -8.33f)
                curveToRelative(0.0f, -0.96f, 0.6f, -1.84f, 1.5f, -2.18f)
                curveToRelative(0.89f, -0.34f, 1.92f, -0.1f, 2.57f, 0.62f)
                lineToRelative(7.34f, 8.34f)
                curveToRelative(0.61f, 0.68f, 0.76f, 1.66f, 0.39f, 2.5f)
                curveToRelative(-0.38f, 0.84f, -1.21f, 1.39f, -2.13f, 1.39f)
                close()
            }
        }.also { _Sailboat = it}
