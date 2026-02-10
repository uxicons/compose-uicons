package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Sr.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21f)
                horizontalLineTo(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.34f)
                curveToRelative(1.47f, 0f, 2.66f, -1.19f, 2.66f, -2.66f)
                curveToRelative(0f, -5.88f, -4.37f, -10.79f, -10f, -11.3f)
                verticalLineTo(3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.04f)
                curveTo(5.37f, 5.55f, 1f, 10.46f, 1f, 16.34f)
                curveToRelative(0f, 1.47f, 1.19f, 2.66f, 2.66f, 2.66f)
                horizontalLineToRelative(7.34f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ConciergeBell = it}
