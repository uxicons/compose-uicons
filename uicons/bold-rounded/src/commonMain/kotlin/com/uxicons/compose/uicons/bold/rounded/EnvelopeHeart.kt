package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Br.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 2.48f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
            reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
            curveToRelative(0f, 1.95f, -2.54f, 4.23f, -3.8f, 5.24f)
            curveToRelative(-0.41f, 0.33f, -0.99f, 0.33f, -1.4f, 0f)
            curveToRelative(-1.26f, -1.01f, -3.8f, -3.29f, -3.8f, -5.24f)
            close()
            moveTo(22.5f, 9f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7.22f)
            lineToRelative(5.11f, 5.11f)
            curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
            curveToRelative(1.45f, 0f, 2.82f, -0.56f, 3.85f, -1.57f)
            lineToRelative(2.64f, -2.3f)
            curveToRelative(0.62f, -0.54f, 0.69f, -1.49f, 0.15f, -2.12f)
            curveToRelative(-0.55f, -0.63f, -1.49f, -0.69f, -2.12f, -0.15f)
            curveToRelative(0f, 0f, -2.72f, 2.37f, -2.75f, 2.4f)
            curveToRelative(-0.94f, 0.94f, -2.59f, 0.94f, -3.54f, 0f)
            lineTo(3.3f, 7.34f)
            curveToRelative(0.42f, -0.79f, 1.24f, -1.34f, 2.2f, -1.34f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 3f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 10.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _EnvelopeHeart = it }
