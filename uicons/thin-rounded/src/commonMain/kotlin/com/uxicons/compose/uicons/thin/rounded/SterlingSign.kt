package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SterlingSign: ImageVector? = null

val Icons.Tr.SterlingSign: ImageVector
    get() = _SterlingSign ?: UXIcon(name = "SterlingSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-5f)
                curveTo(5f, 3.21f, 8.21f, 0f, 13f, 0f)
                curveToRelative(4.06f, 0f, 7.26f, 4.02f, 7.39f, 4.19f)
                curveToRelative(0.17f, 0.22f, 0.13f, 0.53f, -0.08f, 0.7f)
                curveToRelative(-0.22f, 0.17f, -0.53f, 0.13f, -0.7f, -0.08f)
                curveToRelative(-0.03f, -0.04f, -3.03f, -3.81f, -6.61f, -3.81f)
                curveToRelative(-4.25f, 0f, -7f, 2.75f, -7f, 7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(6f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.98f, -0.4f, 1.86f, -1.05f, 2.5f)
                horizontalLineTo(21.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _SterlingSign = it}
