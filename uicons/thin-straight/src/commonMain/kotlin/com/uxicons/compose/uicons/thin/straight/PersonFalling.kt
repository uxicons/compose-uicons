package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonFalling: ImageVector? = null

val Icons.Ts.PersonFalling: ImageVector
    get() = _PersonFalling ?: UXIcon(name = "PersonFalling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.17f, 15f)
                horizontalLineToRelative(-4.12f)
                lineTo(11.02f, 6.16f)
                lineToRelative(3.21f, -1.71f)
                lineToRelative(3.3f, -3.73f)
                lineToRelative(-0.75f, -0.66f)
                lineToRelative(-3.09f, 3.55f)
                lineToRelative(-6.5f, 3.47f)
                curveToRelative(-0.67f, 0.36f, -1.25f, 0.89f, -1.66f, 1.53f)
                lineTo(0.62f, 16.19f)
                lineToRelative(0.84f, 0.54f)
                lineToRelative(4.9f, -7.59f)
                curveToRelative(0.03f, -0.04f, 0.07f, -0.07f, 0.09f, -0.11f)
                lineToRelative(6.72f, 14.97f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-3.59f, -8f)
                horizontalLineToRelative(8.07f)
                lineToRelative(3.81f, 3.89f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(-4.11f, -4.19f)
                close()
                moveTo(7.21f, 8.27f)
                curveToRelative(0.15f, -0.11f, 2.93f, -1.64f, 2.93f, -1.64f)
                lineToRelative(3.82f, 8.37f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-3.02f, -6.73f)
                close()
                moveTo(6.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(6.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _PersonFalling = it}
