package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandshakeAngle: ImageVector? = null

val Icons.Ss.HandshakeAngle: ImageVector
    get() = _HandshakeAngle ?: UXIcon(name = "HandshakeAngle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 7f)
                reflectiveCurveToRelative(0.01f, 0f, 0.02f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -2.26f, 1.5f, -4.17f, 3.73f, -4.74f)
                lineToRelative(4.3f, -1.1f)
                lineToRelative(1.28f, -1.15f)
                horizontalLineToRelative(7.67f)
                lineTo(24f, 8.92f)
                lineToRelative(-2f, 2.08f)
                lineTo(13f, 11f)
                lineTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(7f, 7f)
                close()
                moveTo(12.87f, 14f)
                curveToRelative(-0.45f, 1.72f, -2.01f, 3f, -3.87f, 3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(5f, 7.46f)
                curveToRelative(-1.33f, 0.61f, -2.36f, 1.8f, -2.74f, 3.29f)
                lineToRelative(-1.26f, 4.25f)
                lineToRelative(-1f, 1.03f)
                verticalLineToRelative(7.97f)
                lineTo(8.08f, 24f)
                lineToRelative(2.35f, -2f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.22f, -0.01f, 4.19f, -1.5f, 4.79f, -3.63f)
                lineToRelative(1.51f, -5.37f)
                lineTo(13f, 13f)
                lineToRelative(-0.13f, 1f)
                close()
            }
        }.also { _HandshakeAngle = it}
