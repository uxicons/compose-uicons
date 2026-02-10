package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Ss.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-2f)
                curveTo(22f, 11.87f, 12.13f, 2f, 0f, 2f)
                lineTo(0f, 0f)
                curveToRelative(13.23f, 0f, 24f, 10.77f, 24f, 24f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -7.17f, -5.83f, -13f, -13f, -13f)
                verticalLineToRelative(-2f)
                curveToRelative(8.27f, 0f, 15f, 6.73f, 15f, 15f)
                close()
            }
        }.also { _RssAlt = it}
