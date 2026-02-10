package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RssAlt: ImageVector? = null

val Icons.Rc.RssAlt: ImageVector
    get() = _RssAlt ?: UXIcon(name = "RssAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 17f)
                curveToRelative(-1.99f, 0f, -3f, 1.01f, -3f, 3f)
                reflectiveCurveToRelative(1.01f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.01f, 3f, -3f)
                reflectiveCurveToRelative(-1.01f, -3f, -3f, -3f)
                close()
                moveTo(4f, 21f)
                curveToRelative(-0.88f, 0f, -1f, -0.12f, -1f, -1f)
                reflectiveCurveToRelative(0.12f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.12f, 1f, 1f)
                reflectiveCurveToRelative(-0.12f, 1f, -1f, 1f)
                close()
                moveTo(15f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -8.02f, -2.98f, -11f, -11f, -11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(9.11f, 0f, 13f, 3.89f, 13f, 13f)
                close()
                moveTo(23f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -13.67f, -5.33f, -19f, -19f, -19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(14.92f, 0f, 21f, 6.08f, 21f, 21f)
                close()
            }
        }.also { _RssAlt = it}
