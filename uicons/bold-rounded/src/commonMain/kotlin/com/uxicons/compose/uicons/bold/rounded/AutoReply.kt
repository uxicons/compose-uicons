package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoReply: ImageVector? = null

val Icons.Br.AutoReply: ImageVector
    get() = _AutoReply ?: UXIcon(name = "AutoReply") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.37f)
            lineToRelative(-4.35f, 2.75f)
            curveToRelative(-0.27f, 0.17f, -0.59f, 0.25f, -0.91f, 0.25f)
            curveTo(0.84f, 22.0f, 0.01f, 21.16f, 0.0f, 20.13f)
            lineToRelative(-0.0f, -14.63f)
            curveToRelative(0f, -1.47f, 0.57f, -2.85f, 1.61f, -3.89f)
            curveTo(2.65f, 0.57f, 4.04f, 0f, 5.5f, 0f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-0.66f, 0f, -1.29f, 0.26f, -1.76f, 0.74f)
            curveToRelative(-0.47f, 0.47f, -0.74f, 1.1f, -0.73f, 1.76f)
            lineToRelative(0.0f, 12.56f)
            lineToRelative(2.89f, -1.83f)
            curveToRelative(0.41f, -0.31f, 1.12f, -0.22f, 1.6f, -0.23f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveTo(22f, 17.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, -1.04f, -1.29f, -1.65f, -0.69f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.61f, 0.61f, 1.65f, 0.18f, 1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _AutoReply = it }
