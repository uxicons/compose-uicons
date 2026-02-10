package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Br.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(22.5f, 21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(2f, 17.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.41f)
            lineToRelative(1.2f, -10.18f)
            curveToRelative(0.12f, -1f, 0.57f, -1.94f, 1.29f, -2.66f)
            lineToRelative(2.13f, -2.13f)
            curveToRelative(1.32f, -1.32f, 3.63f, -1.32f, 4.95f, 0f)
            lineToRelative(2.13f, 2.13f)
            curveToRelative(0.71f, 0.71f, 1.17f, 1.66f, 1.29f, 2.66f)
            lineToRelative(1.2f, 10.18f)
            horizontalLineToRelative(1.41f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(16.07f, 16f)
            lineToRelative(-1.16f, -9.83f)
            curveToRelative(-0.01f, -0.06f, -0.02f, -0.11f, -0.03f, -0.17f)
            horizontalLineToRelative(-1.39f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(2.57f)
            close()
            moveTo(7.92f, 16f)
            horizontalLineToRelative(2.57f)
            lineTo(10.5f, 6f)
            horizontalLineToRelative(-1.39f)
            curveToRelative(-0.01f, 0.06f, -0.02f, 0.11f, -0.03f, 0.17f)
            lineToRelative(-1.16f, 9.83f)
            close()
        }
    }.also { _Monument = it }
