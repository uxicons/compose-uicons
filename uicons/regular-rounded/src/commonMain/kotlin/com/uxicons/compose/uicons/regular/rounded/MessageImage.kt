package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Rr.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(-0f, 4f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(2f, 16f)
                curveToRelative(0f, 0.18f, 0.02f, 0.35f, 0.07f, 0.52f)
                lineToRelative(6.54f, -6.54f)
                curveToRelative(1.28f, -1.28f, 3.5f, -1.28f, 4.78f, 0f)
                lineToRelative(0.64f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0f)
                lineToRelative(6.02f, -6.02f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(4f, 2.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                close()
                moveTo(22f, 16f)
                lineTo(22f, 7.41f)
                lineToRelative(-4.61f, 4.61f)
                curveToRelative(-1.28f, 1.28f, -3.5f, 1.28f, -4.78f, 0f)
                lineToRelative(-0.64f, -0.64f)
                curveToRelative(-0.52f, -0.52f, -1.43f, -0.52f, -1.95f, 0f)
                lineToRelative(-6.54f, 6.54f)
                curveToRelative(0.17f, 0.04f, 0.34f, 0.07f, 0.52f, 0.07f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.24f, 0f, 0.46f, 0.08f, 0.64f, 0.23f)
                lineToRelative(4.05f, 3.41f)
                lineToRelative(4.17f, -3.42f)
                curveToRelative(0.18f, -0.15f, 0.4f, -0.23f, 0.64f, -0.23f)
                horizontalLineToRelative(3.21f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _MessageImage = it}
