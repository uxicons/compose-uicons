package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BadgePercent: ImageVector? = null

val Icons.Sr.BadgePercent: ImageVector
    get() = _BadgePercent ?: UXIcon(name = "BadgePercent") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, -1.63f, -0.71f, -3.16f, -1.93f, -4.12f)
                curveToRelative(0.14f, -1.62f, -0.44f, -3.21f, -1.59f, -4.36f)
                curveToRelative(-1.15f, -1.15f, -2.73f, -1.73f, -4.28f, -1.55f)
                curveToRelative(-2.01f, -2.56f, -6.37f, -2.6f, -8.33f, -0.04f)
                curveTo(4.64f, 1.54f, 1.53f, 4.58f, 1.96f, 7.79f)
                curveToRelative(-2.56f, 2.01f, -2.6f, 6.37f, -0.04f, 8.33f)
                curveToRelative(-0.14f, 1.62f, 0.44f, 3.21f, 1.59f, 4.36f)
                curveToRelative(1.15f, 1.15f, 2.74f, 1.73f, 4.28f, 1.55f)
                curveToRelative(2.01f, 2.56f, 6.37f, 2.6f, 8.33f, 0.04f)
                curveToRelative(1.62f, 0.14f, 3.21f, -0.44f, 4.36f, -1.59f)
                curveToRelative(1.15f, -1.15f, 1.73f, -2.74f, 1.55f, -4.28f)
                curveToRelative(1.25f, -1.05f, 1.96f, -2.58f, 1.96f, -4.21f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0.01f, -1.31f, 1.99f, -1.31f, 2f, 0f)
                curveToRelative(-0.01f, 1.31f, -1.99f, 1.31f, -2f, 0f)
                close()
                moveTo(10.83f, 15.55f)
                curveToRelative(-0.31f, 0.46f, -0.93f, 0.58f, -1.39f, 0.28f)
                curveToRelative(-0.46f, -0.31f, -0.58f, -0.93f, -0.28f, -1.39f)
                lineToRelative(4f, -6f)
                curveToRelative(0.31f, -0.46f, 0.93f, -0.58f, 1.39f, -0.28f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                lineToRelative(-4f, 6f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
            }
        }.also { _BadgePercent = it}
