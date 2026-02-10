package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Answer: ImageVector? = null

val Icons.Sr.Answer: ImageVector
    get() = _Answer ?: UXIcon(name = "Answer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.14f, 6.12f)
                lineToRelative(1.17f, 4.89f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(1.13f, -4.9f)
                curveToRelative(0.01f, -0.05f, 0.03f, -0.11f, 0.14f, -0.11f)
                reflectiveCurveToRelative(0.12f, 0.06f, 0.14f, 0.12f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.95f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(-0.0f, 4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(16.26f, 14.77f)
                lineToRelative(-2.18f, -9.1f)
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
                close()
            }
        }.also { _Answer = it}
