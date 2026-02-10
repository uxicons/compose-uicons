package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Sr.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                horizontalLineTo(4.39f)
                curveToRelative(-0.97f, 0f, -1.83f, -0.58f, -2.19f, -1.48f)
                curveToRelative(-0.36f, -0.9f, -0.14f, -1.92f, 0.56f, -2.59f)
                lineToRelative(8.29f, -7.93f)
                lineTo(2.76f, 4.07f)
                curveToRelative(-0.7f, -0.67f, -0.92f, -1.69f, -0.56f, -2.59f)
                reflectiveCurveToRelative(1.22f, -1.48f, 2.19f, -1.48f)
                horizontalLineToRelative(13.61f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.39f)
                curveToRelative(-0.21f, 0f, -0.3f, 0.14f, -0.34f, 0.23f)
                curveToRelative(-0.03f, 0.09f, -0.07f, 0.25f, 0.09f, 0.4f)
                lineToRelative(9.05f, 8.65f)
                curveToRelative(0.2f, 0.19f, 0.31f, 0.45f, 0.31f, 0.72f)
                reflectiveCurveToRelative(-0.11f, 0.53f, -0.31f, 0.72f)
                lineToRelative(-9.05f, 8.65f)
                curveToRelative(-0.15f, 0.15f, -0.12f, 0.31f, -0.09f, 0.4f)
                curveToRelative(0.03f, 0.08f, 0.12f, 0.23f, 0.34f, 0.23f)
                horizontalLineToRelative(13.61f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Total = it}
