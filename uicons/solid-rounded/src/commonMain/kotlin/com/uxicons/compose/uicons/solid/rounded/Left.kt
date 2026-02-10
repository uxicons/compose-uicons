package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Sr.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 22.03f)
                curveToRelative(-0.77f, 0f, -1.51f, -0.3f, -2.09f, -0.88f)
                lineTo(1.18f, 14.82f)
                curveToRelative(-1.57f, -1.57f, -1.57f, -4.09f, -0.02f, -5.64f)
                curveToRelative(0f, 0f, 0.01f, -0.01f, 0.02f, -0.02f)
                lineTo(7.93f, 2.81f)
                curveToRelative(0.84f, -0.85f, 2.09f, -1.1f, 3.22f, -0.63f)
                reflectiveCurveToRelative(1.84f, 1.52f, 1.85f, 2.74f)
                verticalLineToRelative(2.06f)
                horizontalLineToRelative(7.03f)
                curveToRelative(2.19f, 0f, 3.97f, 1.8f, 3.97f, 4.01f)
                verticalLineToRelative(1.98f)
                curveToRelative(0f, 2.21f, -1.78f, 4.01f, -3.97f, 4.01f)
                horizontalLineToRelative(-7.03f)
                verticalLineToRelative(2.06f)
                curveToRelative(0f, 1.23f, -0.71f, 2.28f, -1.85f, 2.75f)
                curveToRelative(-0.38f, 0.16f, -0.77f, 0.23f, -1.15f, 0.23f)
                close()
            }
        }.also { _Left = it}
