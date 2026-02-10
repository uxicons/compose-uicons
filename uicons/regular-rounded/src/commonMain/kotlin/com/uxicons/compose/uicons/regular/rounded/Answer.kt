package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Rr.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2.92f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(2.85f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24.0f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(22f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3.21f)
                curveToRelative(-0.23f, 0f, -0.46f, 0.08f, -0.64f, 0.23f)
                lineToRelative(-4.17f, 3.42f)
                lineToRelative(-4.05f, -3.41f)
                curveToRelative(-0.18f, -0.15f, -0.41f, -0.23f, -0.65f, -0.23f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                lineTo(2.0f, 4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(12f)
                close()
                moveTo(14.09f, 5.66f)
                curveToRelative(-0.23f, -0.99f, -1.06f, -1.66f, -2.08f, -1.66f)
                reflectiveCurveToRelative(-1.86f, 0.67f, -2.08f, 1.66f)
                lineToRelative(-2.1f, 9.11f)
                curveToRelative(-0.12f, 0.54f, 0.21f, 1.07f, 0.75f, 1.2f)
                curveToRelative(0.54f, 0.13f, 1.07f, -0.21f, 1.2f, -0.75f)
                lineToRelative(0.51f, -2.22f)
                horizontalLineToRelative(3.51f)
                lineToRelative(0.53f, 2.23f)
                curveToRelative(0.11f, 0.46f, 0.52f, 0.77f, 0.97f, 0.77f)
                curveToRelative(0.08f, 0f, 0.15f, -0.01f, 0.23f, -0.03f)
                curveToRelative(0.54f, -0.13f, 0.87f, -0.67f, 0.74f, -1.21f)
                lineToRelative(-2.18f, -9.1f)
                close()
                moveTo(10.73f, 11.01f)
                lineToRelative(1.13f, -4.9f)
                curveToRelative(0.01f, -0.05f, 0.03f, -0.11f, 0.14f, -0.11f)
                reflectiveCurveToRelative(0.12f, 0.06f, 0.14f, 0.12f)
                lineToRelative(1.17f, 4.89f)
                horizontalLineToRelative(-2.57f)
                close()
            }
        }.also { _Answer = it}
