package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Ts.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(5.84f, 0f, 10.79f, -4.75f, 11.5f, -11.06f)
                curveTo(12.28f, 5.13f, 17.65f, 0f, 24f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(-5.84f, 0f, -10.79f, 4.75f, -11.5f, 11.06f)
                curveToRelative(-0.78f, 6.81f, -6.15f, 11.94f, -12.5f, 11.94f)
                close()
            }
        }.also { _CurveAlt = it}
