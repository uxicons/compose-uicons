package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoAttention: ImageVector? = null

val Icons.Ss.NoAttention: ImageVector
    get() = _NoAttention ?: UXIcon(name = "NoAttention") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(11.53f, 1f, 8.5f, 1f)
                reflectiveCurveTo(3f, 3.47f, 3f, 6.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(20.0f, 14.25f)
                lineToRelative(4.0f, 8.01f)
                verticalLineToRelative(1.74f)
                lineTo(14.1f, 24f)
                lineToRelative(-0.62f, -2f)
                horizontalLineToRelative(8.15f)
                lineToRelative(-1f, -2f)
                horizontalLineToRelative(-7.37f)
                curveToRelative(-1.31f, 0f, -2.23f, 1.3f, -1.79f, 2.54f)
                lineToRelative(0.52f, 1.47f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(-2.37f, -6.46f)
                lineToRelative(-5.32f, 6.46f)
                lineTo(0.11f, 24f)
                lineTo(1.51f, 12.88f)
                lineToRelative(1.98f, 0.25f)
                lineToRelative(-0.92f, 7.29f)
                reflectiveCurveToRelative(2.89f, -3.5f, 4.53f, -5.49f)
                curveToRelative(0.71f, -0.87f, 1.7f, -1.46f, 2.8f, -1.7f)
                curveToRelative(4.1f, -0.88f, 5.35f, -1.13f, 5.79f, -1.2f)
                curveToRelative(1.76f, -0.29f, 3.5f, 0.63f, 4.3f, 2.23f)
                close()
                moveTo(16.83f, 4.67f)
                lineToRelative(-2.33f, -1.17f)
                lineToRelative(2.33f, -1.17f)
                lineToRelative(1.17f, -2.33f)
                lineToRelative(1.17f, 2.33f)
                lineToRelative(2.33f, 1.17f)
                lineToRelative(-2.33f, 1.17f)
                lineToRelative(-1.17f, 2.33f)
                lineToRelative(-1.17f, -2.33f)
                close()
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
            }
        }.also { _NoAttention = it}
