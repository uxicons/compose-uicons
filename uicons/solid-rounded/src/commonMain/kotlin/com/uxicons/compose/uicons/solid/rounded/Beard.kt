package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beard: ImageVector? = null

val Icons.Sr.Beard: ImageVector
    get() = _Beard ?: UXIcon(name = "Beard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.2f, 2.02f)
                curveToRelative(-0.47f, -0.1f, -0.93f, 0.15f, -1.12f, 0.59f)
                curveToRelative(-1.06f, 2.28f, -3.29f, 4.73f, -4.68f, 5.38f)
                curveToRelative(-0.74f, -0.74f, -2.24f, -1.99f, -3.9f, -1.99f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3.15f, 1.25f, -3.9f, 1.99f)
                curveToRelative(-1.4f, -0.65f, -3.62f, -3.1f, -4.68f, -5.38f)
                curveToRelative(-0.39f, -0.98f, -1.95f, -0.66f, -1.92f, 0.39f)
                verticalLineToRelative(6.83f)
                curveToRelative(0f, 3.84f, 3.27f, 9.39f, 9.51f, 12.57f)
                curveToRelative(1.58f, 0.81f, 3.4f, 0.81f, 4.98f, 0f)
                curveToRelative(6.24f, -3.18f, 9.51f, -8.73f, 9.51f, -12.57f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.47f, -0.33f, -0.88f, -0.8f, -0.98f)
                close()
                moveTo(14.8f, 11.77f)
                curveToRelative(-0.74f, 0.19f, -2.1f, 0.23f, -2.8f, 0.23f)
                curveToRelative(-0.68f, 0f, -2.05f, -0.05f, -2.78f, -0.23f)
                curveToRelative(-0.55f, -0.13f, -0.87f, -0.73f, -0.65f, -1.25f)
                curveToRelative(0.37f, -0.86f, 1.19f, -1.52f, 2.12f, -1.52f)
                horizontalLineToRelative(2.65f)
                curveToRelative(0.94f, 0f, 1.74f, 0.67f, 2.1f, 1.54f)
                curveToRelative(0.21f, 0.51f, -0.1f, 1.1f, -0.63f, 1.23f)
                close()
            }
        }.also { _Beard = it}
