package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Bs.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 8.36f)
                verticalLineToRelative(9.39f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6.24f)
                lineToRelative(-3f, 4.76f)
                lineToRelative(-3f, -4.76f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.39f)
                curveToRelative(0f, -0.95f, 0.56f, -1.74f, 1.44f, -2.01f)
                curveToRelative(0.88f, -0.28f, 1.83f, 0.05f, 2.36f, 0.82f)
                lineToRelative(2.19f, 3.48f)
                lineToRelative(2.16f, -3.42f)
                curveToRelative(0.57f, -0.83f, 1.52f, -1.15f, 2.4f, -0.88f)
                curveToRelative(0.88f, 0.28f, 1.44f, 1.06f, 1.44f, 2.01f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                close()
            }
        }.also { _CircleM = it}
