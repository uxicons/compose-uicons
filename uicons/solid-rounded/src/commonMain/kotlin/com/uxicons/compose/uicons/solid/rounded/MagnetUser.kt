package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnetUser: ImageVector? = null

val Icons.Sr.MagnetUser: ImageVector
    get() = _MagnetUser ?: UXIcon(name = "MagnetUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(14.69f, 0f, 18f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(16f, 4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(20.78f, 8.87f)
                curveToRelative(-0.45f, -1.09f, -1.51f, -1.87f, -2.77f, -1.87f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.25f, 0f, -2.33f, 0.77f, -2.77f, 1.87f)
                curveToRelative(0.72f, 0.7f, 1.7f, 1.13f, 2.78f, 1.13f)
                reflectiveCurveToRelative(2.06f, -0.43f, 2.78f, -1.13f)
                close()
                moveTo(10.82f, 16.23f)
                lineToRelative(-2.13f, 2.13f)
                curveToRelative(-0.84f, 0.84f, -2.21f, 0.84f, -3.06f, 0f)
                curveToRelative(-0.84f, -0.84f, -0.84f, -2.21f, 0f, -3.06f)
                lineToRelative(2.13f, -2.13f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-2.77f, 2.77f, -2.77f, 7.29f, 0f, 10.06f)
                curveToRelative(1.34f, 1.34f, 3.13f, 2.08f, 5.03f, 2.08f)
                reflectiveCurveToRelative(3.69f, -0.74f, 5.03f, -2.08f)
                lineToRelative(2.18f, -2.18f)
                lineToRelative(-3.5f, -3.5f)
                close()
                moveTo(15.74f, 18.32f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(3.5f, 3.5f)
                close()
                moveTo(9.18f, 11.77f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(3.5f, 3.5f)
                close()
            }
        }.also { _MagnetUser = it}
