package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoAttention: ImageVector? = null

val Icons.Rs.NoAttention: ImageVector
    get() = _NoAttention ?: UXIcon(name = "NoAttention") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.67f, 8.58f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(-1.67f, 0.83f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(1.67f, -0.83f)
                close()
                moveTo(18.0f, 7f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(-1.17f, -2.33f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(1.17f, 2.33f)
                close()
                moveTo(3f, 6.5f)
                curveTo(3f, 3.47f, 5.47f, 1f, 8.5f, 1f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveTo(3f, 9.53f, 3f, 6.5f)
                close()
                moveTo(5f, 6.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(15.95f, 12f)
                curveToRelative(-0.15f, 0f, -0.32f, 0f, -6.06f, 1.23f)
                curveToRelative(-1.09f, 0.23f, -2.09f, 0.84f, -2.8f, 1.71f)
                lineToRelative(-4.52f, 5.48f)
                lineToRelative(0.92f, -7.29f)
                lineToRelative(-1.98f, -0.25f)
                lineTo(0.11f, 24f)
                lineTo(2.21f, 24f)
                lineToRelative(5.32f, -6.46f)
                lineToRelative(2.37f, 6.46f)
                horizontalLineToRelative(2.09f)
                lineToRelative(-2.93f, -8.21f)
                curveToRelative(0.36f, -0.29f, 0.79f, -0.51f, 1.25f, -0.6f)
                curveToRelative(3.89f, -0.83f, 5.51f, -1.16f, 5.64f, -1.19f)
                curveToRelative(1.03f, 0f, 1.97f, 0.58f, 2.43f, 1.5f)
                lineToRelative(3.25f, 6.5f)
                lineTo(13.48f, 22.0f)
                lineToRelative(0.62f, 2f)
                horizontalLineToRelative(9.9f)
                verticalLineToRelative(-1.74f)
                lineToRelative(-3.83f, -7.66f)
                curveToRelative(-0.81f, -1.61f, -2.42f, -2.61f, -4.22f, -2.61f)
                close()
            }
        }.also { _NoAttention = it}
