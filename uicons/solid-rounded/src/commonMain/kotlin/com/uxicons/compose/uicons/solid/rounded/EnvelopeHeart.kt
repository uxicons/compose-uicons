package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Sr.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.99f, 2.34f, 4.79f, 3.82f, 5.97f)
                curveToRelative(0.69f, 0.56f, 1.67f, 0.56f, 2.37f, 0f)
                curveToRelative(1.48f, -1.19f, 3.82f, -3.98f, 3.82f, -5.97f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.88f, 14.55f)
                lineTo(0.74f, 5.41f)
                curveToRelative(0.88f, -1.44f, 2.45f, -2.41f, 4.26f, -2.41f)
                horizontalLineToRelative(7.03f)
                curveToRelative(0.32f, 3.01f, 3.41f, 6.13f, 4.53f, 7.03f)
                curveToRelative(0.42f, 0.33f, 0.89f, 0.56f, 1.37f, 0.7f)
                lineToRelative(-3.81f, 3.81f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                curveToRelative(-0.77f, 0f, -1.54f, -0.29f, -2.12f, -0.88f)
                close()
                moveTo(15.54f, 15.96f)
                lineTo(24f, 7.58f)
                verticalLineToRelative(11.42f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 8f)
                curveToRelative(0f, -0.16f, 0.03f, -0.3f, 0.05f, -0.46f)
                lineTo(8.46f, 15.96f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.56f, -0.49f, 3.54f, -1.46f)
                close()
            }
        }.also { _EnvelopeHeart = it}
