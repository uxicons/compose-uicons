package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConsoleController: ImageVector? = null

val Icons.Sr.ConsoleController: ImageVector
    get() = _ConsoleController ?: UXIcon(name = "ConsoleController") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 6.46f)
                curveToRelative(-0.58f, -1.77f, -2.06f, -3.03f, -3.82f, -3.37f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                lineTo(8f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.1f)
                curveToRelative(-1.77f, 0.34f, -3.25f, 1.6f, -3.82f, 3.37f)
                curveTo(0.37f, 12.0f, 0f, 17.66f, 0f, 18.88f)
                curveToRelative(0f, 1.72f, 1.4f, 3.12f, 3.12f, 3.12f)
                curveToRelative(2.53f, 0f, 4.94f, -4.16f, 5.86f, -6.36f)
                curveToRelative(0.16f, -0.39f, 0.53f, -0.64f, 0.93f, -0.64f)
                horizontalLineToRelative(4.17f)
                curveToRelative(0.4f, 0f, 0.76f, 0.25f, 0.93f, 0.64f)
                curveToRelative(0.92f, 2.2f, 3.33f, 6.36f, 5.86f, 6.36f)
                curveToRelative(1.72f, 0f, 3.12f, -1.4f, 3.12f, -3.12f)
                curveToRelative(0f, -1.21f, -0.37f, -6.88f, -2.18f, -12.41f)
                close()
                moveTo(7.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _ConsoleController = it}
