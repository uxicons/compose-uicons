package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageAlert: ImageVector? = null

val Icons.Sr.MessageAlert: ImageVector
    get() = _MessageAlert ?: UXIcon(name = "MessageAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.47f, 12.38f)
                lineToRelative(-5.23f, 8.96f)
                curveToRelative(-0.69f, 1.18f, 0.16f, 2.66f, 1.53f, 2.66f)
                horizontalLineToRelative(10.45f)
                curveToRelative(1.37f, 0f, 2.22f, -1.48f, 1.53f, -2.66f)
                lineToRelative(-5.23f, -8.96f)
                curveToRelative(-0.68f, -1.17f, -2.38f, -1.17f, -3.06f, 0f)
                close()
                moveTo(17f, 23f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 0f)
                curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3.45f)
                curveToRelative(-0.62f, -1.16f, -0.6f, -2.52f, 0.07f, -3.67f)
                lineToRelative(1.94f, -3.33f)
                horizontalLineToRelative(-2.46f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.62f)
                lineToRelative(1.17f, -2f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.99f)
                curveToRelative(0.71f, -0.95f, 1.8f, -1.5f, 3.01f, -1.5f)
                curveToRelative(1.36f, 0f, 2.57f, 0.7f, 3.26f, 1.87f)
                lineToRelative(2.9f, 4.97f)
                curveToRelative(0.27f, -0.68f, 0.49f, -1.38f, 0.63f, -2.12f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.02f, 0.01f, -0.04f)
                curveToRelative(0.04f, -0.2f, 0.06f, -0.4f, 0.08f, -0.59f)
                curveToRelative(0.02f, -0.14f, 0.04f, -0.28f, 0.06f, -0.43f)
                curveToRelative(0.04f, -0.39f, 0.06f, -0.77f, 0.06f, -1.16f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                close()
                moveTo(16f, 9f)
                lineTo(8f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _MessageAlert = it}
