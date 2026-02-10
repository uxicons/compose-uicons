package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leave: ImageVector? = null

val Icons.Br.Leave: ImageVector
    get() = _Leave ?: UXIcon(name = "Leave") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9f, 12.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18f, 19.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(2.5f, 24f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(0f, 5.71f)
            curveTo(0f, 3.34f, 1.69f, 1.27f, 4.02f, 0.81f)
            lineTo(7.62f, 0.09f)
            curveToRelative(1.33f, -0.27f, 2.69f, 0.07f, 3.74f, 0.93f)
            curveToRelative(0.34f, 0.28f, 0.62f, 0.62f, 0.86f, 0.98f)
            horizontalLineToRelative(1.28f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(16f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(10f, 4.5f)
            curveToRelative(0f, -0.45f, -0.2f, -0.87f, -0.55f, -1.16f)
            curveToRelative(-0.35f, -0.29f, -0.8f, -0.4f, -1.25f, -0.31f)
            lineToRelative(-3.6f, 0.72f)
            curveToRelative(-0.93f, 0.19f, -1.61f, 1.01f, -1.61f, 1.96f)
            verticalLineToRelative(15.29f)
            horizontalLineToRelative(7f)
            lineTo(10.0f, 4.5f)
            close()
            moveTo(23.77f, 13.91f)
            lineToRelative(-2.45f, -2.66f)
            curveToRelative(-0.49f, -0.53f, -1.32f, -0.15f, -1.32f, 0.59f)
            verticalLineToRelative(1.16f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(1.16f)
            curveToRelative(0f, 0.75f, 0.83f, 1.12f, 1.32f, 0.59f)
            lineToRelative(2.45f, -2.66f)
            curveToRelative(0.3f, -0.33f, 0.3f, -0.86f, 0f, -1.19f)
            close()
        }
    }.also { _Leave = it }
