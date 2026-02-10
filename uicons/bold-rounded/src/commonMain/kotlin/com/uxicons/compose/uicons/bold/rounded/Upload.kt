package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Upload: ImageVector? = null

val Icons.Br.Upload: ImageVector
    get() = _Upload ?: UXIcon(name = "Upload", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(165.56f, 141.89f)
            lineToRelative(59.33f, -59.35f)
            lineToRelative(0.45f, 290.82f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            lineToRelative(-0.45f, -290.45f)
            lineToRelative(58.99f, 58.99f)
            curveToRelative(12.28f, 12.71f, 32.54f, 13.06f, 45.25f, 0.79f)
            reflectiveCurveToRelative(13.06f, -32.54f, 0.79f, -45.25f)
            curveToRelative(-0.26f, -0.27f, -0.52f, -0.53f, -0.79f, -0.79f)
            lineToRelative(-68.52f, -68.52f)
            curveToRelative(-37.49f, -37.49f, -98.27f, -37.49f, -135.76f, -0f)
            curveToRelative(0f, 0f, -0f, 0f, -0f, 0f)
            lineTo(120.31f, 96.64f)
            curveToRelative(-12.28f, 12.71f, -11.93f, 32.97f, 0.79f, 45.25f)
            curveTo(133.5f, 153.87f, 153.16f, 153.87f, 165.56f, 141.89f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(480.01f, 309.36f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            verticalLineToRelative(97.94f)
            curveToRelative(-0.01f, 4.81f, -3.91f, 8.71f, -8.73f, 8.73f)
            horizontalLineTo(72.74f)
            curveToRelative(-4.81f, -0.01f, -8.71f, -3.91f, -8.73f, -8.73f)
            verticalLineToRelative(-97.94f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(97.94f)
            curveToRelative(0.05f, 40.15f, 32.58f, 72.68f, 72.72f, 72.72f)
            horizontalLineToRelative(366.55f)
            curveToRelative(40.15f, -0.05f, 72.68f, -32.58f, 72.72f, -72.72f)
            verticalLineToRelative(-97.94f)
            curveTo(512.01f, 323.68f, 497.68f, 309.36f, 480.01f, 309.36f)
            close()
        }
    }.also { _Upload = it }
