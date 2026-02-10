package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Ts.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                horizontalLineTo(8f)
                verticalLineTo(4.88f)
                lineTo(1.61f, 10.64f)
                curveToRelative(-0.39f, 0.34f, -0.61f, 0.84f, -0.61f, 1.36f)
                reflectiveCurveToRelative(0.22f, 1.01f, 0.61f, 1.35f)
                lineToRelative(6.39f, 5.77f)
                verticalLineToRelative(-6.62f)
                horizontalLineTo(24f)
                verticalLineToRelative(-1f)
                close()
                moveTo(7f, 16.88f)
                lineTo(2.28f, 12.61f)
                curveToRelative(-0.18f, -0.16f, -0.28f, -0.37f, -0.28f, -0.61f)
                reflectiveCurveToRelative(0.1f, -0.45f, 0.28f, -0.61f)
                lineTo(7f, 7.12f)
                verticalLineToRelative(9.75f)
                close()
                moveTo(1f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                close()
            }
        }.also { _ArrowAltToLeft = it}
