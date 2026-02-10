package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Ts.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.85f, 9.88f)
                curveToRelative(-0.99f, -1.79f, -2.8f, -2.86f, -4.85f, -2.86f)
                reflectiveCurveToRelative(-3.86f, 1.07f, -4.85f, 2.86f)
                lineTo(0f, 22.82f)
                verticalLineToRelative(1.18f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1.18f)
                lineToRelative(-7.15f, -12.94f)
                close()
                moveTo(1.04f, 23f)
                lineToRelative(6.98f, -12.63f)
                curveToRelative(0.81f, -1.47f, 2.3f, -2.34f, 3.97f, -2.34f)
                reflectiveCurveToRelative(3.16f, 0.88f, 3.97f, 2.34f)
                lineToRelative(6.98f, 12.63f)
                horizontalLineTo(1.04f)
                close()
            }
        }.also { _Mound = it}
