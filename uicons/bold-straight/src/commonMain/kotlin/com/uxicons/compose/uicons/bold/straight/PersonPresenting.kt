package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPresenting: ImageVector? = null

val Icons.Bs.PersonPresenting: ImageVector
    get() = _PersonPresenting ?: UXIcon(name = "PersonPresenting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11.26f)
                curveToRelative(0.48f, 0.71f, 0.76f, 1.57f, 0.76f, 2.5f)
                curveToRelative(0f, 0.17f, -0.03f, 0.33f, -0.05f, 0.5f)
                horizontalLineToRelative(10.55f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.51f)
                curveToRelative(-0.6f, 0.46f, -1f, 1.17f, -1f, 1.99f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.81f, -0.4f, -1.53f, -1f, -1.99f)
                verticalLineToRelative(-2.51f)
                close()
            }
        }.also { _PersonPresenting = it}
