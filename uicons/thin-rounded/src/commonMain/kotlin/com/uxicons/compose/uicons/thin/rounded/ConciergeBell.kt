package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Tr.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 21f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.26f)
                curveToRelative(1.24f, 0f, 2.24f, -1.0f, 2.24f, -2.23f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0f, -3.03f, -1.22f, -5.85f, -3.45f, -7.94f)
                curveToRelative(-1.95f, -1.82f, -4.42f, -2.85f, -7.05f, -2.97f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.51f)
                curveToRelative(-0.08f, 0.0f, -0.15f, 0.01f, -0.23f, 0.01f)
                curveTo(5.51f, 5.89f, 1f, 10.84f, 1f, 16.77f)
                curveToRelative(0f, 1.23f, 1.0f, 2.23f, 2.24f, 2.23f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(2f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(23.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(2f, 16.77f)
                curveToRelative(0f, -5.41f, 4.1f, -9.92f, 9.33f, -10.25f)
                curveToRelative(0.22f, -0.01f, 0.44f, -0.02f, 0.66f, -0.02f)
                horizontalLineToRelative(0.02f)
                curveToRelative(2.57f, 0f, 4.98f, 0.95f, 6.86f, 2.71f)
                curveToRelative(2.02f, 1.89f, 3.13f, 4.45f, 3.13f, 7.21f)
                verticalLineToRelative(0.36f)
                curveToRelative(0f, 0.68f, -0.56f, 1.23f, -1.24f, 1.23f)
                horizontalLineTo(3.24f)
                curveToRelative(-0.68f, 0f, -1.24f, -0.55f, -1.24f, -1.23f)
                close()
            }
        }.also { _ConciergeBell = it}
