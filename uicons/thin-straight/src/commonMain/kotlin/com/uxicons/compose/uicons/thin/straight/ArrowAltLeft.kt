package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltLeft: ImageVector? = null

val Icons.Ts.ArrowAltLeft: ImageVector
    get() = _ArrowAltLeft ?: UXIcon(name = "ArrowAltLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                horizontalLineTo(7f)
                verticalLineTo(4.79f)
                lineTo(0.61f, 10.63f)
                curveToRelative(-0.39f, 0.35f, -0.61f, 0.85f, -0.61f, 1.37f)
                reflectiveCurveToRelative(0.22f, 1.02f, 0.61f, 1.37f)
                lineToRelative(6.39f, 5.85f)
                verticalLineToRelative(-6.71f)
                horizontalLineTo(24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 16.94f)
                lineTo(1.28f, 12.63f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-0.18f, -0.16f, -0.28f, -0.38f, -0.28f, -0.62f)
                reflectiveCurveToRelative(0.1f, -0.46f, 0.28f, -0.63f)
                lineTo(6f, 7.06f)
                verticalLineToRelative(9.89f)
                close()
            }
        }.also { _ArrowAltLeft = it}
