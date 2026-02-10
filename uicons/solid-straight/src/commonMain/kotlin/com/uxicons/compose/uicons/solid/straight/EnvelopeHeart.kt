package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Ss.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.75f)
                curveToRelative(0f, 2.88f, -5f, 6.25f, -5f, 6.25f)
                curveToRelative(0f, 0f, -5f, -3.37f, -5f, -6.25f)
                curveToRelative(0f, -1.52f, 1.12f, -2.75f, 2.5f, -2.75f)
                reflectiveCurveToRelative(2.5f, 1.25f, 2.5f, 2.5f)
                curveToRelative(0f, -1.25f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.23f, 2.5f, 2.75f)
                close()
                moveTo(14.12f, 14.12f)
                lineToRelative(3.58f, -3.58f)
                curveToRelative(-1.25f, -0.86f, -5.49f, -4.06f, -5.69f, -7.54f)
                lineTo(3f, 3f)
                curveToRelative(-1.15f, 0f, -2.13f, 0.66f, -2.64f, 1.6f)
                lineTo(9.88f, 14.12f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                close()
                moveTo(24f, 7.22f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 7.07f)
                lineTo(8.46f, 15.54f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.56f, -0.49f, 3.54f, -1.46f)
                lineToRelative(5.7f, -5.69f)
                curveToRelative(0.81f, -0.63f, 1.85f, -1.54f, 2.77f, -2.62f)
                close()
            }
        }.also { _EnvelopeHeart = it}
