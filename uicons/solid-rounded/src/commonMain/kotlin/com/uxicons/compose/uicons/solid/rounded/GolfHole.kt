package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Sr.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.69f)
                lineToRelative(6.67f, -3.27f)
                curveToRelative(0.76f, -0.4f, 1.26f, -1.15f, 1.32f, -2.01f)
                curveToRelative(0.07f, -0.86f, -0.31f, -1.68f, -1.03f, -2.21f)
                lineTo(14.77f, 0.32f)
                curveToRelative(-0.04f, -0.02f, -0.07f, -0.05f, -0.11f, -0.07f)
                curveToRelative(-0.76f, -0.38f, -1.76f, -0.33f, -2.49f, 0.12f)
                curveToRelative(-0.44f, 0.27f, -1.17f, 0.93f, -1.17f, 2.32f)
                verticalLineToRelative(14.31f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(16.18f, 12.36f)
                curveToRelative(-0.29f, -0.05f, -0.59f, 0.03f, -0.82f, 0.22f)
                reflectiveCurveToRelative(-0.36f, 0.47f, -0.36f, 0.77f)
                verticalLineToRelative(3.66f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-3.66f)
                curveToRelative(0f, -0.3f, -0.13f, -0.58f, -0.36f, -0.77f)
                reflectiveCurveToRelative(-0.52f, -0.27f, -0.82f, -0.22f)
                curveToRelative(-4.83f, 0.85f, -7.83f, 3.02f, -7.83f, 5.64f)
                curveToRelative(0f, 3.42f, 5.16f, 6f, 12f, 6f)
                reflectiveCurveToRelative(12f, -2.58f, 12f, -6f)
                curveToRelative(0f, -2.63f, -3.0f, -4.79f, -7.83f, -5.64f)
                close()
            }
        }.also { _GolfHole = it}
