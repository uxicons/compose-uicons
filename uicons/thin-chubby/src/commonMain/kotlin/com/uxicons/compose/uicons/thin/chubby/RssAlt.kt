package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Tc.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 17f)
                curveToRelative(-2.08f, 0f, -3f, 0.93f, -3f, 3f)
                reflectiveCurveToRelative(0.93f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.93f, 3f, -3f)
                reflectiveCurveToRelative(-0.93f, -3f, -3f, -3f)
                close()
                moveTo(4f, 22f)
                curveToRelative(-1.51f, 0f, -2f, -0.49f, -2f, -2f)
                reflectiveCurveToRelative(0.49f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.49f, 2f, 2f)
                reflectiveCurveToRelative(-0.49f, 2f, -2f, 2f)
                close()
                moveTo(15f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -8.99f, -3.5f, -12.5f, -12.5f, -12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(9.59f, 0f, 13.5f, 3.91f, 13.5f, 13.5f)
                close()
                moveTo(23f, 22.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -14.75f, -5.75f, -20.5f, -20.5f, -20.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(15.27f, 0f, 21.5f, 6.23f, 21.5f, 21.5f)
                close()
            }
        }.also { _RssAlt = it}
