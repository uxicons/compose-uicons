package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Bs.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(9f, 14f)
                verticalLineToRelative(-2.59f)
                curveToRelative(1.02f, -0.46f, 2.0f, -0.69f, 3f, -0.69f)
                curveToRelative(0.95f, 0.01f, 1.93f, 0.23f, 3f, 0.69f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.77f, -0.32f, -1.46f, -0.83f, -1.96f)
                curveToRelative(-1.38f, -1.38f, -3.78f, -2.03f, -6.17f, -2.02f)
                curveToRelative(-2.44f, 0.01f, -4.87f, 0.71f, -6.17f, 2.02f)
                curveToRelative(-0.5f, 0.5f, -0.83f, 1.19f, -0.83f, 1.96f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
