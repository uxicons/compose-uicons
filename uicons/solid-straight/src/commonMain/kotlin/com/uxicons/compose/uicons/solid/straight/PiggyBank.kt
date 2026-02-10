package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PiggyBank: ImageVector? = null

val Icons.Ss.PiggyBank: ImageVector
    get() = _PiggyBank ?: UXIcon(name = "PiggyBank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.02f, 4.2f)
                curveToRelative(-0.0f, -0.07f, -0.02f, -0.13f, -0.02f, -0.2f)
                curveTo(7f, 1.79f, 8.79f, 0f, 11f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.68f, 0f, -1.34f, 0.07f, -1.98f, 0.2f)
                close()
                moveTo(24f, 11f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.67f, 1.63f, -1.87f, 3.01f, -3.41f, 3.91f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-2.45f, -1.42f, -4f, -4.07f, -4f, -6.92f)
                curveToRelative(0f, -1.18f, 0.26f, -2.29f, 0.72f, -3.3f)
                curveToRelative(-1.01f, -0.48f, -1.72f, -1.51f, -1.72f, -2.7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.48f, 0.35f, 0.86f, 0.8f, 0.96f)
                curveToRelative(1.47f, -1.8f, 3.7f, -2.96f, 6.2f, -2.96f)
                horizontalLineToRelative(6f)
                curveToRelative(0.12f, 0f, 0.23f, 0.02f, 0.34f, 0.03f)
                curveToRelative(1.11f, -3.01f, 4.66f, -3.03f, 4.66f, -3.03f)
                lineTo(20f, 7.81f)
                curveToRelative(1.04f, 0.84f, 1.9f, 1.92f, 2.41f, 3.19f)
                horizontalLineToRelative(1.59f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _PiggyBank = it}
