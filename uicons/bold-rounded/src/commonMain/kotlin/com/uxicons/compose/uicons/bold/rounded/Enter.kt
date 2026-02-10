package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Enter: ImageVector? = null

val Icons.Br.Enter: ImageVector
    get() = _Enter ?: UXIcon(name = "Enter", viewportWidth = 512f, viewportHeight = 512f) {
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
            moveTo(480.03f, 224f)
            lineToRelative(-290.99f, 0.58f)
            lineToRelative(73.94f, -73.94f)
            curveToRelative(12.5f, -12.49f, 12.51f, -32.76f, 0.01f, -45.26f)
            reflectiveCurveToRelative(-32.76f, -12.51f, -45.26f, -0.01f)
            lineToRelative(-82.75f, 82.75f)
            curveToRelative(-37.49f, 37.49f, -37.49f, 98.27f, -0f, 135.76f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            lineToRelative(82.75f, 82.75f)
            curveToRelative(12.5f, 12.49f, 32.76f, 12.49f, 45.26f, -0.01f)
            reflectiveCurveToRelative(12.49f, -32.76f, -0.01f, -45.26f)
            lineToRelative(-72.81f, -72.79f)
            lineTo(480.03f, 288f)
            curveToRelative(17.67f, -0.04f, 31.97f, -14.39f, 31.94f, -32.06f)
            reflectiveCurveTo(497.58f, 223.96f, 479.9f, 224f)
            horizontalLineTo(480.03f)
            close()
        }
    }.also { _Enter = it }
