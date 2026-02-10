package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerDroplet: ImageVector? = null

val Icons.Sr.FingerDroplet: ImageVector
    get() = _FingerDroplet ?: UXIcon(name = "FingerDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 22.03f)
                curveToRelative(-0.59f, 0f, -1.19f, -0.15f, -1.71f, -0.45f)
                curveToRelative(-1.12f, -0.64f, -1.79f, -1.79f, -1.79f, -3.06f)
                curveToRelative(0f, -0.91f, 0.35f, -1.77f, 0.97f, -2.42f)
                curveToRelative(0f, 0f, 1.23f, -1.56f, 1.26f, -1.59f)
                curveToRelative(0.71f, -0.69f, 1.82f, -0.69f, 2.52f, 0f)
                curveToRelative(0.03f, 0.03f, 1.26f, 1.58f, 1.26f, 1.58f)
                curveToRelative(0.63f, 0.66f, 0.98f, 1.52f, 0.98f, 2.43f)
                curveToRelative(0f, 1.25f, -0.66f, 2.39f, -1.76f, 3.04f)
                curveToRelative(-0.53f, 0.31f, -1.13f, 0.47f, -1.74f, 0.47f)
                close()
                moveTo(21.5f, 7f)
                lineTo(7f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.34f)
                lineToRelative(-3.64f, -2.79f)
                curveToRelative(-1.99f, -1.7f, -4.94f, -1.59f, -6.79f, 0.25f)
                lineToRelative(-2.42f, 2.4f)
                curveTo(0.54f, 5.8f, 0.0f, 7.08f, 0f, 8.41f)
                verticalLineToRelative(7.59f)
                curveTo(0f, 18.76f, 2.24f, 21f, 5f, 21f)
                horizontalLineToRelative(4.72f)
                curveToRelative(2.38f, 0f, 4.43f, -1.68f, 4.9f, -4.02f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(1.2f, -4.98f, 1.2f, -4.98f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _FingerDroplet = it}
