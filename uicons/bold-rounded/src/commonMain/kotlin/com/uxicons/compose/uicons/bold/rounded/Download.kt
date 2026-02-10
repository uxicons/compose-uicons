package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Download: ImageVector? = null

val Icons.Br.Download: ImageVector
    get() = _Download ?: UXIcon(name = "Download", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(188.82f, 377.6f)
            curveToRelative(37.49f, 37.49f, 98.27f, 37.49f, 135.76f, 0f)
            curveToRelative(0f, 0f, 0f, -0f, 0f, -0f)
            lineToRelative(68.52f, -68.52f)
            curveToRelative(12.71f, -12.28f, 13.06f, -32.54f, 0.79f, -45.25f)
            curveToRelative(-12.28f, -12.71f, -32.54f, -13.06f, -45.25f, -0.79f)
            curveToRelative(-0.27f, 0.26f, -0.53f, 0.52f, -0.79f, 0.79f)
            lineToRelative(-59.37f, 59.35f)
            lineTo(288f, 32f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            lineToRelative(0.45f, 290.71f)
            lineToRelative(-58.9f, -58.9f)
            curveToRelative(-12.71f, -12.28f, -32.97f, -11.93f, -45.25f, 0.79f)
            curveToRelative(-11.98f, 12.4f, -11.98f, 32.06f, 0f, 44.46f)
            lineTo(188.82f, 377.6f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(480f, 309.33f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            verticalLineToRelative(97.94f)
            curveToRelative(-0.01f, 4.81f, -3.91f, 8.71f, -8.73f, 8.73f)
            horizontalLineTo(72.72f)
            curveToRelative(-4.81f, -0.01f, -8.71f, -3.91f, -8.73f, -8.73f)
            verticalLineToRelative(-97.94f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(97.94f)
            curveTo(0.05f, 479.42f, 32.58f, 511.95f, 72.72f, 512f)
            horizontalLineToRelative(366.55f)
            curveToRelative(40.15f, -0.05f, 72.68f, -32.58f, 72.72f, -72.72f)
            verticalLineToRelative(-97.94f)
            curveTo(512f, 323.66f, 497.67f, 309.33f, 480f, 309.33f)
            close()
        }
    }.also { _Download = it }
