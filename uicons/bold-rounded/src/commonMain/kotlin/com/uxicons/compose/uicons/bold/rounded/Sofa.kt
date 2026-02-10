package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sofa: ImageVector? = null

val Icons.Br.Sofa: ImageVector
    get() = _Sofa ?: UXIcon(name = "Sofa") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 8.05f)
            verticalLineToRelative(-1.55f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.92f, 0f, 3f, 2.92f, 3f, 6.5f)
            verticalLineToRelative(1.55f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.56f, 0.8f, 2.93f, 2f, 3.74f)
            verticalLineToRelative(2.26f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.26f)
            curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
            close()
            moveTo(20f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(0.5f)
            close()
            moveTo(6f, 6.5f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(6.5f)
            lineTo(6f, 13f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.also { _Sofa = it }
