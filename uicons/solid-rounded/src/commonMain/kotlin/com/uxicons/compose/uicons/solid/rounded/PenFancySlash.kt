package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancySlash: ImageVector? = null

val Icons.Sr.PenFancySlash: ImageVector
    get() = _PenFancySlash ?: UXIcon(name = "PenFancySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 22.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineTo(0.29f, 1.71f)
                curveTo(-0.1f, 1.32f, -0.1f, 0.68f, 0.29f, 0.29f)
                reflectiveCurveTo(1.32f, -0.1f, 1.71f, 0.29f)
                lineToRelative(9.2f, 9.2f)
                lineTo(19.67f, 0.74f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                reflectiveCurveToRelative(-0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-8.76f, 8.76f)
                lineToRelative(9.21f, 9.21f)
                close()
                moveTo(4.68f, 12.32f)
                curveToRelative(-1.44f, 0.45f, -2.55f, 1.65f, -2.89f, 3.11f)
                lineTo(0.12f, 22.53f)
                lineToRelative(5.2f, -5.2f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-5.2f, 5.2f)
                lineToRelative(7.09f, -1.66f)
                curveToRelative(1.47f, -0.34f, 2.66f, -1.45f, 3.11f, -2.89f)
                lineToRelative(0.85f, -2.69f)
                lineToRelative(-5.21f, -5.21f)
                lineToRelative(-2.71f, 0.83f)
                close()
            }
        }.also { _PenFancySlash = it}
