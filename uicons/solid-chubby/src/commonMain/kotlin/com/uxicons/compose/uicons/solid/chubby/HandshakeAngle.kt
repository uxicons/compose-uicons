package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandshakeAngle: ImageVector? = null

val Icons.Sc.HandshakeAngle: ImageVector
    get() = _HandshakeAngle ?: UXIcon(name = "HandshakeAngle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.26f, 1.21f)
                reflectiveCurveToRelative(6.43f, 6.49f, 6.45f, 6.52f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.92f, 0.92f)
                curveToRelative(-1.12f, 0.51f, -1.9f, 0.94f, -4.79f, 0.94f)
                horizontalLineToRelative(-3.07f)
                curveToRelative(0.04f, -0.5f, 0.07f, -1.02f, 0.07f, -1.6f)
                verticalLineToRelative(-1.4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 2.4f, -0.47f, 5.6f, -2.14f, 5.6f)
                curveToRelative(-0.89f, 0f, -1.37f, -0.56f, -1.48f, -1.26f)
                curveToRelative(0f, 0f, -0.39f, -3.27f, -0.39f, -5.2f)
                curveToRelative(0f, -2.91f, 0.79f, -5.55f, 6.25f, -6.53f)
                curveToRelative(0.03f, -0.01f, 0.85f, -0.79f, 0.85f, -0.79f)
                curveToRelative(0.32f, -0.32f, 0.83f, -0.32f, 1.16f, -0.01f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.81f, 3.53f, -2.8f, 4f, -3.78f, 4f)
                curveToRelative(-1.54f, 0f, -2.92f, -1.03f, -3.37f, -2.5f)
                curveToRelative(0f, 0f, -0.49f, -1.88f, -0.49f, -5.95f)
                curveToRelative(0f, -0.44f, 0.03f, -0.85f, 0.08f, -1.25f)
                curveToRelative(-2.29f, 0.85f, -3.4f, 2.82f, -3.85f, 7.58f)
                lineToRelative(-0.94f, 1.02f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(5.4f, 5.36f)
                curveToRelative(0.36f, 0.43f, 1.04f, 0.44f, 1.44f, 0.05f)
                lineToRelative(1.76f, -1.72f)
                curveToRelative(2.03f, -0.01f, 6.13f, -0.11f, 7.81f, -1.79f)
                curveToRelative(1.43f, -1.43f, 2.17f, -3.25f, 3.27f, -6.8f)
                curveToRelative(-1.23f, 0.44f, -2.4f, 0.59f, -3.97f, 0.59f)
                close()
            }
        }.also { _HandshakeAngle = it}
