package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Ts.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9.19f)
                curveToRelative(0.36f, -0.21f, 0.69f, -0.45f, 1f, -0.73f)
                verticalLineToRelative(15.54f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(14f, 4f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1f, 0.28f, -1.27f, 0.7f)
                lineTo(9.51f, 13.97f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(4.09f, -4.16f, 4.09f, -4.16f)
                curveToRelative(0.4f, 0.1f, 0.81f, 0.16f, 1.23f, 0.17f)
                lineToRelative(-4.62f, 4.69f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 9.19f)
                close()
                moveTo(16f, 4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(17f, 4f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
            }
        }.also { _EnvelopeDot = it}
