package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatSanta: ImageVector? = null

val Icons.Rs.HatSanta: ImageVector
    get() = _HatSanta ?: UXIcon(name = "HatSanta") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.81f, 17.12f)
                curveToRelative(-0.39f, -2.74f, -1.04f, -5.11f, -1.86f, -7.13f)
                curveToRelative(0.02f, 0f, 0.04f, 0.0f, 0.05f, 0.0f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                curveToRelative(-0.21f, 0f, -0.42f, 0.02f, -0.62f, 0.05f)
                lineToRelative(-0.16f, -0.11f)
                curveTo(17.8f, 0.99f, 16.33f, -0.0f, 14f, -0.0f)
                curveTo(10.66f, -0.0f, 3.97f, 3.61f, 2.11f, 17.15f)
                curveToRelative(-1.22f, 0.38f, -2.11f, 1.51f, -2.11f, 2.85f)
                verticalLineToRelative(4f)
                lineToRelative(24f, -0.0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.37f, -0.93f, -2.52f, -2.19f, -2.88f)
                close()
                moveTo(22f, 6.0f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 2.0f)
                curveToRelative(1.36f, 0f, 2.31f, 0.45f, 3.3f, 1.08f)
                curveToRelative(-0.35f, 0.33f, -0.66f, 0.72f, -0.88f, 1.16f)
                curveToRelative(-0.39f, -0.14f, -0.81f, -0.24f, -1.28f, -0.24f)
                curveToRelative(-0.29f, 0f, -0.77f, 0.11f, -1.36f, 0.36f)
                curveToRelative(2.5f, 2.22f, 5.0f, 6.18f, 6.0f, 12.64f)
                lineToRelative(-15.63f, 0.0f)
                curveTo(5.95f, 4.73f, 11.83f, 2.0f, 14f, 2.0f)
                close()
                moveTo(22f, 22.0f)
                lineToRelative(-20f, 0.0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineToRelative(18f, -0.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _HatSanta = it}
