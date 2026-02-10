package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Br.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.22f, 6.57f)
            lineToRelative(-12.44f, -3.41f)
            curveToRelative(-2.94f, -0.73f, -5.92f, 1.06f, -6.67f, 3.99f)
            curveToRelative(-0.45f, 1.58f, 0.63f, 3.38f, 2.21f, 3.74f)
            lineToRelative(0.68f, 0.18f)
            verticalLineToRelative(1.92f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-13.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(19f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-4.66f)
            curveToRelative(0f, -2.92f, -1.97f, -5.5f, -4.78f, -6.27f)
            close()
            moveTo(6.02f, 6.07f)
            lineTo(18.42f, 9.46f)
            curveToRelative(1.5f, 0.41f, 2.55f, 1.77f, 2.57f, 3.32f)
            lineToRelative(-17.89f, -4.79f)
            curveToRelative(-0.01f, -0.0f, -0.08f, -0.11f, -0.09f, -0.11f)
            curveToRelative(0.34f, -1.33f, 1.7f, -2.15f, 3.0f, -1.82f)
            close()
            moveTo(18f, 16.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Stapler = it }
