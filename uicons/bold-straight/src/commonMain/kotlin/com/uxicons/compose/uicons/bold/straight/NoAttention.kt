package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoAttention: ImageVector? = null

val Icons.Bs.NoAttention: ImageVector
    get() = _NoAttention ?: UXIcon(name = "NoAttention") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveTo(11.53f, 1f, 8.5f, 1f)
                reflectiveCurveTo(3f, 3.47f, 3f, 6.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(8.5f, 4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(20.84f, 14.94f)
                lineToRelative(3.16f, 6.72f)
                verticalLineToRelative(2.33f)
                lineTo(14.51f, 24.0f)
                lineToRelative(-0.93f, -3f)
                horizontalLineToRelative(6.79f)
                lineToRelative(-2.25f, -4.78f)
                curveToRelative(-0.41f, -0.88f, -1.44f, -1.38f, -2.37f, -1.17f)
                lineToRelative(-5.17f, 1.14f)
                curveToRelative(-0.18f, 0.04f, -0.36f, 0.11f, -0.53f, 0.19f)
                lineToRelative(2.37f, 7.62f)
                horizontalLineToRelative(-3.14f)
                lineToRelative(-1.63f, -5.25f)
                lineToRelative(-4.73f, 5.25f)
                lineTo(0.06f, 24.0f)
                lineTo(1.51f, 11.82f)
                lineToRelative(2.98f, 0.35f)
                lineToRelative(-0.77f, 6.45f)
                lineToRelative(3.3f, -3.67f)
                curveToRelative(0.77f, -0.86f, 1.77f, -1.44f, 2.9f, -1.69f)
                lineToRelative(5.17f, -1.14f)
                curveToRelative(0.36f, -0.08f, 0.73f, -0.12f, 1.1f, -0.12f)
                curveToRelative(1.97f, 0f, 3.79f, 1.15f, 4.63f, 2.94f)
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
