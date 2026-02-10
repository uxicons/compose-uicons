package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleArrowUp: ImageVector? = null

val Icons.Bs.DocumentCircleArrowUp: ImageVector
    get() = _DocumentCircleArrowUp ?: UXIcon(name = "DocumentCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.03f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(14.38f, 0f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(3.71f)
                curveToRelative(-0.79f, -0.24f, -1.63f, -0.38f, -2.5f, -0.38f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.02f, -0.5f, 0.03f)
                verticalLineToRelative(-1.02f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 21f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.53f, 1.16f, 1.3f, 2.19f, 2.27f, 3f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22f, 17f)
                lineToRelative(-3.79f, -3.71f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, 3.71f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _DocumentCircleArrowUp = it}
