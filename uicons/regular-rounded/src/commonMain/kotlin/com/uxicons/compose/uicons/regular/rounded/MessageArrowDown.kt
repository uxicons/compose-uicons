package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageArrowDown: ImageVector? = null

val Icons.Rr.MessageArrowDown: ImageVector
    get() = _MessageArrowDown ?: UXIcon(name = "MessageArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.71f, 11.17f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.54f, 2.54f)
                curveToRelative(-0.58f, 0.58f, -1.42f, 0.88f, -2.16f, 0.88f)
                reflectiveCurveToRelative(-1.53f, -0.32f, -2.09f, -0.88f)
                lineToRelative(-2.64f, -2.64f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-7.37f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7.47f)
                lineToRelative(2.29f, -2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
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
                moveTo(22f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(4f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.23f, 0f, 0.46f, 0.08f, 0.65f, 0.23f)
                lineToRelative(4.05f, 3.41f)
                lineToRelative(4.17f, -3.42f)
                curveToRelative(0.18f, -0.15f, 0.4f, -0.23f, 0.64f, -0.23f)
                horizontalLineToRelative(3.21f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(22.0f, 4f)
                close()
            }
        }.also { _MessageArrowDown = it}
