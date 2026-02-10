package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseArrowRight: ImageVector? = null

val Icons.Br.BriefcaseArrowRight: ImageVector
    get() = _BriefcaseArrowRight ?: UXIcon(name = "BriefcaseArrowRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-0.63f)
            curveToRelative(-0.45f, -1.72f, -2.01f, -3f, -3.87f, -3f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
            horizontalLineToRelative(-0.63f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 8.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(10f)
            close()
            moveTo(17.87f, 12.79f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-3.16f, 3.16f)
            curveToRelative(-0.63f, 0.63f, -1.71f, 0.18f, -1.71f, -0.71f)
            verticalLineToRelative(-1.66f)
            lineTo(7.5f, 14.99f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-1.66f)
            curveToRelative(0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f)
            lineToRelative(3.16f, 3.16f)
            close()
        }
    }.also { _BriefcaseArrowRight = it }
