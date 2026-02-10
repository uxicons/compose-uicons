package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeMarker: ImageVector? = null

val Icons.Tr.EnvelopeMarker: ImageVector
    get() = _EnvelopeMarker ?: UXIcon(name = "EnvelopeMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.8f)
                curveToRelative(0f, 0.66f, 0.37f, 1.25f, 0.96f, 1.53f)
                curveToRelative(0.24f, 0.11f, 0.49f, 0.17f, 0.74f, 0.17f)
                curveToRelative(0.38f, 0f, 0.75f, -0.13f, 1.06f, -0.38f)
                lineToRelative(1.74f, -1.39f)
                lineToRelative(1.74f, 1.39f)
                curveToRelative(0.52f, 0.41f, 1.2f, 0.49f, 1.8f, 0.2f)
                curveToRelative(0.59f, -0.29f, 0.96f, -0.87f, 0.96f, -1.53f)
                lineTo(24f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 9.3f)
                curveToRelative(0f, 0.28f, -0.15f, 0.51f, -0.4f, 0.63f)
                curveToRelative(-0.25f, 0.12f, -0.53f, 0.09f, -0.74f, -0.08f)
                lineToRelative(-2.05f, -1.64f)
                curveToRelative(-0.18f, -0.15f, -0.44f, -0.15f, -0.62f, 0f)
                lineToRelative(-2.05f, 1.64f)
                curveToRelative(-0.22f, 0.17f, -0.49f, 0.2f, -0.74f, 0.08f)
                curveToRelative(-0.25f, -0.12f, -0.4f, -0.35f, -0.4f, -0.63f)
                lineTo(16.0f, 1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.8f)
                close()
                moveTo(24f, 13.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 7.5f)
                curveTo(0f, 5.02f, 2.02f, 3f, 4.5f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 4f)
                curveToRelative(-1.61f, 0f, -2.97f, 1.09f, -3.38f, 2.57f)
                lineToRelative(8.4f, 8.4f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                lineToRelative(2.17f, -2.13f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                lineToRelative(-2.17f, 2.13f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.31f, -3.18f, 1.31f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1f, 7.86f)
                verticalLineToRelative(11.64f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _EnvelopeMarker = it}
