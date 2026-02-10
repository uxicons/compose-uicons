package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RollerCoaster: ImageVector? = null

val Icons.Ts.RollerCoaster: ImageVector
    get() = _RollerCoaster ?: UXIcon(name = "RollerCoaster") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 13f)
                curveToRelative(-1.49f, 0f, -2.89f, -0.38f, -4.1f, -1.06f)
                curveToRelative(2.19f, -1.74f, 3.6f, -4.43f, 3.6f, -7.44f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                curveToRelative(0f, 3.01f, 1.41f, 5.7f, 3.6f, 7.44f)
                curveToRelative(-1.22f, 0.67f, -2.62f, 1.06f, -4.1f, 1.06f)
                curveTo(5.97f, 13f, 2f, 8.79f, 2f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(8.39f)
                curveToRelative(0.7f, 1.47f, 1.74f, 2.74f, 3f, 3.71f)
                verticalLineToRelative(11.91f)
                horizontalLineToRelative(1f)
                verticalLineTo(12.76f)
                curveToRelative(0.92f, 0.54f, 1.94f, 0.92f, 3f, 1.1f)
                verticalLineToRelative(10.13f)
                horizontalLineToRelative(1f)
                verticalLineTo(13.98f)
                curveToRelative(0.17f, 0.01f, 0.33f, 0.01f, 0.5f, 0.01f)
                curveToRelative(0.86f, 0f, 1.7f, -0.12f, 2.5f, -0.33f)
                verticalLineToRelative(10.33f)
                horizontalLineToRelative(1f)
                verticalLineTo(13.33f)
                curveToRelative(0.52f, -0.21f, 1.03f, -0.46f, 1.5f, -0.76f)
                curveToRelative(0.47f, 0.29f, 0.98f, 0.55f, 1.5f, 0.76f)
                verticalLineToRelative(10.67f)
                horizontalLineToRelative(1f)
                verticalLineTo(13.67f)
                curveToRelative(0.8f, 0.22f, 1.64f, 0.33f, 2.5f, 0.33f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                verticalLineTo(13f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(12f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 2.82f, -1.38f, 5.32f, -3.5f, 6.87f)
                curveToRelative(-2.12f, -1.55f, -3.5f, -4.05f, -3.5f, -6.87f)
                close()
            }
        }.also { _RollerCoaster = it}
