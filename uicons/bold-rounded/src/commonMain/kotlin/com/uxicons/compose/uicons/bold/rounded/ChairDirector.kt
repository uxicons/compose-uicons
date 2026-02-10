package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Br.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(3f, 2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(0f, 0.67f, 0f, 1.5f)
            lineTo(0f, 10.97f)
            curveToRelative(0f, 2.11f, 1.23f, 4.07f, 3.15f, 4.97f)
            lineToRelative(5.35f, 2.53f)
            lineToRelative(-5.64f, 2.67f)
            curveToRelative(-0.75f, 0.35f, -1.07f, 1.25f, -0.71f, 2.0f)
            curveToRelative(0.35f, 0.76f, 1.27f, 1.06f, 2.0f, 0.71f)
            lineToRelative(7.86f, -3.72f)
            lineToRelative(7.86f, 3.72f)
            curveToRelative(0.73f, 0.35f, 1.64f, 0.04f, 2.0f, -0.71f)
            curveToRelative(0.35f, -0.75f, 0.04f, -1.64f, -0.71f, -2.0f)
            lineToRelative(-5.64f, -2.67f)
            lineToRelative(5.35f, -2.53f)
            curveToRelative(1.91f, -0.91f, 3.15f, -2.86f, 3.15f, -4.97f)
            lineTo(24f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(21f, 8f)
            verticalLineToRelative(2.82f)
            curveToRelative(-1.16f, 0.35f, -4.39f, 1.18f, -9f, 1.18f)
            reflectiveCurveToRelative(-7.84f, -0.83f, -9f, -1.18f)
            verticalLineToRelative(-2.82f)
            lineTo(21f, 8f)
            close()
            moveTo(7.69f, 14.77f)
            curveToRelative(1.27f, 0.14f, 2.72f, 0.23f, 4.31f, 0.23f)
            reflectiveCurveToRelative(3.04f, -0.09f, 4.31f, -0.23f)
            lineToRelative(-4.31f, 2.04f)
            lineToRelative(-4.31f, -2.04f)
            close()
        }
    }.also { _ChairDirector = it }
