package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Tr.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 7.5f)
                curveTo(0f, 5.02f, 2.02f, 3f, 4.5f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(4.5f, 4f)
                curveToRelative(-1.61f, 0f, -2.96f, 1.1f, -3.36f, 2.59f)
                lineTo(9.53f, 14.97f)
                curveToRelative(1.32f, 1.32f, 3.63f, 1.32f, 4.95f, 0f)
                lineToRelative(3.7f, -3.82f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.01f, 0.71f)
                lineToRelative(-3.7f, 3.83f)
                curveToRelative(-0.85f, 0.86f, -1.99f, 1.32f, -3.19f, 1.32f)
                reflectiveCurveToRelative(-2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1f, 7.86f)
                verticalLineToRelative(11.64f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 8.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14f, 2.98f)
                curveToRelative(0f, -1.64f, 1.23f, -2.98f, 2.75f, -2.98f)
                curveToRelative(0.91f, 0f, 1.74f, 0.45f, 2.25f, 1.1f)
                curveToRelative(0.51f, -0.66f, 1.34f, -1.1f, 2.25f, -1.1f)
                curveToRelative(1.52f, 0f, 2.75f, 1.33f, 2.75f, 2.98f)
                curveToRelative(0f, 1.97f, -2.17f, 4.43f, -3.55f, 5.52f)
                curveToRelative(-0.43f, 0.34f, -0.94f, 0.51f, -1.45f, 0.51f)
                curveToRelative(-0.51f, 0f, -1.03f, -0.17f, -1.45f, -0.51f)
                curveToRelative(-1.37f, -1.09f, -3.55f, -3.55f, -3.55f, -5.52f)
                close()
                moveTo(15f, 2.98f)
                curveToRelative(0f, 1.51f, 1.89f, 3.72f, 3.17f, 4.73f)
                curveToRelative(0.49f, 0.39f, 1.18f, 0.39f, 1.67f, 0f)
                curveToRelative(1.28f, -1.01f, 3.17f, -3.22f, 3.17f, -4.73f)
                curveToRelative(0f, -1.09f, -0.79f, -1.98f, -1.75f, -1.98f)
                curveToRelative(-0.98f, 0f, -1.75f, 0.81f, -1.75f, 1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -0.69f, -0.77f, -1.5f, -1.75f, -1.5f)
                curveToRelative(-0.96f, 0f, -1.75f, 0.89f, -1.75f, 1.98f)
                close()
            }
        }.also { _EnvelopeHeart = it}
