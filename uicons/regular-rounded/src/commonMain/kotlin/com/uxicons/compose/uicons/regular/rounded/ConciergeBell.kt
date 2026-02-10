package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Rr.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21f)
                horizontalLineTo(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.34f)
                curveToRelative(1.47f, 0f, 2.66f, -1.19f, 2.66f, -2.66f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -3.03f, -1.27f, -5.96f, -3.48f, -8.03f)
                curveToRelative(-1.82f, -1.7f, -4.09f, -2.71f, -6.52f, -2.93f)
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
                moveTo(3f, 16.34f)
                curveToRelative(0f, -4.92f, 3.69f, -9.02f, 8.4f, -9.32f)
                curveToRelative(0.2f, -0.01f, 0.39f, -0.02f, 0.59f, -0.02f)
                horizontalLineToRelative(0.03f)
                curveToRelative(2.29f, 0.0f, 4.46f, 0.85f, 6.14f, 2.43f)
                curveToRelative(1.84f, 1.72f, 2.85f, 4.05f, 2.85f, 6.57f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 0.36f, -0.29f, 0.66f, -0.66f, 0.66f)
                horizontalLineTo(3.66f)
                curveToRelative(-0.36f, 0f, -0.66f, -0.29f, -0.66f, -0.66f)
                close()
            }
        }.also { _ConciergeBell = it}
