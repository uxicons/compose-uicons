package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Ts.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-8.71f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-3.79f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 4f)
                horizontalLineToRelative(7.71f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(8.29f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-5.52f)
                curveToRelative(-0.25f, -2.8f, -2.61f, -5f, -5.48f, -5f)
                reflectiveCurveToRelative(-5.22f, 2.2f, -5.48f, 5f)
                lineTo(1f, 13f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.5f, 13.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(5.52f)
                curveToRelative(0.25f, 2.8f, 2.61f, 5f, 5.48f, 5f)
                reflectiveCurveToRelative(5.22f, -2.2f, 5.48f, -5f)
                horizontalLineToRelative(5.52f)
                verticalLineToRelative(9f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _CameraRetro = it}
