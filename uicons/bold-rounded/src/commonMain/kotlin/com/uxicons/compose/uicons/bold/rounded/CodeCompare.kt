package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeCompare: ImageVector? = null

val Icons.Br.CodeCompare: ImageVector
    get() = _CodeCompare ?: UXIcon(name = "CodeCompare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 7.66f)
            verticalLineToRelative(7.84f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(2.19f)
            curveToRelative(0f, 0.72f, -0.86f, 1.08f, -1.37f, 0.57f)
            lineToRelative(-3.13f, -3.09f)
            curveToRelative(-0.66f, -0.65f, -0.66f, -1.7f, 0f, -2.35f)
            lineToRelative(3.13f, -3.09f)
            curveToRelative(0.51f, -0.5f, 1.37f, -0.14f, 1.37f, 0.57f)
            verticalLineToRelative(2.19f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(19f, 7.66f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
            close()
            moveTo(13.53f, 5.66f)
            curveToRelative(0.64f, -0.64f, 0.64f, -1.68f, 0f, -2.31f)
            lineTo(10.37f, 0.23f)
            curveToRelative(-0.51f, -0.5f, -1.37f, -0.14f, -1.37f, 0.57f)
            lineTo(9f, 3f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(7.84f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
            verticalLineToRelative(-7.84f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.19f)
            curveToRelative(0f, 0.72f, 0.86f, 1.08f, 1.37f, 0.57f)
            lineToRelative(3.15f, -3.11f)
            close()
        }
    }.also { _CodeCompare = it }
