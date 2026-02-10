package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Rs.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.34f, 19.93f)
                curveToRelative(0.69f, -0.15f, 1.3f, -0.54f, 1.74f, -1.11f)
                curveToRelative(0.57f, -0.75f, 0.76f, -1.71f, 0.5f, -2.62f)
                lineToRelative(-2.6f, -9.37f)
                curveTo(19.86f, 2.81f, 16.17f, 0f, 12f, 0f)
                curveToRelative(-2.88f, 0f, -5.47f, 1.3f, -7.19f, 3.4f)
                lineTo(1.43f, 0.02f)
                lineTo(0.02f, 1.43f)
                lineToRelative(22.55f, 22.55f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.64f, -2.64f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.28f, 0f, 6.18f, 2.21f, 7.05f, 5.36f)
                lineToRelative(2.6f, 9.37f)
                curveToRelative(0.08f, 0.3f, 0.02f, 0.62f, -0.17f, 0.87f)
                reflectiveCurveToRelative(-0.48f, 0.4f, -0.8f, 0.4f)
                horizontalLineToRelative(-1.28f)
                lineTo(6.23f, 4.82f)
                curveToRelative(1.34f, -1.74f, 3.44f, -2.81f, 5.77f, -2.81f)
                close()
                moveTo(3.82f, 18f)
                curveToRelative(-0.3f, 0f, -0.59f, -0.14f, -0.78f, -0.37f)
                curveToRelative(-0.19f, -0.24f, -0.26f, -0.55f, -0.2f, -0.84f)
                lineToRelative(1.75f, -7.88f)
                lineToRelative(-1.67f, -1.67f)
                curveToRelative(-0.01f, 0.03f, -0.01f, 0.05f, -0.02f, 0.07f)
                lineTo(0.89f, 16.35f)
                curveToRelative(-0.2f, 0.89f, 0.02f, 1.81f, 0.59f, 2.53f)
                reflectiveCurveToRelative(1.43f, 1.12f, 2.34f, 1.12f)
                horizontalLineToRelative(3.61f)
                curveToRelative(0.47f, 2.28f, 2.48f, 4f, 4.9f, 4f)
                curveToRelative(1.99f, 0f, 3.7f, -1.18f, 4.5f, -2.87f)
                lineToRelative(-3.13f, -3.13f)
                lineTo(3.82f, 18f)
                close()
                moveTo(12.32f, 22f)
                curveToRelative(-1.3f, 0f, -2.4f, -0.84f, -2.82f, -2f)
                horizontalLineToRelative(5.63f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                close()
            }
        }.also { _BellSlash = it}
