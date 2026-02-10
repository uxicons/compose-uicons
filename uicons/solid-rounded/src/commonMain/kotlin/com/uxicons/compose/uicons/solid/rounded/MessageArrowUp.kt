package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowUp: ImageVector? = null

val Icons.Sr.MessageArrowUp: ImageVector
    get() = _MessageArrowUp ?: UXIcon(name = "MessageArrowUp") {
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
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(16.71f, 9.83f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(7.47f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7.37f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.64f, -2.64f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _MessageArrowUp = it}
