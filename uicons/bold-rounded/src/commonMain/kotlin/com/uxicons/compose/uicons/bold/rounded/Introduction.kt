package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Introduction: ImageVector? = null

val Icons.Br.Introduction: ImageVector
    get() = _Introduction ?: UXIcon(name = "Introduction") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 2.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3.37f)
            lineToRelative(-2.45f, 1.69f)
            curveToRelative(-0.72f, 0.46f, -1.67f, -0.06f, -1.67f, -0.92f)
            lineToRelative(-0.0f, -7.27f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            lineToRelative(5f, -0.0f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(8.5f, 12f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            close()
            moveTo(9f, 14f)
            lineTo(3f, 14f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            close()
            moveTo(5.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _Introduction = it }
