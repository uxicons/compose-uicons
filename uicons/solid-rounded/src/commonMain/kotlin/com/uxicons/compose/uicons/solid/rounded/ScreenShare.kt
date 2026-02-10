package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Sr.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.15f, 15f)
                curveToRelative(0.98f, 0f, 1.92f, 0.36f, 2.65f, 1f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.73f, -0.64f, 1.66f, -1f, 2.65f, -1f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.11f)
                lineTo(22.0f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(6.5f, 3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(7.61f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                horizontalLineToRelative(5.15f)
                close()
                moveTo(8.34f, 8.34f)
                lineToRelative(2.26f, -2.26f)
                curveToRelative(0.78f, -0.78f, 2.04f, -0.78f, 2.81f, 0f)
                lineToRelative(2.26f, 2.26f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-1.25f, -1.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.51f)
                lineToRelative(-1.25f, 1.26f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(24f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                lineTo(2f, 21f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6.92f)
                curveToRelative(0.47f, 0f, 0.92f, 0.21f, 1.22f, 0.57f)
                lineToRelative(0.2f, 0.23f)
                horizontalLineToRelative(3.32f)
                lineToRelative(0.2f, -0.23f)
                curveToRelative(0.3f, -0.36f, 0.75f, -0.57f, 1.22f, -0.57f)
                horizontalLineToRelative(6.92f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ScreenShare = it}
