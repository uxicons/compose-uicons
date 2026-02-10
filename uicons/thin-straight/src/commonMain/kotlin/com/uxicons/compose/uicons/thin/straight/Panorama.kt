package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Panorama: ImageVector? = null

val Icons.Ts.Panorama: ImageVector
    get() = _Panorama ?: UXIcon(name = "Panorama") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(17.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.3f, 0.35f)
                curveToRelative(-0.06f, 0.03f, -5.99f, 2.65f, -11.3f, 2.65f)
                reflectiveCurveTo(0.76f, 0.38f, 0.7f, 0.35f)
                lineTo(0f, 0.04f)
                verticalLineToRelative(23.9f)
                lineToRelative(0.7f, -0.31f)
                curveToRelative(0.06f, -0.03f, 6.0f, -2.62f, 11.3f, -2.62f)
                reflectiveCurveToRelative(11.24f, 2.6f, 11.3f, 2.62f)
                lineToRelative(0.7f, 0.31f)
                lineTo(24f, 0.04f)
                lineToRelative(-0.7f, 0.31f)
                close()
                moveTo(12f, 4f)
                curveToRelative(4.48f, 0f, 9.24f, -1.73f, 11f, -2.44f)
                verticalLineToRelative(20.51f)
                lineToRelative(-12.31f, -12.31f)
                curveToRelative(-1.01f, -1.01f, -2.66f, -1.01f, -3.67f, 0f)
                lineTo(1f, 15.78f)
                lineTo(1f, 1.56f)
                curveToRelative(1.76f, 0.71f, 6.52f, 2.44f, 11f, 2.44f)
                close()
                moveTo(1f, 22.42f)
                verticalLineToRelative(-5.22f)
                lineToRelative(6.73f, -6.73f)
                curveToRelative(0.62f, -0.62f, 1.63f, -0.62f, 2.26f, 0f)
                lineToRelative(11.32f, 11.32f)
                curveToRelative(-2.29f, -0.79f, -5.88f, -1.79f, -9.31f, -1.79f)
                curveToRelative(-4.48f, 0f, -9.24f, 1.71f, -11f, 2.42f)
                close()
            }
        }.also { _Panorama = it}
