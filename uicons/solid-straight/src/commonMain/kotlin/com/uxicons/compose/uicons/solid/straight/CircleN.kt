package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Ss.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 16.45f)
                curveToRelative(0f, 0.68f, -0.44f, 1.27f, -1.1f, 1.47f)
                curveToRelative(-0.15f, 0.05f, -0.31f, 0.07f, -0.46f, 0.07f)
                curveToRelative(-0.51f, 0f, -1f, -0.25f, -1.29f, -0.7f)
                lineToRelative(-5.15f, -8.19f)
                verticalLineToRelative(8.65f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 7.55f)
                curveToRelative(0f, -0.68f, 0.44f, -1.27f, 1.1f, -1.47f)
                curveToRelative(0.67f, -0.2f, 1.37f, 0.05f, 1.75f, 0.63f)
                lineToRelative(5.15f, 8.19f)
                lineTo(15.0f, 6.25f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10.2f)
                close()
            }
        }.also { _CircleN = it}
