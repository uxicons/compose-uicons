package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts2: ImageVector? = null

val Icons.Ts.Ts2: ImageVector
    get() = _Ts2 ?: UXIcon(name = "Ts2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(4f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -3.6f, 3.39f, -5.22f, 6.98f, -6.93f)
                curveToRelative(3.94f, -1.88f, 8.02f, -3.83f, 8.02f, -8.57f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                horizontalLineToRelative(-1f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 5.37f, -4.56f, 7.55f, -8.59f, 9.47f)
                curveToRelative(-3.24f, 1.55f, -6.06f, 2.9f, -6.38f, 5.53f)
                horizontalLineToRelative(14.97f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Ts2 = it}
