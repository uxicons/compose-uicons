package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Br.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6f, 21f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(1.5f, 0f)
            curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(10.75f, 0f, 19.5f, 8.75f, 19.5f, 19.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveTo(24f, 10.09f, 13.91f, 0f, 1.5f, 0f)
            close()
            moveTo(1.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(5.79f, 0f, 10.5f, 4.71f, 10.5f, 10.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -7.44f, -6.06f, -13.5f, -13.5f, -13.5f)
            close()
        }
    }.also { _RssAlt = it }
