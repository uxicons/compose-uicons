package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Br.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(488.93f, 188.54f)
            curveTo(437.4f, 109.02f, 349.41f, 60.66f, 254.65f, 59.77f)
            curveTo(159.9f, 60.66f, 71.91f, 109.02f, 20.37f, 188.54f)
            curveToRelative(-27.16f, 39.86f, -27.16f, 92.28f, 0f, 132.14f)
            curveToRelative(51.51f, 79.57f, 139.5f, 127.98f, 234.28f, 128.9f)
            curveToRelative(94.75f, -0.89f, 182.74f, -49.25f, 234.28f, -128.77f)
            curveTo(516.15f, 280.92f, 516.15f, 228.43f, 488.93f, 188.54f)
            close()
            moveTo(436.2f, 284.54f)
            curveToRelative(-39.35f, 62.41f, -107.77f, 100.49f, -181.55f, 101.04f)
            curveToRelative(-73.78f, -0.55f, -142.2f, -38.62f, -181.55f, -101.04f)
            curveToRelative(-12.27f, -18.02f, -12.27f, -41.71f, 0f, -59.73f)
            curveToRelative(39.35f, -62.41f, 107.77f, -100.49f, 181.55f, -101.04f)
            curveToRelative(73.78f, 0.55f, 142.2f, 38.62f, 181.55f, 101.04f)
            curveTo(448.47f, 242.83f, 448.47f, 266.52f, 436.2f, 284.54f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(254.65f, 254.67f)
            moveToRelative(-85.33f, 0f)
            arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, 170.67f, 0f)
            arcToRelative(85.33f, 85.33f, 0f, isMoreThanHalf = true, isPositiveArc = true, -170.67f, 0f)
        }
    }.also { _Eye = it }
