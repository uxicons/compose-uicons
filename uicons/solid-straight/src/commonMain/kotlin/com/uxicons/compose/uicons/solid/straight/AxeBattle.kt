package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Ss.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 3.94f)
                verticalLineToRelative(12.1f)
                curveToRelative(-2.28f, 0.22f, -4.38f, 1.18f, -5.99f, 2.76f)
                lineToRelative(-0.7f, 0.69f)
                lineToRelative(-0.7f, -0.69f)
                curveTo(1.35f, 16.59f, 0f, 13.3f, 0f, 10.0f)
                curveTo(0f, 6.63f, 1.38f, 3.19f, 3.61f, 1.01f)
                lineToRelative(0.7f, -0.69f)
                lineToRelative(0.7f, 0.69f)
                curveToRelative(1.71f, 1.68f, 3.81f, 2.7f, 5.99f, 2.94f)
                close()
                moveTo(20.39f, 1.01f)
                lineToRelative(-0.7f, -0.69f)
                lineToRelative(-0.7f, 0.69f)
                curveToRelative(-1.71f, 1.68f, -3.81f, 2.7f, -5.99f, 2.94f)
                verticalLineToRelative(12.1f)
                curveToRelative(2.28f, 0.22f, 4.38f, 1.18f, 5.99f, 2.76f)
                lineToRelative(0.7f, 0.69f)
                lineToRelative(0.7f, -0.69f)
                curveToRelative(2.26f, -2.21f, 3.61f, -5.5f, 3.61f, -8.8f)
                curveToRelative(0f, -3.37f, -1.38f, -6.82f, -3.61f, -9.0f)
                close()
                moveTo(13f, 3.94f)
                verticalLineToRelative(-1.94f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.94f)
                curveToRelative(0.33f, 0.04f, 0.67f, 0.06f, 1f, 0.06f)
                reflectiveCurveToRelative(0.67f, -0.02f, 1f, -0.06f)
                close()
                moveTo(11f, 16.05f)
                verticalLineToRelative(7.95f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.95f)
                curveToRelative(-0.33f, -0.03f, -0.66f, -0.05f, -1f, -0.05f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.05f)
                close()
            }
        }.also { _AxeBattle = it}
