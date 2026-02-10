package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Sr.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.27f, 23f)
                curveToRelative(-0.6f, 0f, -1.18f, -0.21f, -1.66f, -0.6f)
                curveTo(5.39f, 19.67f, 0f, 13.81f, 0f, 9.01f)
                curveToRelative(-0.07f, -1.92f, 0.61f, -3.79f, 1.87f, -5.1f)
                curveToRelative(1.2f, -1.25f, 2.81f, -1.91f, 4.64f, -1.91f)
                curveToRelative(2.28f, 0.05f, 4.36f, 1.29f, 5.46f, 3.26f)
                curveToRelative(0.2f, 0.3f, 1.02f, 1.67f, 1.02f, 3.73f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(11.26f)
                curveToRelative(0f, 1.08f, -0.61f, 2.03f, -1.6f, 2.49f)
                curveToRelative(-0.37f, 0.17f, -0.75f, 0.26f, -1.14f, 0.26f)
                close()
            }
        }.also { _HeartHalf = it}
