package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartCrack: ImageVector? = null

val Icons.Ts.HeartCrack: ImageVector
    get() = _HeartCrack ?: UXIcon(name = "HeartCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.12f)
                lineToRelative(-0.29f, -0.2f)
                curveToRelative(-0.48f, -0.33f, -11.71f, -8.2f, -11.71f, -15.15f)
                curveTo(0f, 4.04f, 2.8f, 1f, 6.25f, 1f)
                curveToRelative(2.54f, 0f, 4.79f, 1.8f, 5.75f, 4.31f)
                curveToRelative(0.96f, -2.5f, 3.21f, -4.31f, 5.75f, -4.31f)
                curveToRelative(3.45f, 0f, 6.25f, 3.04f, 6.25f, 6.77f)
                curveToRelative(0f, 6.95f, -11.24f, 14.82f, -11.71f, 15.15f)
                lineToRelative(-0.29f, 0.2f)
                close()
                moveTo(6.25f, 2f)
                curveTo(3.4f, 2f, 1f, 4.64f, 1f, 7.77f)
                curveToRelative(0f, 5.85f, 9.25f, 12.85f, 11f, 14.13f)
                curveToRelative(1.75f, -1.28f, 11f, -8.28f, 11f, -14.13f)
                curveToRelative(0f, -3.13f, -2.4f, -5.77f, -5.25f, -5.77f)
                reflectiveCurveToRelative(-5.25f, 2.8f, -5.25f, 6f)
                verticalLineToRelative(0.21f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(4f, 4f)
                lineToRelative(-3.35f, 3.35f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(-4f, -4f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(-0.1f, -3.11f, -2.51f, -5.8f, -5.25f, -5.8f)
                close()
            }
        }.also { _HeartCrack = it}
