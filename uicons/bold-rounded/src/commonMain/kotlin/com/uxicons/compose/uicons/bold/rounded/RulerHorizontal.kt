package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerHorizontal: ImageVector? = null

val Icons.Br.RulerHorizontal: ImageVector
    get() = _RulerHorizontal ?: UXIcon(name = "RulerHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 6f)
            lineTo(4f, 6f)
            curveTo(1.79f, 6f, 0f, 7.79f, 0f, 10f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            lineTo(20f, 17f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(21f, 13f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2.49f)
            lineToRelative(-0.01f, -1.51f)
            curveToRelative(-0.01f, -0.82f, -0.68f, -1.49f, -1.5f, -1.49f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-0.83f, 0.01f, -1.49f, 0.68f, -1.49f, 1.51f)
            lineToRelative(0.01f, 1.49f)
            horizontalLineToRelative(-1.01f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            lineTo(20f, 9f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3f)
            close()
        }
    }.also { _RulerHorizontal = it }
