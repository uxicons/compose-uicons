package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTongueSquint: ImageVector? = null

val Icons.Ts.GrinTongueSquint: ImageVector
    get() = _GrinTongueSquint ?: UXIcon(name = "GrinTongueSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.68f, 1.15f, 3.5f, 3f, 3.5f)
                reflectiveCurveToRelative(3f, -1.82f, 3f, -3.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                lineTo(7f, 15f)
                verticalLineToRelative(1f)
                close()
                moveTo(14f, 16.5f)
                curveToRelative(0f, 1.2f, -0.77f, 2.5f, -2f, 2.5f)
                reflectiveCurveToRelative(-2f, -1.3f, -2f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(17.98f, 7.36f)
                lineToRelative(-2.68f, 2.14f)
                lineToRelative(2.68f, 2.14f)
                lineToRelative(-0.62f, 0.78f)
                lineToRelative(-3.65f, -2.92f)
                lineToRelative(3.65f, -2.92f)
                lineToRelative(0.62f, 0.78f)
                close()
                moveTo(10.3f, 9.5f)
                lineToRelative(-3.65f, 2.92f)
                lineToRelative(-0.62f, -0.78f)
                lineToRelative(2.68f, -2.14f)
                lineToRelative(-2.68f, -2.14f)
                lineToRelative(0.62f, -0.78f)
                lineToRelative(3.65f, 2.92f)
                close()
            }
        }.also { _GrinTongueSquint = it}
