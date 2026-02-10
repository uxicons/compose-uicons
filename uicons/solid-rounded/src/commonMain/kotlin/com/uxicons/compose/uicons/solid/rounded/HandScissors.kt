package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandScissors: ImageVector? = null

val Icons.Sr.HandScissors: ImageVector
    get() = _HandScissors ?: UXIcon(name = "HandScissors") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.95f, 2.95f)
                curveToRelative(-0.44f, -0.46f, -1.01f, -0.77f, -1.64f, -0.9f)
                curveToRelative(-0.98f, -0.18f, -1.98f, 0.12f, -2.68f, 0.83f)
                lineToRelative(-2.44f, 2.48f)
                lineToRelative(3.83f, 0.88f)
                curveToRelative(0.53f, 0.12f, 0.86f, 0.65f, 0.74f, 1.18f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.12f, 0.53f, -0.65f, 0.86f, -1.17f, 0.74f)
                lineTo(2.01f, 5.04f)
                curveToRelative(-0.89f, -0.21f, -1.78f, 0.34f, -1.99f, 1.23f)
                curveToRelative(-0.21f, 0.89f, 0.34f, 1.78f, 1.23f, 1.99f)
                lineToRelative(9.05f, 2.24f)
                lineTo(1.25f, 12.74f)
                curveToRelative(-0.89f, 0.21f, -1.44f, 1.1f, -1.23f, 1.99f)
                curveToRelative(0.21f, 0.89f, 1.1f, 1.44f, 1.99f, 1.23f)
                lineToRelative(7.26f, -1.78f)
                lineToRelative(0.86f, 3.9f)
                curveToRelative(0.51f, 2.29f, 2.54f, 3.92f, 4.88f, 3.92f)
                horizontalLineToRelative(3.98f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0f, -1.86f, -0.74f, -3.63f, -2.05f, -4.95f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }.also { _HandScissors = it}
