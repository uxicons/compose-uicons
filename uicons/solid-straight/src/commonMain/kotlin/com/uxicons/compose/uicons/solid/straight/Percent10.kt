package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percent10: ImageVector? = null

val Icons.Ss.Percent10: ImageVector
    get() = _Percent10 ?: UXIcon(name = "Percent10") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.9f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                reflectiveCurveToRelative(-0.9f, -0.4f, -0.9f, -0.9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
                reflectiveCurveToRelative(0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.63f, -5.37f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.63f, 0f, 12f)
                reflectiveCurveTo(5.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.37f, 12f, 12f)
                close()
                moveTo(14.5f, 9.23f)
                curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                close()
                moveTo(7.5f, 7.98f)
                horizontalLineToRelative(-1.23f)
                lineToRelative(-2.44f, 2.52f)
                lineToRelative(1.15f, 1.11f)
                lineToRelative(0.92f, -0.95f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(1.6f)
                lineTo(7.5f, 7.98f)
                close()
                moveTo(13.5f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.28f, 16.0f)
                lineToRelative(5.22f, -8f)
                horizontalLineToRelative(-1.91f)
                lineToRelative(-5.22f, 8f)
                horizontalLineToRelative(1.91f)
                close()
                moveTo(21.5f, 14.73f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                close()
            }
        }.also { _Percent10 = it}
