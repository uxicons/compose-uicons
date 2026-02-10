package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellConcierge: ImageVector? = null

val Icons.Sc.BellConcierge: ImageVector
    get() = _BellConcierge ?: UXIcon(name = "BellConcierge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 21.8f)
                curveToRelative(-0.17f, 0.82f, -0.98f, 1.33f, -1.77f, 1.16f)
                curveToRelative(-0.05f, -0.01f, -4.72f, -0.97f, -9.2f, -0.97f)
                reflectiveCurveToRelative(-9.15f, 0.96f, -9.2f, 0.97f)
                curveToRelative(-0.82f, 0.17f, -1.6f, -0.35f, -1.77f, -1.16f)
                curveToRelative(-0.17f, -0.81f, 0.35f, -1.6f, 1.16f, -1.77f)
                curveToRelative(0.18f, -0.04f, 4.06f, -0.83f, 8.3f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-3.79f, 0.14f, -7.35f, 0.77f, -8.11f, 0.91f)
                curveToRelative(-0.54f, 0.11f, -1.1f, -0.29f, -1.17f, -0.83f)
                curveToRelative(-0.15f, -0.98f, -0.23f, -2f, -0.23f, -3.11f)
                curveToRelative(0f, -7.19f, 2.86f, -10.53f, 9.5f, -10.95f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.55f)
                curveToRelative(6.64f, 0.42f, 9.5f, 3.76f, 9.5f, 10.95f)
                curveToRelative(0f, 1.11f, -0.07f, 2.13f, -0.23f, 3.11f)
                curveToRelative(-0.07f, 0.48f, -0.51f, 0.86f, -0.99f, 0.85f)
                curveToRelative(-0.98f, -0.14f, -4.39f, -0.79f, -8.29f, -0.93f)
                verticalLineToRelative(2.0f)
                curveToRelative(4.25f, 0.17f, 8.12f, 0.96f, 8.3f, 1.0f)
                curveToRelative(0.81f, 0.17f, 1.33f, 0.96f, 1.16f, 1.77f)
                close()
            }
        }.also { _BellConcierge = it}
