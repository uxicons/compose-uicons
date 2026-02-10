package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Ts.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 24f)
                close()
                moveTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                close()
                moveTo(16f, 17f)
                horizontalLineToRelative(-6.93f)
                curveToRelative(0.29f, -0.98f, 1.45f, -1.54f, 2.77f, -2.18f)
                curveToRelative(1.85f, -0.89f, 4.16f, -2.0f, 4.16f, -4.82f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.19f, -1.75f, 3.03f, -3.59f, 3.92f)
                curveToRelative(-1.68f, 0.81f, -3.41f, 1.64f, -3.41f, 3.58f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Square2 = it}
