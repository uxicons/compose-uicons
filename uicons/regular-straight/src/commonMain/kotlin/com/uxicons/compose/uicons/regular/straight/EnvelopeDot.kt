package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Rs.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.65f)
                curveToRelative(0.75f, -0.26f, 1.42f, -0.67f, 2f, -1.19f)
                verticalLineToRelative(15.54f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(14.09f, 3f)
                curveToRelative(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1f)
                reflectiveCurveToRelative(0.04f, 0.67f, 0.09f, 1f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(4.33f, -4.33f)
                curveToRelative(0.49f, 0.13f, 1.01f, 0.21f, 1.55f, 0.21f)
                curveToRelative(0.41f, 0f, 0.8f, -0.04f, 1.19f, -0.12f)
                lineToRelative(-5.65f, 5.65f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(12.93f)
                lineTo(22f, 22f)
                lineTo(22f, 9.65f)
                close()
                moveTo(16f, 4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(18f, 4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _EnvelopeDot = it}
