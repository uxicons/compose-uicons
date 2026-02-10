package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FanTable: ImageVector? = null

val Icons.Br.FanTable: ImageVector
    get() = _FanTable ?: UXIcon(name = "FanTable") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 9.5f)
            curveTo(21.5f, 4.26f, 17.24f, 0f, 12f, 0f)
            reflectiveCurveTo(2.5f, 4.26f, 2.5f, 9.5f)
            curveToRelative(0f, 4.73f, 3.47f, 8.65f, 8f, 9.37f)
            verticalLineToRelative(2.13f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-2.13f)
            curveToRelative(4.53f, -0.72f, 8f, -4.64f, 8f, -9.37f)
            close()
            moveTo(9.76f, 3.4f)
            curveToRelative(0.53f, 2.05f, 1.7f, 5.15f, 2.24f, 6.1f)
            curveToRelative(0.54f, -0.95f, 1.71f, -4.05f, 2.24f, -6.09f)
            curveToRelative(2.48f, 0.91f, 4.26f, 3.3f, 4.26f, 6.09f)
            curveToRelative(0f, 0.49f, -0.06f, 0.97f, -0.17f, 1.43f)
            curveToRelative(-2.01f, -0.67f, -5.24f, -1.43f, -6.33f, -1.43f)
            curveToRelative(0.54f, 0.91f, 2.47f, 3.54f, 3.95f, 5.15f)
            curveToRelative(-1.1f, 0.84f, -2.46f, 1.35f, -3.95f, 1.35f)
            reflectiveCurveToRelative(-2.85f, -0.51f, -3.95f, -1.35f)
            curveToRelative(1.48f, -1.6f, 3.41f, -4.24f, 3.95f, -5.15f)
            curveToRelative(-1.09f, 0.0f, -4.33f, 0.76f, -6.33f, 1.43f)
            curveToRelative(-0.1f, -0.46f, -0.17f, -0.94f, -0.17f, -1.43f)
            curveToRelative(0f, -2.8f, 1.78f, -5.18f, 4.26f, -6.1f)
            close()
        }
    }.also { _FanTable = it }
