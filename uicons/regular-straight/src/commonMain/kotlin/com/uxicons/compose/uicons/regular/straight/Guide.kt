package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Rs.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.34f)
                curveTo(11.83f, 1.67f, 9.61f, 0f, 7f, 0f)
                curveTo(3.69f, 0f, 1f, 2.69f, 1f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(7f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(7f, 2f)
                curveToRelative(1.48f, 0f, 2.77f, 0.81f, 3.46f, 2f)
                lineTo(3.54f, 4f)
                curveToRelative(0.69f, -1.2f, 1.99f, -2f, 3.46f, -2f)
                close()
                moveTo(12f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 2.46f)
                lineToRelative(-4f, 2.54f)
                verticalLineToRelative(5.47f)
                lineToRelative(-6.64f, 5.53f)
                lineTo(4.5f, 16f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(8.14f)
                lineToRelative(5.36f, -4.47f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.46f)
                close()
            }
        }.also { _Guide = it}
