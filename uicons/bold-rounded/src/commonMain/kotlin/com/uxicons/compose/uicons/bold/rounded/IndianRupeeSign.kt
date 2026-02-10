package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Br.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.52f)
            curveToRelative(-0.26f, 3.9f, -3.52f, 7f, -7.48f, 7f)
            horizontalLineToRelative(-1.8f)
            lineToRelative(7.75f, 6.34f)
            curveToRelative(0.64f, 0.52f, 0.74f, 1.47f, 0.21f, 2.11f)
            curveToRelative(-0.3f, 0.36f, -0.73f, 0.55f, -1.16f, 0.55f)
            curveToRelative(-0.33f, 0f, -0.67f, -0.11f, -0.95f, -0.34f)
            lineTo(3.55f, 14.66f)
            curveToRelative(-0.49f, -0.4f, -0.68f, -1.07f, -0.46f, -1.67f)
            curveToRelative(0.21f, -0.6f, 0.78f, -1f, 1.41f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(2.31f, 0f, 4.22f, -1.75f, 4.47f, -4f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(14.24f)
            curveToRelative(-0.81f, -1.21f, -2.18f, -2f, -3.74f, -2f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(0.45f, 0.6f, 0.82f, 1.28f, 1.08f, 2f)
            horizontalLineToRelative(1.93f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _IndianRupeeSign = it }
