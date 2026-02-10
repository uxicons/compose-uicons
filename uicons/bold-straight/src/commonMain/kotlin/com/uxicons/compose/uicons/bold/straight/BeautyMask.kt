package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeautyMask: ImageVector? = null

val Icons.Bs.BeautyMask: ImageVector
    get() = _BeautyMask ?: UXIcon(name = "BeautyMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14.0f)
                curveToRelative(0f, 1.0f, -1.6f, 3.0f, -4.0f, 3.0f)
                reflectiveCurveToRelative(-4.0f, -2f, -4.0f, -3.0f)
                curveToRelative(0f, -0.0f, 8f, 0f, 8f, 0f)
                close()
                moveTo(24f, 11f)
                curveToRelative(0f, 6.44f, -6.06f, 13f, -12f, 13f)
                reflectiveCurveTo(0f, 17.44f, 0f, 11f)
                curveTo(0f, 4.63f, 5.05f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.63f, 12f, 11f)
                close()
                moveTo(20.65f, 13.33f)
                lineToRelative(-2.65f, -1.33f)
                lineToRelative(2.98f, -1.49f)
                curveToRelative(-0.16f, -2.88f, -1.73f, -5.17f, -4.21f, -6.43f)
                lineToRelative(-2.77f, 2.42f)
                verticalLineToRelative(-3.33f)
                curveToRelative(-0.64f, -0.11f, -1.3f, -0.17f, -2f, -0.17f)
                reflectiveCurveToRelative(-1.36f, 0.06f, -2f, 0.17f)
                verticalLineToRelative(3.33f)
                lineToRelative(-2.77f, -2.42f)
                curveToRelative(-2.48f, 1.26f, -4.04f, 3.56f, -4.21f, 6.43f)
                lineToRelative(2.98f, 1.49f)
                lineToRelative(-2.65f, 1.33f)
                curveToRelative(0.62f, 2.19f, 2.04f, 4.18f, 3.74f, 5.59f)
                lineToRelative(1.91f, -1.91f)
                verticalLineToRelative(3.19f)
                curveToRelative(1.01f, 0.52f, 2.04f, 0.81f, 3f, 0.81f)
                reflectiveCurveToRelative(1.99f, -0.29f, 3f, -0.81f)
                verticalLineToRelative(-3.19f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(1.7f, -1.41f, 3.12f, -3.4f, 3.74f, -5.59f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, -1.1f, -1.12f, -2f, -2.5f, -2f)
                reflectiveCurveToRelative(-2.5f, 0.9f, -2.5f, 2f)
                reflectiveCurveToRelative(1.12f, 2f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, -0.9f, 2.5f, -2f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 0.9f, -2.5f, 2f)
                reflectiveCurveToRelative(1.12f, 2f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, -0.9f, 2.5f, -2f)
                reflectiveCurveToRelative(-1.12f, -2f, -2.5f, -2f)
                close()
            }
        }.also { _BeautyMask = it}
