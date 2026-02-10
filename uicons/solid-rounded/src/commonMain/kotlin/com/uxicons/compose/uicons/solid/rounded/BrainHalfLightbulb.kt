package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrainHalfLightbulb: ImageVector? = null

val Icons.Sr.BrainHalfLightbulb: ImageVector
    get() = _BrainHalfLightbulb ?: UXIcon(name = "BrainHalfLightbulb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 24f)
                curveToRelative(-2.41f, 0f, -4.31f, -1.28f, -5.39f, -3.63f)
                curveToRelative(-1.58f, -0.78f, -2.61f, -2.4f, -2.61f, -4.18f)
                curveToRelative(0f, -0.9f, 0.26f, -1.77f, 0.74f, -2.52f)
                curveToRelative(-0.52f, -0.81f, -0.79f, -1.72f, -0.79f, -2.67f)
                curveToRelative(0f, -1.08f, 0.38f, -2.57f, 2.1f, -3.75f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -1.82f, 1.31f, -3.21f, 3.23f, -3.54f)
                curveToRelative(0.37f, -1.86f, 1.85f, -3.22f, 3.67f, -3.22f)
                curveToRelative(2.01f, 0f, 4.05f, 1.37f, 4.05f, 4f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.57f, -2.43f, 5f, -5f, 5f)
                close()
                moveTo(14.25f, 21.98f)
                curveToRelative(0.08f, 0.01f, 0.15f, 0.02f, 0.23f, 0.02f)
                horizontalLineToRelative(3.02f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(0f, 1.04f, -0.28f, 2.06f, -0.75f, 2.98f)
                close()
                moveTo(21.61f, 4.3f)
                curveToRelative(-1.54f, -1.52f, -3.58f, -2.33f, -5.75f, -2.29f)
                curveToRelative(-0.39f, 0.01f, -0.77f, 0.05f, -1.14f, 0.11f)
                curveToRelative(0.17f, 0.57f, 0.28f, 1.2f, 0.28f, 1.89f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(3.47f)
                curveToRelative(0.23f, -0.39f, 0.52f, -0.76f, 0.91f, -1.08f)
                curveToRelative(0.66f, -0.55f, 1.28f, -1.16f, 1.66f, -1.93f)
                curveToRelative(1.74f, -3.51f, 1.05f, -7.26f, -1.43f, -9.69f)
                close()
            }
        }.also { _BrainHalfLightbulb = it}
