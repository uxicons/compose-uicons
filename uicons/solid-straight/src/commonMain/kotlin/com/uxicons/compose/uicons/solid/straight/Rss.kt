package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rss: ImageVector? = null

val Icons.Ss.Rss: ImageVector
    get() = _Rss ?: UXIcon(name = "Rss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.91f, 0f)
                lineTo(3.1f, 0f)
                curveTo(1.39f, 0f, 0f, 1.39f, 0f, 3.1f)
                verticalLineToRelative(20.9f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.1f)
                curveToRelative(0f, -1.71f, -1.39f, -3.1f, -3.1f, -3.1f)
                close()
                moveTo(6.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.5f, 19f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                verticalLineToRelative(-2f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16.5f, 19f)
                curveToRelative(0f, -6.34f, -5.16f, -11.5f, -11.5f, -11.5f)
                verticalLineToRelative(-2f)
                curveToRelative(7.44f, 0f, 13.5f, 6.06f, 13.5f, 13.5f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Rss = it}
