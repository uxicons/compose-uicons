package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Rr.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 23f)
                lineTo(5f, 23f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-2.2f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(1f, 10f)
                curveToRelative(0f, -1.23f, 0.7f, -2.3f, 1.84f, -2.77f)
                reflectiveCurveToRelative(2.39f, -0.23f, 3.27f, 0.64f)
                lineToRelative(1.47f, 1.48f)
                lineTo(14.76f, 2.17f)
                curveToRelative(1.51f, -1.51f, 4.14f, -1.51f, 5.66f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.76f, 0.75f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.07f, -1.17f, 2.83f)
                lineToRelative(-7.17f, 7.17f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(0.87f, 0.88f, 1.12f, 2.13f, 0.64f, 3.27f)
                curveToRelative(-0.47f, 1.14f, -1.54f, 1.84f, -2.77f, 1.84f)
                close()
                moveTo(5f, 21f)
                lineTo(14f, 21f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.62f, 0f, 0.86f, -0.47f, 0.92f, -0.62f)
                curveToRelative(0.06f, -0.14f, 0.22f, -0.65f, -0.21f, -1.09f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.38f, -0.38f, 0.59f, -0.88f, 0.59f, -1.41f)
                reflectiveCurveToRelative(-0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.76f, -0.76f, -2.07f, -0.76f, -2.83f, 0f)
                lineToRelative(-7.88f, 7.88f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.44f, -0.43f, -0.94f, -0.27f, -1.08f, -0.21f)
                curveToRelative(-0.14f, 0.06f, -0.62f, 0.3f, -0.62f, 0.92f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _DownLeft = it}
