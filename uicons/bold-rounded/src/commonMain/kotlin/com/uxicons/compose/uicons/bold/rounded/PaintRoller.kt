package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintRoller: ImageVector? = null

val Icons.Br.PaintRoller: ImageVector
    get() = _PaintRoller ?: UXIcon(name = "PaintRoller") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 3f)
            horizontalLineToRelative(-0.55f)
            curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
            lineTo(3.5f, 0f)
            curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            lineTo(15.5f, 9f)
            curveToRelative(1.76f, 0f, 3.2f, -1.31f, 3.45f, -3f)
            horizontalLineToRelative(0.55f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(0.51f)
            curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.82f, -0.4f, -1.53f, -1.0f, -1.99f)
            verticalLineToRelative(-0.51f)
            curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(16f, 5.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(3.5f, 6f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            lineTo(3f, 3.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            lineTo(15.5f, 3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _PaintRoller = it }
