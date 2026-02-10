package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Rs.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24.1f)
                lineToRelative(-1.58f, -1.13f)
                curveTo(10.25f, 22.14f, 0f, 14.64f, 0f, 8.01f)
                curveToRelative(-0.07f, -1.92f, 0.61f, -3.79f, 1.87f, -5.1f)
                curveToRelative(1.2f, -1.25f, 2.81f, -1.91f, 4.64f, -1.91f)
                curveToRelative(2.28f, 0.05f, 4.36f, 1.29f, 5.46f, 3.26f)
                curveToRelative(0.2f, 0.3f, 1.02f, 1.68f, 1.02f, 3.74f)
                verticalLineTo(24.1f)
                close()
                moveTo(6.5f, 3f)
                curveToRelative(-1.26f, 0f, -2.37f, 0.45f, -3.18f, 1.29f)
                curveToRelative(-0.89f, 0.92f, -1.36f, 2.26f, -1.31f, 3.68f)
                curveToRelative(0f, 4.01f, 5.23f, 9.18f, 9f, 12.18f)
                verticalLineTo(8f)
                curveToRelative(0f, -3.61f, -2.94f, -4.97f, -4.5f, -5f)
                close()
            }
        }.also { _HeartHalf = it}
