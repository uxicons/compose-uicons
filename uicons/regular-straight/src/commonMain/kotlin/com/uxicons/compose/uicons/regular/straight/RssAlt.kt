package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Rs.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(0f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(12.13f, 0f, 22f, 9.87f, 22f, 22f)
                horizontalLineToRelative(2f)
                curveTo(24f, 10.77f, 13.23f, 0f, 0f, 0f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(7.17f, 0f, 13f, 5.83f, 13f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -8.27f, -6.73f, -15f, -15f, -15f)
                close()
            }
        }.also { _RssAlt = it}
