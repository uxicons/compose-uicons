package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RotateReverse: ImageVector? = null

val Icons.Br.RotateReverse: ImageVector
    get() = _RotateReverse ?: UXIcon(name = "RotateReverse") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 17.19f)
            verticalLineToRelative(4.52f)
            curveToRelative(0f, 0.7f, -0.85f, 1.06f, -1.35f, 0.56f)
            lineToRelative(-1.49f, -1.49f)
            curveToRelative(-2.2f, 2.04f, -5.1f, 3.23f, -8.16f, 3.23f)
            curveTo(6.07f, 24f, 0.87f, 19.58f, 0.03f, 13.71f)
            curveToRelative(-0.12f, -0.82f, 0.45f, -1.58f, 1.27f, -1.7f)
            curveToRelative(0.82f, -0.12f, 1.58f, 0.45f, 1.7f, 1.27f)
            curveToRelative(0.63f, 4.4f, 4.55f, 7.71f, 9f, 7.71f)
            curveToRelative(2.25f, 0f, 4.4f, -0.86f, 6.04f, -2.34f)
            lineToRelative(-1.31f, -1.31f)
            curveToRelative(-0.5f, -0.5f, -0.14f, -1.35f, 0.56f, -1.35f)
            horizontalLineToRelative(4.52f)
            curveToRelative(0.66f, 0f, 1.19f, 0.53f, 1.19f, 1.19f)
            close()
            moveTo(1f, 6.81f)
            verticalLineTo(2.29f)
            curveToRelative(0f, -0.7f, 0.85f, -1.06f, 1.35f, -0.56f)
            lineToRelative(1.49f, 1.49f)
            curveTo(6.04f, 1.18f, 8.95f, 0f, 12f, 0f)
            curveToRelative(5.93f, 0f, 11.13f, 4.42f, 11.97f, 10.29f)
            curveToRelative(0.12f, 0.82f, -0.45f, 1.58f, -1.27f, 1.7f)
            curveToRelative(-0.82f, 0.12f, -1.58f, -0.45f, -1.7f, -1.27f)
            curveToRelative(-0.63f, -4.4f, -4.55f, -7.71f, -9f, -7.71f)
            curveToRelative(-2.25f, 0f, -4.4f, 0.86f, -6.04f, 2.34f)
            lineToRelative(1.31f, 1.31f)
            curveToRelative(0.5f, 0.5f, 0.14f, 1.35f, -0.56f, 1.35f)
            horizontalLineTo(2.19f)
            curveToRelative(-0.66f, 0f, -1.19f, -0.53f, -1.19f, -1.19f)
            close()
        }
    }.also { _RotateReverse = it }
