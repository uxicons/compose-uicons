package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dress: ImageVector? = null

val Icons.Rs.Dress: ImageVector
    get() = _Dress ?: UXIcon(name = "Dress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.11f, 9.63f)
                lineToRelative(0.63f, -2.84f)
                curveToRelative(0.17f, -0.78f, 0.26f, -1.58f, 0.26f, -2.39f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 2.1f)
                curveToRelative(-1.33f, 0.25f, -2.35f, 0.94f, -3f, 1.51f)
                curveToRelative(-0.65f, -0.58f, -1.67f, -1.26f, -3f, -1.51f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 4.4f)
                curveToRelative(0f, 0.8f, 0.09f, 1.6f, 0.26f, 2.39f)
                lineToRelative(0.63f, 2.84f)
                lineTo(0.38f, 16.01f)
                curveToRelative(1.85f, 4.8f, 6.46f, 8.08f, 11.62f, 8.06f)
                curveToRelative(5.16f, 0.02f, 9.77f, -3.25f, 11.62f, -8.06f)
                lineToRelative(-7.51f, -6.38f)
                close()
                moveTo(11.19f, 5.65f)
                lineToRelative(0.8f, 1.09f)
                lineToRelative(0.81f, -1.09f)
                curveToRelative(0.01f, -0.01f, 0.84f, -1.09f, 2.19f, -1.49f)
                curveToRelative(0.01f, 0.73f, -0.05f, 1.47f, -0.21f, 2.19f)
                lineToRelative(-0.59f, 2.65f)
                horizontalLineToRelative(-4.39f)
                lineToRelative(-0.59f, -2.65f)
                curveToRelative(-0.16f, -0.72f, -0.23f, -1.46f, -0.21f, -2.19f)
                curveToRelative(1.35f, 0.41f, 2.18f, 1.48f, 2.19f, 1.49f)
                close()
                moveTo(12f, 22.06f)
                curveToRelative(-3.85f, 0f, -7.37f, -2.14f, -9.16f, -5.52f)
                lineToRelative(6.53f, -5.55f)
                horizontalLineToRelative(5.27f)
                lineToRelative(6.53f, 5.55f)
                curveToRelative(-1.79f, 3.37f, -5.31f, 5.52f, -9.16f, 5.52f)
                close()
            }
        }.also { _Dress = it}
