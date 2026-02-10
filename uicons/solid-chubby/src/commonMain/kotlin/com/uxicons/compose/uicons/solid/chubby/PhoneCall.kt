package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCall: ImageVector? = null

val Icons.Sc.PhoneCall: ImageVector
    get() = _PhoneCall ?: UXIcon(name = "PhoneCall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.24f, 9.24f)
                curveToRelative(0.28f, 0f, 0.51f, 0.24f, 0.51f, 0.53f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -1.95f, -1.57f, -3.53f, -3.51f, -3.53f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.39f, 4.65f)
                curveToRelative(2.72f, 0f, 4.92f, 2.25f, 4.92f, 5.0f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -4.41f, -3.56f, -8.01f, -7.92f, -8.01f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 15.94f)
                curveToRelative(-0.48f, -1.47f, -1.67f, -2.62f, -3.18f, -3.08f)
                curveToRelative(-1.73f, -0.53f, -3.6f, -0.08f, -4.88f, 1.16f)
                lineToRelative(-0.18f, 0.17f)
                curveToRelative(-0.92f, -0.32f, -2.17f, -1.16f, -2.87f, -1.84f)
                curveToRelative(-0.7f, -0.71f, -1.54f, -1.94f, -1.87f, -2.85f)
                lineToRelative(0.17f, -0.17f)
                curveToRelative(1.26f, -1.27f, 1.71f, -3.13f, 1.17f, -4.85f)
                curveToRelative(-0.47f, -1.5f, -1.63f, -2.68f, -3.11f, -3.15f)
                curveToRelative(-1.69f, -0.54f, -3.52f, -0.1f, -4.79f, 1.16f)
                curveToRelative(-0.37f, 0.33f, -2.77f, 2.58f, -2.12f, 6.07f)
                curveToRelative(0.66f, 3.35f, 3.05f, 7.0f, 5.15f, 9.15f)
                curveToRelative(2.15f, 2.05f, 5.83f, 4.42f, 9.22f, 5.07f)
                curveToRelative(0.41f, 0.07f, 0.81f, 0.11f, 1.19f, 0.11f)
                curveToRelative(2.83f, 0f, 4.63f, -1.88f, 4.92f, -2.2f)
                curveToRelative(1.28f, -1.25f, 1.73f, -3.07f, 1.18f, -4.76f)
                close()
            }
        }.also { _PhoneCall = it}
