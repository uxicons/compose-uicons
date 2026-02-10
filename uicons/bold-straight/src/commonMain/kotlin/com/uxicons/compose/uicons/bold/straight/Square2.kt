package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Bs.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24f, 24f)
                close()
                moveTo(3f, 21f)
                lineTo(21f, 21f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 21f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-5.28f)
                curveToRelative(0.19f, -0.1f, 0.38f, -0.2f, 0.59f, -0.31f)
                curveToRelative(1.98f, -1.02f, 4.69f, -2.42f, 4.69f, -5.69f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.3f, -0.98f, 1.95f, -3.06f, 3.02f)
                curveToRelative(-1.75f, 0.9f, -3.94f, 2.03f, -3.94f, 4.48f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Square2 = it}
