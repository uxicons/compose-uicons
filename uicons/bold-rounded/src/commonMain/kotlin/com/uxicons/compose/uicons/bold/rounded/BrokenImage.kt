package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Br.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.39f, 4.27f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            lineTo(7.5f, -0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 8.16f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            close()
            moveTo(7.5f, 3f)
            horizontalLineToRelative(5.5f)
            lineTo(13f, 7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4.86f)
            lineToRelative(-1.06f, -1.06f)
            curveToRelative(-1.06f, -1.06f, -2.79f, -1.06f, -3.85f, 0f)
            lineToRelative(-2.07f, 2.07f)
            lineToRelative(-2.07f, -2.07f)
            curveToRelative(-1.06f, -1.06f, -2.79f, -1.06f, -3.85f, 0f)
            lineToRelative(-1.09f, 1.09f)
            lineTo(5.01f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(16.5f, 21f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-0.38f)
            reflectiveCurveToRelative(0.04f, -0.04f, 0.06f, -0.06f)
            lineToRelative(2.95f, -2.95f)
            lineToRelative(2.07f, 2.07f)
            curveToRelative(1.06f, 1.06f, 2.79f, 1.06f, 3.85f, 0f)
            lineToRelative(2.07f, -2.07f)
            lineToRelative(2.94f, 2.94f)
            reflectiveCurveToRelative(0.03f, 0.03f, 0.05f, 0.05f)
            verticalLineToRelative(0.4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _BrokenImage = it }
