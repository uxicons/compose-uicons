package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Ts.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                verticalLineTo(11.5f)
                horizontalLineTo(7f)
                verticalLineTo(4.87f)
                lineTo(0.61f, 10.71f)
                curveToRelative(-0.39f, 0.35f, -0.61f, 0.85f, -0.61f, 1.37f)
                reflectiveCurveToRelative(0.22f, 1.02f, 0.61f, 1.36f)
                lineToRelative(6.39f, 5.85f)
                verticalLineToRelative(-6.79f)
                horizontalLineTo(23f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(6f, 17.02f)
                lineTo(1.28f, 12.7f)
                curveToRelative(-0.18f, -0.16f, -0.28f, -0.38f, -0.28f, -0.62f)
                reflectiveCurveToRelative(0.1f, -0.46f, 0.28f, -0.62f)
                lineTo(6f, 7.13f)
                verticalLineToRelative(9.89f)
                close()
            }
        }.also { _ArrowAltFromRight = it}
