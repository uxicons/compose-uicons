package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SterlingSign: ImageVector? = null

val Icons.Sr.SterlingSign: ImageVector
    get() = _SterlingSign ?: UXIcon(name = "SterlingSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveTo(5f, 3.59f, 8.59f, 0f, 13f, 0f)
                reflectiveCurveToRelative(7.55f, 3.14f, 7.69f, 3.28f)
                curveToRelative(0.4f, 0.38f, 0.41f, 1.01f, 0.03f, 1.41f)
                curveToRelative(-0.38f, 0.4f, -1.01f, 0.41f, -1.41f, 0.03f)
                curveToRelative(-0.03f, -0.03f, -2.91f, -2.72f, -6.31f, -2.72f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.73f, -0.2f, 1.41f, -0.54f, 2f)
                horizontalLineToRelative(14.54f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SterlingSign = it}
