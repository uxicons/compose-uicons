package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScrollOld: ImageVector? = null

val Icons.Br.ScrollOld: ImageVector
    get() = _ScrollOld ?: UXIcon(name = "ScrollOld") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 16f)
            horizontalLineToRelative(-0.5f)
            lineTo(20f, 4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            lineTo(4f, 0f)
            curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(11f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(3.5f, 5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1.5f)
            close()
            moveTo(10f, 19.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.34f, -0.04f, -0.68f, -0.13f, -1f)
            horizontalLineToRelative(8.13f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            close()
            moveTo(21f, 20f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-7.13f)
            curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(0.5f)
            close()
        }
    }.also { _ScrollOld = it }
