package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextHeight: ImageVector? = null

val Icons.Br.TextHeight: ImageVector
    get() = _TextHeight ?: UXIcon(name = "TextHeight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3f)
            lineTo(12f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(9f, 3f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            lineTo(15.5f, 0f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(22.56f, 19f)
            horizontalLineToRelative(-1.56f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.86f, 0f, 1.29f, -1.04f, 0.68f, -1.65f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.68f, 1.65f)
            horizontalLineToRelative(1.56f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-0.86f, 0f, -1.29f, 1.04f, -0.68f, 1.65f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.38f, 0.38f, 0.99f, 0.38f, 1.37f, 0f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.61f, -0.61f, 0.18f, -1.65f, -0.68f, -1.65f)
            close()
        }
    }.also { _TextHeight = it }
