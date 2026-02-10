package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Sr.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.61f, 9.98f)
                curveToRelative(1.28f, -1.28f, 3.5f, -1.28f, 4.78f, 0f)
                lineToRelative(0.64f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0f)
                lineToRelative(7.83f, -7.83f)
                curveToRelative(-0.52f, -1.61f, -2.03f, -2.78f, -3.81f, -2.78f)
                lineTo(4f, 0.0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.74f, 0.2f, 1.44f, 0.56f, 2.03f)
                lineToRelative(8.05f, -8.05f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24f, 5.41f)
                verticalLineToRelative(10.59f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-0.74f, 0f, -1.44f, -0.2f, -2.03f, -0.56f)
                lineToRelative(8.06f, -8.05f)
                curveToRelative(0.52f, -0.52f, 1.43f, -0.52f, 1.95f, 0f)
                lineToRelative(0.64f, 0.64f)
                curveToRelative(1.32f, 1.32f, 3.46f, 1.32f, 4.78f, 0f)
                lineToRelative(6.61f, -6.61f)
                close()
            }
        }.also { _MessageImage = it}
