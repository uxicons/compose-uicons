package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Ts.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.73f, 8.92f)
                lineToRelative(0.27f, 0.18f)
                lineToRelative(0.27f, -0.18f)
                curveToRelative(0.19f, -0.13f, 4.73f, -3.11f, 4.73f, -5.94f)
                curveToRelative(0f, -1.64f, -1.23f, -2.98f, -2.75f, -2.98f)
                curveToRelative(-0.95f, 0f, -1.76f, 0.47f, -2.25f, 1.23f)
                curveToRelative(-0.49f, -0.76f, -1.3f, -1.23f, -2.25f, -1.23f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.33f, -2.75f, 2.98f)
                curveToRelative(0f, 2.83f, 4.53f, 5.82f, 4.73f, 5.94f)
                close()
                moveTo(16.75f, 1f)
                curveToRelative(1.01f, 0f, 1.75f, 0.84f, 1.75f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.16f, 0.74f, -2f, 1.75f, -2f)
                curveToRelative(0.96f, 0f, 1.75f, 0.89f, 1.75f, 1.98f)
                curveToRelative(0f, 1.77f, -2.67f, 4.0f, -4f, 4.92f)
                curveToRelative(-1.33f, -0.92f, -4f, -3.15f, -4f, -4.92f)
                curveToRelative(0f, -1.09f, 0.79f, -1.98f, 1.75f, -1.98f)
                close()
                moveTo(23f, 8.51f)
                curveToRelative(0.34f, -0.32f, 0.68f, -0.67f, 1f, -1.05f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(12.12f, 4f)
                curveToRelative(0.07f, 0.34f, 0.17f, 0.68f, 0.3f, 1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1f, 0.28f, -1.27f, 0.7f)
                lineTo(9.51f, 13.97f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(3.27f, -3.32f, 3.27f, -3.32f)
                lineToRelative(0.85f, 0.56f)
                lineToRelative(-3.42f, 3.47f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 8.51f)
                close()
            }
        }.also { _EnvelopeHeart = it}
