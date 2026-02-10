package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exit: ImageVector? = null

val Icons.Br.Exit: ImageVector
    get() = _Exit ?: UXIcon(name = "Exit", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(170.7f, 448f)
            horizontalLineTo(72.76f)
            curveToRelative(-4.81f, -0.01f, -8.71f, -3.91f, -8.73f, -8.73f)
            verticalLineTo(72.72f)
            curveToRelative(0.01f, -4.81f, 3.91f, -8.71f, 8.73f, -8.73f)
            horizontalLineToRelative(97.94f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
            horizontalLineTo(72.76f)
            curveTo(32.61f, 0.05f, 0.08f, 32.58f, 0.03f, 72.72f)
            verticalLineToRelative(366.55f)
            curveTo(0.08f, 479.42f, 32.61f, 511.95f, 72.76f, 512f)
            horizontalLineToRelative(97.94f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(188.37f, 448f, 170.7f, 448f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(483.91f, 188.12f)
            lineToRelative(-82.82f, -82.75f)
            curveToRelative(-12.5f, -12.49f, -32.76f, -12.49f, -45.26f, 0.01f)
            reflectiveCurveToRelative(-12.49f, 32.76f, 0.01f, 45.26f)
            lineToRelative(72.79f, 72.77f)
            lineTo(138.7f, 224f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            lineToRelative(291.11f, -0.53f)
            lineToRelative(-73.96f, 73.96f)
            curveToRelative(-12.04f, 12.94f, -11.32f, 33.18f, 1.62f, 45.23f)
            curveToRelative(12.3f, 11.44f, 31.35f, 11.44f, 43.63f, -0.02f)
            lineToRelative(82.75f, -82.75f)
            curveToRelative(37.49f, -37.49f, 37.49f, -98.27f, 0f, -135.76f)
            curveToRelative(0f, 0f, -0f, -0f, -0f, -0f)
            lineTo(483.91f, 188.12f)
            close()
        }
    }.also { _Exit = it }
