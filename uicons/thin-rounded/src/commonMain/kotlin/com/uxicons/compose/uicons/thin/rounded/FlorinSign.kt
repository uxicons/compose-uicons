package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlorinSign: ImageVector? = null

val Icons.Tr.FlorinSign: ImageVector
    get() = _FlorinSign ?: UXIcon(name = "FlorinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.7f)
                curveToRelative(-1.37f, 0f, -2.62f, 0.81f, -3.19f, 2.05f)
                lineToRelative(-3.61f, 7.95f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5.95f)
                lineToRelative(-4.26f, 9.36f)
                curveToRelative(-0.73f, 1.6f, -2.34f, 2.64f, -4.1f, 2.64f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.7f)
                curveToRelative(1.37f, 0f, 2.62f, -0.81f, 3.19f, -2.05f)
                lineToRelative(4.07f, -8.95f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.41f)
                lineTo(15.71f, 2.64f)
                curveToRelative(0.73f, -1.6f, 2.34f, -2.64f, 4.1f, -2.64f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _FlorinSign = it}
