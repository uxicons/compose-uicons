package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Ss.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.38f, 18.25f)
                horizontalLineToRelative(-4.88f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.88f)
                curveToRelative(2.0f, 0f, 3.62f, 1.63f, 3.62f, 3.62f)
                curveToRelative(0f, 0.66f, -0.18f, 1.28f, -0.48f, 1.81f)
                curveToRelative(1.44f, 0.48f, 2.48f, 1.84f, 2.48f, 3.44f)
                curveToRelative(0f, 2.0f, -1.63f, 3.62f, -3.62f, 3.62f)
                close()
                moveTo(9f, 8.25f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.88f)
                curveToRelative(0.9f, 0f, 1.62f, 0.73f, 1.62f, 1.62f)
                reflectiveCurveToRelative(-0.73f, 1.62f, -1.62f, 1.62f)
                horizontalLineToRelative(-3.38f)
                verticalLineToRelative(-2.75f)
                close()
                moveTo(14.38f, 16.25f)
                horizontalLineToRelative(-4.88f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(5.38f)
                curveToRelative(0.9f, 0f, 1.62f, 0.73f, 1.62f, 1.62f)
                reflectiveCurveToRelative(-0.73f, 1.62f, -1.62f, 1.62f)
                close()
            }
        }.also { _CircleB = it}
