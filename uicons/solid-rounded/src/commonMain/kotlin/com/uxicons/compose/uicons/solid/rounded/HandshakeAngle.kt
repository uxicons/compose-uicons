package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandshakeAngle: ImageVector? = null

val Icons.Sr.HandshakeAngle: ImageVector
    get() = _HandshakeAngle ?: UXIcon(name = "HandshakeAngle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                curveToRelative(0.33f, -2.38f, 2.12f, -4.32f, 4.5f, -4.94f)
                lineToRelative(3.47f, -0.9f)
                curveToRelative(0.17f, -0.04f, 0.33f, -0.14f, 0.46f, -0.26f)
                lineToRelative(0.61f, -0.61f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(6.26f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(24.01f, 9.1f)
                curveToRelative(0f, 0.27f, -0.11f, 0.54f, -0.31f, 0.73f)
                lineToRelative(-1.24f, 1.17f)
                lineTo(13f, 11f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, 0f, -0.02f, -6f, 0f, -6f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                lineTo(5f, 7.73f)
                curveToRelative(-1.42f, 0.78f, -2.51f, 2.12f, -2.94f, 3.77f)
                lineToRelative(-0.9f, 3.47f)
                curveToRelative(-0.04f, 0.17f, -0.14f, 0.33f, -0.26f, 0.46f)
                lineToRelative(-0.61f, 0.61f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(6.26f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.07f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.71f, -0.3f)
                lineToRelative(1.34f, -1.37f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f)
                lineToRelative(3.33f, -0.02f)
                curveToRelative(2.66f, -0.01f, 5.02f, -1.81f, 5.75f, -4.37f)
                lineToRelative(1.31f, -4.64f)
                lineTo(13f, 13.01f)
                close()
            }
        }.also { _HandshakeAngle = it}
