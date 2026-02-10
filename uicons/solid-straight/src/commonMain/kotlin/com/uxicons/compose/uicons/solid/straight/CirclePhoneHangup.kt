package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Ss.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4.57f)
                verticalLineToRelative(-3.22f)
                curveToRelative(-1.22f, -0.52f, -2.34f, -0.78f, -3.43f, -0.78f)
                curveToRelative(-1.15f, -0.01f, -2.26f, 0.26f, -3.43f, 0.78f)
                verticalLineToRelative(3.22f)
                lineTo(4f, 14f)
                verticalLineToRelative(-2.46f)
                curveToRelative(0f, -0.88f, 0.37f, -1.66f, 0.95f, -2.24f)
                curveToRelative(1.49f, -1.49f, 4.27f, -2.29f, 7.05f, -2.31f)
                curveToRelative(2.73f, -0.01f, 5.48f, 0.73f, 7.05f, 2.31f)
                curveToRelative(0.58f, 0.58f, 0.95f, 1.36f, 0.94f, 2.24f)
                verticalLineToRelative(2.46f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
