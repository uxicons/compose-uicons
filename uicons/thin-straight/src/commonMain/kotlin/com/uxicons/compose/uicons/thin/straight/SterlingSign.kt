package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SterlingSign: ImageVector? = null

val Icons.Ts.SterlingSign: ImageVector
    get() = _SterlingSign ?: UXIcon(name = "SterlingSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                curveToRelative(2.07f, 0f, 3f, -1.76f, 3f, -3.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineTo(7.82f)
                curveTo(5f, 3.51f, 8.51f, 0f, 12.82f, 0f)
                reflectiveCurveToRelative(7.52f, 3.14f, 7.66f, 3.28f)
                lineToRelative(-0.69f, 0.72f)
                reflectiveCurveToRelative(-3.19f, -3f, -6.97f, -3f)
                reflectiveCurveToRelative(-6.82f, 3.06f, -6.82f, 6.82f)
                verticalLineToRelative(4.18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.47f, -0.51f, 2.7f, -1.37f, 3.5f)
                horizontalLineTo(22f)
                close()
            }
        }.also { _SterlingSign = it}
