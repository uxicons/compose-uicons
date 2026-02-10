package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Bs.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(14f, 6.25f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 0.89f, -0.57f, 1.65f, -1.43f, 1.9f)
                curveToRelative(-0.19f, 0.06f, -0.38f, 0.08f, -0.57f, 0.08f)
                curveToRelative(-0.66f, 0f, -1.29f, -0.33f, -1.66f, -0.91f)
                lineToRelative(-3.35f, -5.16f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.89f, 0.57f, -1.65f, 1.43f, -1.9f)
                curveToRelative(0.85f, -0.25f, 1.75f, 0.08f, 2.23f, 0.83f)
                lineToRelative(3.35f, 5.16f)
                verticalLineToRelative(-6.08f)
                close()
            }
        }.also { _CircleN = it}
