package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Tr.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.61f, 23f)
                curveToRelative(-0.52f, 0f, -1.02f, -0.18f, -1.43f, -0.52f)
                curveTo(4.98f, 18.91f, 0f, 13.71f, 0f, 9.05f)
                curveToRelative(-0.07f, -1.96f, 0.61f, -3.84f, 1.87f, -5.15f)
                curveToRelative(1.2f, -1.24f, 2.8f, -1.9f, 4.64f, -1.9f)
                curveToRelative(2.28f, 0.05f, 4.37f, 1.31f, 5.47f, 3.29f)
                curveToRelative(0.01f, 0f, 1.01f, 1.43f, 1.02f, 3.74f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(11.56f)
                curveToRelative(0f, 0.94f, -0.54f, 1.78f, -1.4f, 2.18f)
                curveToRelative(-0.32f, 0.15f, -0.66f, 0.22f, -0.99f, 0.22f)
                close()
                moveTo(6.51f, 3f)
                curveToRelative(-1.55f, 0f, -2.9f, 0.55f, -3.91f, 1.59f)
                curveToRelative(-1.08f, 1.12f, -1.66f, 2.74f, -1.59f, 4.44f)
                curveToRelative(0f, 4.52f, 5.51f, 9.87f, 8.79f, 12.65f)
                curveToRelative(0.4f, 0.34f, 0.91f, 0.4f, 1.38f, 0.18f)
                curveToRelative(0.4f, -0.19f, 0.83f, -0.62f, 0.83f, -1.28f)
                verticalLineTo(9.03f)
                curveToRelative(0f, -1.97f, -0.85f, -3.2f, -0.86f, -3.21f)
                curveToRelative(-0.96f, -1.72f, -2.72f, -2.79f, -4.63f, -2.83f)
                close()
            }
        }.also { _HeartHalf = it}
