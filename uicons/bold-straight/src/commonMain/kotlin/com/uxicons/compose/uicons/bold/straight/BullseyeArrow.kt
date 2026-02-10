package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyeArrow: ImageVector? = null

val Icons.Bs.BullseyeArrow: ImageVector
    get() = _BullseyeArrow ?: UXIcon(name = "BullseyeArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.17f, 7.66f)
                curveToRelative(0.53f, 1.35f, 0.83f, 2.81f, 0.83f, 4.34f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(1.53f, 0f, 3f, 0.3f, 4.34f, 0.83f)
                lineToRelative(-1.34f, 1.34f)
                verticalLineToRelative(1.35f)
                curveToRelative(-0.94f, -0.33f, -1.95f, -0.53f, -3f, -0.53f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -1.05f, -0.19f, -2.06f, -0.53f, -3f)
                horizontalLineToRelative(1.35f)
                lineToRelative(1.34f, -1.34f)
                close()
                moveTo(10.86f, 8.19f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(-0.58f, -0.15f, -1.18f, -0.24f, -1.81f, -0.24f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.63f, -0.09f, -1.23f, -0.24f, -1.81f)
                lineToRelative(-2.94f, 2.94f)
                curveToRelative(-0.49f, 1.65f, -2.01f, 2.87f, -3.82f, 2.87f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.81f, 1.22f, -3.32f, 2.87f, -3.82f)
                close()
                moveTo(11.87f, 10.01f)
                curveToRelative(-1.05f, 0.06f, -1.87f, 0.93f, -1.87f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(1.93f, -0.83f, 2f, -1.87f)
                lineToRelative(5.13f, -5.13f)
                horizontalLineToRelative(1.88f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(-4f)
                lineTo(20.01f, 0f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(1.88f)
                lineToRelative(-5.13f, 5.13f)
                close()
            }
        }.also { _BullseyeArrow = it}
