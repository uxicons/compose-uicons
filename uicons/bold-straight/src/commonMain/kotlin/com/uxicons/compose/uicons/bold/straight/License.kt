package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _License: ImageVector? = null

val Icons.Bs.License: ImageVector
    get() = _License ?: UXIcon(name = "License") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.66f)
                lineTo(22f, 24f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                close()
                moveTo(16f, 19.23f)
                verticalLineToRelative(4.76f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(-4.76f)
                curveToRelative(-1.2f, -0.81f, -2f, -2.18f, -2f, -3.74f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.56f, -0.8f, 2.93f, -2f, 3.74f)
                close()
                moveTo(12f, 15.49f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _License = it}
