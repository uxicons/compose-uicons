package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Rr.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(5.08f, 0f, 9.38f, -4.35f, 10.01f, -10.11f)
                curveTo(11.75f, 5.11f, 16.9f, 0f, 23f, 0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-5.08f, 0f, -9.38f, 4.35f, -10.01f, 10.11f)
                curveToRelative(-0.74f, 6.78f, -5.9f, 11.89f, -11.99f, 11.89f)
                close()
            }
        }.also { _CurveAlt = it}
