package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Ts.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.75f)
                curveToRelative(-0.47f, -0.24f, -1.61f, -0.75f, -3f, -0.75f)
                reflectiveCurveToRelative(-2.53f, 0.5f, -3f, 0.75f)
                verticalLineToRelative(2.75f)
                lineTo(4f, 15f)
                verticalLineToRelative(-2.52f)
                curveToRelative(0f, -1.0f, 0.4f, -1.95f, 1.12f, -2.67f)
                curveToRelative(1.43f, -1.43f, 4.0f, -2.3f, 6.88f, -2.31f)
                curveToRelative(2.86f, 0f, 5.44f, 0.86f, 6.88f, 2.31f)
                horizontalLineToRelative(0f)
                curveToRelative(0.72f, 0.72f, 1.12f, 1.67f, 1.12f, 2.67f)
                verticalLineToRelative(2.52f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.52f)
                curveToRelative(0f, -0.73f, -0.29f, -1.43f, -0.83f, -1.96f)
                curveToRelative(-1.24f, -1.24f, -3.61f, -2.02f, -6.17f, -2.02f)
                curveToRelative(-2.61f, 0.01f, -4.92f, 0.77f, -6.17f, 2.02f)
                curveToRelative(-0.53f, 0.53f, -0.83f, 1.23f, -0.83f, 1.96f)
                verticalLineToRelative(1.52f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.32f)
                lineToRelative(0.23f, -0.15f)
                curveToRelative(0.07f, -0.04f, 1.65f, -1.03f, 3.77f, -1.03f)
                reflectiveCurveToRelative(3.7f, 1.0f, 3.77f, 1.04f)
                lineToRelative(0.23f, 0.15f)
                verticalLineToRelative(2.31f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
