package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageQuestion: ImageVector? = null

val Icons.Ts.MessageQuestion: ImageVector
    get() = _MessageQuestion ?: UXIcon(name = "MessageQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.94f, 6.28f)
                curveToRelative(0.3f, 1.7f, -0.51f, 3.4f, -2.01f, 4.23f)
                curveToRelative(-0.76f, 0.42f, -1.43f, 1.65f, -1.43f, 2.63f)
                verticalLineToRelative(0.87f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.87f)
                curveToRelative(0f, -1.34f, 0.87f, -2.91f, 1.95f, -3.5f)
                curveToRelative(1.14f, -0.63f, 1.73f, -1.88f, 1.51f, -3.18f)
                curveToRelative(-0.21f, -1.2f, -1.2f, -2.19f, -2.4f, -2.4f)
                curveToRelative(-0.9f, -0.16f, -1.78f, 0.07f, -2.48f, 0.65f)
                curveToRelative(-0.68f, 0.57f, -1.07f, 1.41f, -1.07f, 2.3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.19f, 0.52f, -2.3f, 1.43f, -3.06f)
                curveToRelative(0.91f, -0.76f, 2.11f, -1.08f, 3.29f, -0.87f)
                curveToRelative(1.61f, 0.28f, 2.93f, 1.6f, 3.22f, 3.21f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-7.03f)
                lineToRelative(-3.98f, 3.29f)
                curveToRelative(-0.28f, 0.24f, -0.63f, 0.37f, -0.98f, 0.37f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.13f, -1.0f, -0.38f)
                lineToRelative(-3.9f, -3.28f)
                lineTo(0f, 20f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.47f)
                lineToRelative(4.19f, 3.53f)
                curveToRelative(0.2f, 0.18f, 0.48f, 0.18f, 0.67f, 0.01f)
                lineToRelative(4.28f, -3.54f)
                horizontalLineToRelative(6.39f)
                lineTo(23.0f, 2.5f)
                close()
            }
        }.also { _MessageQuestion = it}
