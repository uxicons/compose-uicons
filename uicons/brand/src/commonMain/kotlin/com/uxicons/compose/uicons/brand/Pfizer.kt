package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pfizer: ImageVector? = null

val Icons.Brand.Pfizer: ImageVector
    get() = _Pfizer ?: UXIcon(name = "Pfizer") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.68f, 19.34f)
            lineTo(18.41f, 24f)
            curveTo(9.43f, 23.45f, 0f, 19.06f, 0f, 15.46f)
            curveToRelative(0f, -0.27f, 0.06f, -0.58f, 0.17f, -1.03f)
            curveToRelative(0.0f, -0.01f, 0.0f, -0.01f, 0.0f, -0.01f)
            lineToRelative(1.09f, -4.03f)
            curveToRelative(0.79f, -2.95f, 5.52f, -3.87f, 12f, -3.05f)
            lineTo(12f, 12f)
            curveToRelative(-4.48f, -0.54f, -8.0f, -0.26f, -10.03f, 0.69f)
            curveTo(4.38f, 15.71f, 12.1f, 18.79f, 19.68f, 19.34f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 8.54f)
            curveToRelative(0f, 0.41f, -0.14f, 0.93f, -0.41f, 1.92f)
            lineToRelative(-0.86f, 3.15f)
            curveToRelative(-0.79f, 2.95f, -5.52f, 3.87f, -12f, 3.05f)
            lineTo(12f, 12f)
            curveToRelative(4.49f, 0.54f, 8.0f, 0.27f, 10.03f, -0.69f)
            curveTo(19.62f, 8.29f, 11.91f, 5.21f, 4.32f, 4.66f)
            lineTo(5.59f, 0f)
            curveTo(14.57f, 0.55f, 24f, 4.94f, 24f, 8.54f)
            close()
        }
    }.also { _Pfizer = it }
