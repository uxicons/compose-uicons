package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Rs.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
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
                moveTo(18f, 7.68f)
                verticalLineToRelative(10.32f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.09f)
                lineToRelative(-4f, 6.64f)
                lineToRelative(-4f, -6.64f)
                verticalLineToRelative(9.08f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 7.68f)
                curveToRelative(0f, -0.76f, 0.45f, -1.38f, 1.13f, -1.6f)
                curveToRelative(0.7f, -0.22f, 1.45f, 0.04f, 1.88f, 0.65f)
                lineToRelative(2.98f, 4.95f)
                lineToRelative(2.95f, -4.89f)
                curveToRelative(0.46f, -0.67f, 1.22f, -0.93f, 1.92f, -0.71f)
                curveToRelative(0.69f, 0.22f, 1.13f, 0.84f, 1.13f, 1.6f)
                close()
            }
        }.also { _CircleM = it}
