package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrayingHands: ImageVector? = null

val Icons.Br.PrayingHands: ImageVector
    get() = _PrayingHands ?: UXIcon(name = "PrayingHands") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11f, 10f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 2.38f, -1.04f, 5.31f, -3.98f, 6.41f)
            curveToRelative(-0.17f, 0.06f, -0.35f, 0.1f, -0.52f, 0.1f)
            curveToRelative(-0.61f, 0f, -1.18f, -0.37f, -1.41f, -0.98f)
            curveToRelative(-0.29f, -0.78f, 0.1f, -1.64f, 0.88f, -1.93f)
            curveToRelative(1.93f, -0.72f, 2.02f, -3.12f, 2.02f, -3.6f)
            verticalLineToRelative(-0.26f)
            curveToRelative(-0.71f, 0.48f, -1.58f, 0.76f, -2.5f, 0.76f)
            reflectiveCurveToRelative(-1.78f, -0.28f, -2.5f, -0.76f)
            verticalLineToRelative(2.26f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-6.74f)
            curveToRelative(0f, -1.13f, 0.34f, -2.23f, 0.99f, -3.15f)
            lineTo(7.27f, 0.64f)
            curveToRelative(0.48f, -0.68f, 1.41f, -0.84f, 2.09f, -0.37f)
            curveToRelative(0.68f, 0.47f, 0.84f, 1.41f, 0.37f, 2.09f)
            lineToRelative(-5.73f, 8.18f)
            verticalLineToRelative(2.96f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.98f, 0.75f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 1.02f, 2f, 2f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12.76f)
            verticalLineToRelative(6.74f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.26f)
            curveToRelative(-0.72f, 0.48f, -1.57f, 0.76f, -2.5f, 0.76f)
            reflectiveCurveToRelative(-1.78f, -0.28f, -2.5f, -0.76f)
            verticalLineToRelative(0.26f)
            curveToRelative(0f, 0.47f, 0.1f, 2.88f, 2.02f, 3.6f)
            curveToRelative(0.78f, 0.29f, 1.17f, 1.15f, 0.88f, 1.93f)
            curveToRelative(-0.23f, 0.6f, -0.8f, 0.98f, -1.41f, 0.98f)
            curveToRelative(-0.17f, 0f, -0.35f, -0.03f, -0.52f, -0.1f)
            curveToRelative(-2.93f, -1.09f, -3.98f, -4.03f, -3.98f, -6.41f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.98f, 0.75f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 1.02f, 2f, 2f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.96f)
            lineTo(14.27f, 2.36f)
            curveToRelative(-0.47f, -0.68f, -0.31f, -1.61f, 0.37f, -2.09f)
            curveToRelative(0.68f, -0.48f, 1.61f, -0.31f, 2.09f, 0.37f)
            lineToRelative(6.28f, 8.97f)
            curveToRelative(0.65f, 0.93f, 0.99f, 2.02f, 0.99f, 3.15f)
            close()
        }
    }.also { _PrayingHands = it }
