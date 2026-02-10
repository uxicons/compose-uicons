package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BullseyeArrow: ImageVector? = null

val Icons.Ss.BullseyeArrow: ImageVector
    get() = _BullseyeArrow ?: UXIcon(name = "BullseyeArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5.59f)
                lineTo(17f, 3f)
                lineToRelative(3f, -3f)
                lineTo(20f, 4f)
                horizontalLineToRelative(4f)
                lineToRelative(-3f, 3f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-4.49f, 4.49f)
                curveToRelative(0.04f, 0.16f, 0.07f, 0.33f, 0.07f, 0.51f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.18f, 0f, 0.35f, 0.03f, 0.51f, 0.07f)
                lineToRelative(4.49f, -4.49f)
                close()
                moveTo(21.83f, 9f)
                horizontalLineToRelative(-1.34f)
                curveToRelative(0.32f, 0.93f, 0.51f, 1.92f, 0.51f, 2.96f)
                curveToRelative(-0.45f, 11.96f, -17.55f, 11.96f, -18f, 0f)
                curveTo(3f, 6.98f, 7.04f, 2.93f, 12f, 2.93f)
                curveToRelative(1.05f, 0f, 2.06f, 0.19f, 3f, 0.53f)
                verticalLineToRelative(-1.29f)
                lineToRelative(1.39f, -1.39f)
                curveTo(9.5f, -1.77f, 0.38f, 1.95f, 0f, 11.96f)
                curveToRelative(0f, 6.64f, 5.38f, 12.04f, 12f, 12.04f)
                reflectiveCurveToRelative(12f, -5.4f, 12f, -12.04f)
                curveToRelative(-0.06f, -1.6f, -0.35f, -3.04f, -0.82f, -4.32f)
                lineToRelative(-1.35f, 1.35f)
                close()
                moveTo(11.79f, 7.97f)
                lineToRelative(2.61f, -2.61f)
                curveToRelative(-0.71f, -0.25f, -1.51f, -0.4f, -2.4f, -0.42f)
                curveToRelative(-9.25f, 0.29f, -9.25f, 13.75f, 0f, 14.05f)
                curveToRelative(5.67f, -0.18f, 7.86f, -5.31f, 6.58f, -9.32f)
                lineToRelative(-2.65f, 2.65f)
                curveToRelative(-0.15f, 1.85f, -1.45f, 3.59f, -3.93f, 3.66f)
                curveToRelative(-5.37f, -0.12f, -5.84f, -7.62f, -0.22f, -8f)
                close()
            }
        }.also { _BullseyeArrow = it}
