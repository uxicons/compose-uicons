package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Br.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            verticalLineToRelative(-1f)
            curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
            horizontalLineToRelative(7f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            lineTo(13.5f, 13.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(10.5f, 3f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(23.72f, 18.82f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.61f, -0.61f, -1.65f, -0.18f, -1.65f, 0.68f)
            verticalLineToRelative(1.56f)
            lineTo(5f, 18f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, -1.04f, -1.29f, -1.65f, -0.68f)
            lineTo(0.28f, 18.82f)
            curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.61f, 0.61f, 1.65f, 0.18f, 1.65f, -0.68f)
            verticalLineToRelative(-1.56f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(1.56f)
            curveToRelative(0f, 0.86f, 1.04f, 1.29f, 1.65f, 0.68f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.99f, 0f, -1.37f)
            close()
        }
    }.also { _TextWidth = it }
