package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blanket: ImageVector? = null

val Icons.Br.Blanket: ImageVector
    get() = _Blanket ?: UXIcon(name = "Blanket") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 14f)
            horizontalLineToRelative(12.5f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            lineTo(6.5f, 0f)
            curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            lineTo(6.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            lineTo(6.5f, 21f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            close()
            moveTo(3f, 6.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            lineTo(6.5f, 11f)
            curveToRelative(-1.29f, 0f, -2.49f, 0.38f, -3.5f, 1.02f)
            verticalLineToRelative(-5.52f)
            close()
        }
    }.also { _Blanket = it }
