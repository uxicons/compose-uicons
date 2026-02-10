package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Br.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 17.34f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-4.68f)
            curveToRelative(-2.32f, 0f, -4.4f, 1.47f, -5.18f, 3.65f)
            lineTo(0.09f, 22.0f)
            curveToRelative(-0.28f, 0.78f, 0.13f, 1.64f, 0.91f, 1.92f)
            curveToRelative(0.17f, 0.06f, 0.34f, 0.09f, 0.51f, 0.09f)
            curveToRelative(0.62f, 0f, 1.19f, -0.38f, 1.41f, -0.99f)
            lineToRelative(3.93f, -11.01f)
            horizontalLineToRelative(12.16f)
            verticalLineToRelative(5.34f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
            close()
            moveTo(7.91f, 9f)
            lineToRelative(1.55f, -4.34f)
            curveToRelative(0.35f, -0.99f, 1.3f, -1.66f, 2.35f, -1.66f)
            horizontalLineToRelative(4.68f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(7.91f)
            close()
        }
    }.also { _Walker = it }
