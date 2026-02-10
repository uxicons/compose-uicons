package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MartiniGlassEmpty: ImageVector? = null

val Icons.Rr.MartiniGlassEmpty: ImageVector
    get() = _MartiniGlassEmpty ?: UXIcon(name = "MartiniGlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.78f, 2.02f)
                curveToRelative(-0.48f, -1.23f, -1.64f, -2.02f, -2.94f, -2.02f)
                lineTo(3.16f, 0f)
                curveTo(1.85f, 0f, 0.7f, 0.8f, 0.22f, 2.02f)
                curveToRelative(-0.47f, 1.19f, -0.18f, 2.46f, 0.77f, 3.34f)
                lineToRelative(8.15f, 7.53f)
                curveToRelative(0.55f, 0.5f, 1.19f, 0.83f, 1.86f, 0.99f)
                verticalLineToRelative(8.12f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8.12f)
                curveToRelative(0.67f, -0.16f, 1.32f, -0.5f, 1.87f, -1.0f)
                lineToRelative(8.17f, -7.55f)
                curveToRelative(0.92f, -0.85f, 1.21f, -2.12f, 0.74f, -3.31f)
                close()
                moveTo(21.65f, 3.9f)
                lineToRelative(-8.14f, 7.52f)
                curveToRelative(-0.41f, 0.38f, -1.02f, 0.59f, -1.52f, 0.59f)
                reflectiveCurveToRelative(-1.1f, -0.21f, -1.51f, -0.58f)
                lineTo(2.31f, 3.87f)
                curveToRelative(-0.45f, -0.41f, -0.31f, -0.92f, -0.23f, -1.11f)
                curveToRelative(0.14f, -0.36f, 0.5f, -0.75f, 1.08f, -0.75f)
                horizontalLineToRelative(17.69f)
                curveToRelative(0.58f, 0f, 0.93f, 0.39f, 1.08f, 0.75f)
                curveToRelative(0.08f, 0.2f, 0.21f, 0.7f, -0.27f, 1.14f)
                close()
            }
        }.also { _MartiniGlassEmpty = it}
