package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Sc.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 20f)
                curveToRelative(0f, 1.99f, -1.01f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.01f, -3f, -3f)
                reflectiveCurveToRelative(1.01f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.01f, 3f, 3f)
                close()
                moveTo(2.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(7.01f, 0f, 9.5f, 2.49f, 9.5f, 9.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -8.64f, -3.85f, -12.5f, -12.5f, -12.5f)
                close()
                moveTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(12.76f, 0f, 17.5f, 4.74f, 17.5f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -14.37f, -6.13f, -20.5f, -20.5f, -20.5f)
                close()
            }
        }.also { _RssAlt = it}
