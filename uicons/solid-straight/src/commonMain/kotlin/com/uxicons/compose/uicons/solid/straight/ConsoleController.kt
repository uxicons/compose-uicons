package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConsoleController: ImageVector? = null

val Icons.Ss.ConsoleController: ImageVector
    get() = _ConsoleController ?: UXIcon(name = "ConsoleController") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.33f, 5.04f)
                curveToRelative(-0.46f, -1.22f, -1.64f, -2.04f, -2.94f, -2.04f)
                horizontalLineToRelative(-0.39f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                lineTo(8f, 3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.39f)
                curveToRelative(-1.3f, 0f, -2.48f, 0.82f, -2.94f, 2.04f)
                curveTo(0.45f, 10.95f, 0f, 17.45f, 0f, 18.88f)
                curveToRelative(0f, 1.72f, 1.4f, 3.12f, 3.12f, 3.12f)
                curveToRelative(2.69f, 0f, 5.24f, -4.68f, 6.1f, -7f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.86f, 2.32f, 3.41f, 7f, 6.1f, 7f)
                curveToRelative(1.72f, 0f, 3.12f, -1.4f, 3.12f, -3.12f)
                curveToRelative(0f, -1.42f, -0.45f, -7.93f, -2.67f, -13.83f)
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
