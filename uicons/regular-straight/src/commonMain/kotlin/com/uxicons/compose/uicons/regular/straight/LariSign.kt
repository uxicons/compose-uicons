package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LariSign: ImageVector? = null

val Icons.Rs.LariSign: ImageVector
    get() = _LariSign ?: UXIcon(name = "LariSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5.7f)
                curveToRelative(-2.83f, -1.99f, -4.7f, -5.28f, -4.7f, -9f)
                curveTo(1f, 7.98f, 4.39f, 3.74f, 9f, 2.43f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.05f)
                curveToRelative(0.33f, -0.03f, 0.66f, -0.05f, 1f, -0.05f)
                reflectiveCurveToRelative(0.67f, 0.02f, 1f, 0.05f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.43f)
                curveToRelative(4.61f, 1.31f, 8f, 5.55f, 8f, 10.57f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.91f, -2.51f, -7.24f, -6f, -8.47f)
                verticalLineToRelative(7.47f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4.06f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.06f, -1f, -0.06f)
                reflectiveCurveToRelative(-0.67f, 0.02f, -1f, 0.06f)
                verticalLineToRelative(7.94f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4.53f)
                curveToRelative(-3.49f, 1.24f, -6f, 4.57f, -6f, 8.47f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                close()
            }
        }.also { _LariSign = it}
