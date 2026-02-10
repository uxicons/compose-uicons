package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SterlingSign: ImageVector? = null

val Icons.Bs.SterlingSign: ImageVector
    get() = _SterlingSign ?: UXIcon(name = "SterlingSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 21f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3f)
                curveToRelative(1.68f, 0f, 3f, -1.32f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.82f)
                curveTo(5f, 3.67f, 8.67f, 0f, 13.19f, 0f)
                curveToRelative(4.24f, 0f, 7.58f, 3.15f, 7.72f, 3.28f)
                lineToRelative(-2.07f, 2.17f)
                reflectiveCurveToRelative(-2.62f, -2.45f, -5.64f, -2.45f)
                curveToRelative(-2.86f, 0f, -5.18f, 2.32f, -5.18f, 5.18f)
                verticalLineToRelative(2.82f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.09f, -0.29f, 2.12f, -0.81f, 3f)
                horizontalLineToRelative(14.8f)
                close()
            }
        }.also { _SterlingSign = it}
