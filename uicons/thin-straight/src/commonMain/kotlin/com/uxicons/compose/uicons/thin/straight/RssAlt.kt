package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Ts.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 23f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-1f)
                curveTo(23f, 11.32f, 12.68f, 1f, 0f, 1f)
                lineTo(0f, 0f)
                curveToRelative(13.23f, 0f, 24f, 10.77f, 24f, 24f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -7.72f, -6.28f, -14f, -14f, -14f)
                verticalLineToRelative(-1f)
                curveToRelative(8.27f, 0f, 15f, 6.73f, 15f, 15f)
                close()
            }
        }.also { _RssAlt = it}
