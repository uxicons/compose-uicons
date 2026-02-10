package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Ts.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.39f, 10.71f)
                lineToRelative(-6.39f, -5.85f)
                verticalLineToRelative(6.63f)
                lineTo(1f, 11.5f)
                lineTo(1f, 3f)
                lineTo(0f, 3f)
                lineTo(0f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 12.5f)
                lineTo(17f, 12.5f)
                verticalLineToRelative(6.79f)
                lineToRelative(6.39f, -5.85f)
                curveToRelative(0.39f, -0.35f, 0.61f, -0.85f, 0.61f, -1.37f)
                reflectiveCurveToRelative(-0.22f, -1.02f, -0.61f, -1.37f)
                close()
                moveTo(22.72f, 12.71f)
                lineToRelative(-4.72f, 4.32f)
                lineTo(18f, 7.13f)
                lineToRelative(4.72f, 4.32f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.18f, 0.16f, 0.28f, 0.38f, 0.28f, 0.62f)
                reflectiveCurveToRelative(-0.1f, 0.46f, -0.28f, 0.63f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}
