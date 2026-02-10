package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeHeart: ImageVector? = null

val Icons.Rs.EnvelopeHeart: ImageVector
    get() = _EnvelopeHeart ?: UXIcon(name = "EnvelopeHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.47f, 8.85f)
                lineToRelative(0.53f, 0.33f)
                lineToRelative(0.53f, -0.33f)
                curveToRelative(0.46f, -0.29f, 4.47f, -2.87f, 4.47f, -5.65f)
                curveToRelative(0f, -1.76f, -1.35f, -3.2f, -3f, -3.2f)
                curveToRelative(-0.75f, 0f, -1.46f, 0.31f, -2f, 0.81f)
                curveToRelative(-0.54f, -0.49f, -1.25f, -0.81f, -2f, -0.81f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.2f)
                curveToRelative(0f, 2.78f, 4.01f, 5.36f, 4.47f, 5.65f)
                close()
                moveTo(17f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.55f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.45f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.54f, 1f, 1.2f)
                curveToRelative(0f, 1.06f, -1.61f, 2.62f, -3f, 3.6f)
                curveToRelative(-1.39f, -0.98f, -3f, -2.54f, -3f, -3.6f)
                curveToRelative(0f, -0.66f, 0.45f, -1.2f, 1f, -1.2f)
                close()
                moveTo(24f, 7.7f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(12.02f, 3f)
                curveToRelative(-0.0f, 0.07f, -0.02f, 0.13f, -0.02f, 0.2f)
                curveToRelative(0f, 0.63f, 0.13f, 1.23f, 0.33f, 1.8f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(3.46f, -3.46f)
                lineToRelative(1.67f, 1.16f)
                lineToRelative(-3.71f, 3.71f)
                curveToRelative(-0.97f, 0.97f, -2.25f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(2f, 9.07f)
                verticalLineToRelative(12.93f)
                lineTo(22f, 22f)
                lineTo(22f, 9.56f)
                curveToRelative(0.63f, -0.49f, 1.35f, -1.12f, 2f, -1.86f)
                close()
            }
        }.also { _EnvelopeHeart = it}
