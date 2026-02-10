package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Ss.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(5.59f, 0f, 10.32f, -4.35f, 11.01f, -10.12f)
                curveTo(11.81f, 5.11f, 17.4f, 0f, 24f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(-5.59f, 0f, -10.32f, 4.35f, -11.01f, 10.12f)
                curveToRelative(-0.81f, 6.77f, -6.39f, 11.88f, -12.99f, 11.88f)
                close()
            }
        }.also { _CurveAlt = it}
