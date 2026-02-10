package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleW: ImageVector? = null

val Icons.Rs.CircleW: ImageVector
    get() = _CircleW ?: UXIcon(name = "CircleW") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.22f, 6.25f)
                horizontalLineToRelative(2.03f)
                lineToRelative(-1.5f, 10.58f)
                curveToRelative(-0.12f, 0.6f, -0.58f, 1.06f, -1.19f, 1.16f)
                curveToRelative(-0.61f, 0.1f, -1.2f, -0.21f, -1.48f, -0.72f)
                lineToRelative(-2.08f, -4.42f)
                lineToRelative(-2.03f, 4.33f)
                curveToRelative(-0.32f, 0.6f, -0.91f, 0.91f, -1.53f, 0.81f)
                curveToRelative(-0.61f, -0.1f, -1.08f, -0.55f, -1.19f, -1.15f)
                lineToRelative(-1.5f, -10.59f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.97f, 8.11f)
                lineToRelative(3.25f, -5.86f)
                lineToRelative(3.14f, 5.89f)
                lineToRelative(1.08f, -8.14f)
                close()
            }
        }.also { _CircleW = it}
