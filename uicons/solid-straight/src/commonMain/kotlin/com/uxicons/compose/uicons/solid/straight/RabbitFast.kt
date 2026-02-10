package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RabbitFast: ImageVector? = null

val Icons.Ss.RabbitFast: ImageVector
    get() = _RabbitFast ?: UXIcon(name = "RabbitFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.62f)
                curveToRelative(0f, 2.48f, -3.1f, 3.38f, -5.56f, 3.38f)
                reflectiveCurveToRelative(-4.44f, -2.02f, -4.44f, -4.5f)
                curveToRelative(0f, -0.5f, 0.08f, -0.98f, 0.23f, -1.44f)
                curveToRelative(-1.89f, 0.88f, -4.26f, 1.94f, -8.23f, 1.94f)
                verticalLineToRelative(-2f)
                curveToRelative(3.65f, 0f, 5.73f, -0.97f, 7.56f, -1.83f)
                curveToRelative(0.12f, -0.05f, 0.23f, -0.11f, 0.35f, -0.16f)
                curveToRelative(-2.08f, -0.5f, -4.95f, -1.01f, -7.91f, -1.01f)
                lineTo(6f, 0f)
                curveToRelative(5.91f, 0f, 11.26f, 1.85f, 11.8f, 2.05f)
                curveToRelative(0.21f, -0.03f, 0.42f, -0.05f, 0.64f, -0.05f)
                curveToRelative(3.33f, 0f, 5.56f, 3.38f, 5.56f, 5.62f)
                close()
                moveTo(12f, 21f)
                curveToRelative(0f, -2.73f, -1.27f, -4f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(3.47f, 0f, 5.59f, 1.81f, 5.95f, 5f)
                horizontalLineToRelative(2.66f)
                lineToRelative(2.88f, -7.04f)
                curveToRelative(-0.34f, 0.03f, -0.68f, 0.04f, -1.04f, 0.04f)
                curveToRelative(-2.67f, 0f, -4.97f, -1.65f, -5.95f, -4f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.37f, 0f, -2.64f, 0.43f, -3.69f, 1.15f)
                curveToRelative(-0.32f, -0.68f, -1.01f, -1.15f, -1.81f, -1.15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.94f, 0.65f, 1.73f, 1.52f, 1.94f)
                curveToRelative(-0.34f, 0.79f, -0.53f, 1.65f, -0.53f, 2.56f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _RabbitFast = it}
