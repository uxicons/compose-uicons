package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Br.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 17.34f)
            lineTo(22f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            lineTo(5f, 0f)
            curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            lineTo(13.5f, 23f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5f, 20f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(15.5f, 18f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(17f, 3f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(12.34f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
            close()
            moveTo(14f, 10f)
            lineTo(3f, 10f)
            verticalLineToRelative(-2f)
            lineTo(14f, 8f)
            verticalLineToRelative(2f)
            close()
            moveTo(3f, 15f)
            verticalLineToRelative(-2f)
            lineTo(14f, 13f)
            verticalLineToRelative(2f)
            lineTo(3f, 15f)
            close()
            moveTo(14f, 5f)
            lineTo(3f, 5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            lineTo(14f, 3f)
            verticalLineToRelative(2f)
            close()
        }
    }.also { _Blinds = it }
