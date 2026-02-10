package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Rr.HeartHalf: ImageVector
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
                moveTo(6.5f, 4.01f)
                curveToRelative(-1.26f, 0f, -2.37f, 0.45f, -3.18f, 1.3f)
                curveToRelative(-0.89f, 0.92f, -1.36f, 2.26f, -1.31f, 3.68f)
                curveToRelative(0f, 3.58f, 4.08f, 8.65f, 7.87f, 11.87f)
                curveToRelative(0.27f, 0.23f, 0.54f, 0.15f, 0.68f, 0.09f)
                curveToRelative(0.21f, -0.1f, 0.44f, -0.33f, 0.44f, -0.68f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.62f, -0.73f, -2.7f, -0.75f, -2.72f)
                curveToRelative(-0.76f, -1.37f, -2.19f, -2.23f, -3.75f, -2.27f)
                close()
            }
        }.also { _HeartHalf = it}
