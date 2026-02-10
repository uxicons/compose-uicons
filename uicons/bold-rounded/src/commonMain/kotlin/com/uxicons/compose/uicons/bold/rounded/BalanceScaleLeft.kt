package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleLeft: ImageVector? = null

val Icons.Br.BalanceScaleLeft: ImageVector
    get() = _BalanceScaleLeft ?: UXIcon(name = "BalanceScaleLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 11.5f)
            curveToRelative(0.22f, 6.23f, 9.4f, 5.77f, 8.94f, -0.41f)
            lineToRelative(-2.53f, -8.94f)
            curveToRelative(-0.45f, -1.5f, -1.95f, -2.4f, -3.51f, -2.09f)
            lineToRelative(-4.48f, 0.98f)
            curveToRelative(-0.48f, -1.6f, -2.94f, -1.24f, -2.92f, 0.46f)
            verticalLineToRelative(0.18f)
            lineToRelative(-4.53f, 0.99f)
            curveToRelative(-1.64f, 0.33f, -2.95f, 1.52f, -3.43f, 3.12f)
            lineTo(0.06f, 14.07f)
            curveToRelative(-0.4f, 2.6f, 1.85f, 4.95f, 4.44f, 4.93f)
            curveToRelative(2.59f, 0.02f, 4.85f, -2.35f, 4.43f, -4.95f)
            lineTo(6.29f, 5.7f)
            curveToRelative(0.09f, -0.04f, 0.19f, -0.07f, 0.29f, -0.09f)
            lineToRelative(3.91f, -0.86f)
            lineTo(10.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(-5f)
            lineTo(13.5f, 4.1f)
            lineToRelative(3.92f, -0.86f)
            lineToRelative(-2.36f, 7.83f)
            curveToRelative(-0.04f, 0.14f, -0.06f, 0.29f, -0.06f, 0.43f)
            close()
            moveTo(4.46f, 9.85f)
            lineToRelative(1.31f, 4.15f)
            lineTo(3.22f, 14f)
            lineToRelative(1.24f, -4.15f)
            close()
            moveTo(19.55f, 6.58f)
            lineToRelative(1.25f, 4.42f)
            horizontalLineToRelative(-2.58f)
            lineToRelative(1.33f, -4.42f)
            close()
        }
    }.also { _BalanceScaleLeft = it }
