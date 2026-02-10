package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Tr.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.9f, 6.8f)
                lineToRelative(-4.4f, 5.87f)
                verticalLineToRelative(4.83f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4.83f)
                lineToRelative(-4.4f, -5.87f)
                curveToRelative(-0.17f, -0.22f, -0.12f, -0.53f, 0.1f, -0.7f)
                curveToRelative(0.22f, -0.16f, 0.53f, -0.12f, 0.7f, 0.1f)
                lineToRelative(4.1f, 5.47f)
                lineToRelative(4.1f, -5.47f)
                curveToRelative(0.17f, -0.22f, 0.48f, -0.27f, 0.7f, -0.1f)
                curveToRelative(0.22f, 0.17f, 0.27f, 0.48f, 0.1f, 0.7f)
                close()
            }
        }.also { _CircleY = it}
