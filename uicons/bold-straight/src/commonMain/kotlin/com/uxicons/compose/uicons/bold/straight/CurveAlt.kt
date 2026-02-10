package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Bs.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(3f)
                curveToRelative(-5.34f, 0f, -9.86f, 3.95f, -10.51f, 9.19f)
                curveToRelative(-0.84f, 6.74f, -6.64f, 11.81f, -13.49f, 11.81f)
                verticalLineToRelative(-3f)
                curveToRelative(5.34f, 0f, 9.86f, -3.95f, 10.51f, -9.19f)
                curveTo(11.35f, 5.08f, 17.15f, 0f, 24f, 0f)
                close()
            }
        }.also { _CurveAlt = it}
