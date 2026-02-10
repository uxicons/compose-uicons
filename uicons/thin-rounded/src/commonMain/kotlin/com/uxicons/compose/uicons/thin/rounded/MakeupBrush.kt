package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Tr.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.37f, 0.63f)
                curveToRelative(-0.82f, -0.81f, -2.12f, -0.85f, -2.97f, -0.07f)
                lineTo(6.45f, 13.23f)
                lineToRelative(-5.03f, 1.98f)
                curveToRelative(-0.86f, 0.34f, -1.41f, 1.15f, -1.41f, 2.07f)
                curveToRelative(0f, 3.7f, 3.01f, 6.71f, 6.73f, 6.71f)
                curveToRelative(0.92f, 0f, 1.74f, -0.56f, 2.08f, -1.42f)
                lineToRelative(1.97f, -5.03f)
                lineTo(23.44f, 3.6f)
                curveToRelative(0.77f, -0.85f, 0.74f, -2.16f, -0.07f, -2.97f)
                close()
                moveTo(10.32f, 16.56f)
                lineToRelative(-2.88f, -2.88f)
                lineToRelative(2.25f, -2.04f)
                lineToRelative(2.68f, 2.68f)
                lineToRelative(-2.04f, 2.25f)
                close()
                moveTo(7.87f, 22.22f)
                curveToRelative(-0.19f, 0.47f, -0.64f, 0.78f, -1.16f, 0.78f)
                curveToRelative(-3.15f, 0f, -5.71f, -2.56f, -5.71f, -5.71f)
                curveToRelative(0f, -0.51f, 0.31f, -0.96f, 0.78f, -1.15f)
                lineToRelative(4.82f, -1.9f)
                lineToRelative(3.16f, 3.16f)
                lineToRelative(-1.88f, 4.81f)
                close()
                moveTo(22.7f, 2.93f)
                lineToRelative(-9.66f, 10.64f)
                lineToRelative(-2.61f, -2.61f)
                lineTo(21.07f, 1.3f)
                curveToRelative(0.46f, -0.42f, 1.16f, -0.4f, 1.59f, 0.04f)
                curveToRelative(0.44f, 0.44f, 0.45f, 1.14f, 0.04f, 1.59f)
                close()
            }
        }.also { _MakeupBrush = it}
