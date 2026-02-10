package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Bs.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, 2.59f, -4.5f, 5.78f, -4.5f, 5.78f)
                curveToRelative(0f, 0f, -4.5f, -3.18f, -4.5f, -5.78f)
                close()
                moveTo(24f, 6.85f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(13.04f, 3f)
                curveToRelative(0.13f, 1.05f, 0.64f, 2.07f, 1.3f, 3f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.36f, 7.36f)
                curveToRelative(0.44f, 0.44f, 1.04f, 0.66f, 1.64f, 0.66f)
                curveToRelative(0.6f, 0f, 1.2f, -0.22f, 1.64f, -0.66f)
                lineToRelative(4.32f, -4.32f)
                lineToRelative(1.54f, 1f)
                curveToRelative(0.49f, -0.34f, 3.19f, -2.62f, 4.5f, -4.15f)
                close()
                moveTo(21f, 11.2f)
                lineToRelative(-5.24f, 5.24f)
                curveToRelative(-1.0f, 1.0f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineTo(3f, 11.2f)
                verticalLineToRelative(9.8f)
                lineTo(21f, 21f)
                lineTo(21f, 11.2f)
                close()
            }
        }.also { _EnvelopeHeart = it}
