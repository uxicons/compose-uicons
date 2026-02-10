package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneHangup: ImageVector? = null

val Icons.Rr.CirclePhoneHangup: ImageVector
    get() = _CirclePhoneHangup ?: UXIcon(name = "CirclePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(16.29f, 13.79f)
                lineToRelative(1.56f, 0.2f)
                curveToRelative(0.6f, 0f, 1.09f, -0.49f, 1.09f, -1.09f)
                lineToRelative(0.05f, -1.04f)
                curveToRelative(0f, -0.75f, -0.31f, -1.42f, -0.8f, -1.91f)
                curveToRelative(-2.52f, -2.52f, -9.68f, -2.71f, -12.39f, 0f)
                curveToRelative(-0.49f, 0.49f, -0.81f, 1.16f, -0.8f, 1.91f)
                lineToRelative(0.05f, 1.04f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                lineToRelative(1.56f, -0.2f)
                curveToRelative(0.6f, 0f, 1.09f, -0.49f, 1.09f, -1.09f)
                lineToRelative(0.15f, -1.58f)
                curveToRelative(2.13f, -0.91f, 4.16f, -0.87f, 6.1f, 0f)
                lineToRelative(0.15f, 1.58f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                close()
            }
        }.also { _CirclePhoneHangup = it}
