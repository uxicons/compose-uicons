package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Ss.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(17.79f, 0f, 20f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(9.88f, 14.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(4.33f, -4.33f)
                curveToRelative(-2.56f, -0.68f, -4.45f, -3.01f, -4.45f, -5.79f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.65f, -2.64f, 1.6f)
                lineTo(9.88f, 14.12f)
                close()
                moveTo(21.19f, 9.88f)
                lineToRelative(-5.65f, 5.65f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(0f, 7.07f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 8.46f)
                curveToRelative(-0.78f, 0.7f, -1.74f, 1.2f, -2.81f, 1.42f)
                close()
            }
        }.also { _EnvelopeDot = it}
