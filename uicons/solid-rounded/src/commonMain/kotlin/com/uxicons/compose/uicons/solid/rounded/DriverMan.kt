package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Sr.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-5.1f, 0f, -9.38f, 3.82f, -9.94f, 8.89f)
                curveToRelative(-0.03f, 0.28f, 0.06f, 0.56f, 0.25f, 0.78f)
                curveToRelative(0.19f, 0.21f, 0.46f, 0.33f, 0.74f, 0.33f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.28f, 0f, 0.56f, -0.12f, 0.74f, -0.33f)
                curveToRelative(0.19f, -0.21f, 0.28f, -0.49f, 0.25f, -0.78f)
                curveToRelative(-0.56f, -5.07f, -4.83f, -8.89f, -9.94f, -8.89f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _DriverMan = it}
