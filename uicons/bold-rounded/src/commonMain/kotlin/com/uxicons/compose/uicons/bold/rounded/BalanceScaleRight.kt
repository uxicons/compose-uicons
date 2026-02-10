package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BalanceScaleRight: ImageVector? = null

val Icons.Br.BalanceScaleRight: ImageVector
    get() = _BalanceScaleRight ?: UXIcon(name = "BalanceScaleRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 14.5f)
            curveToRelative(0.22f, 6.25f, 9.44f, 5.76f, 8.94f, -0.43f)
            lineToRelative(-2.48f, -8.27f)
            curveToRelative(-0.48f, -1.6f, -1.79f, -2.79f, -3.4f, -3.11f)
            lineToRelative(-4.55f, -1.0f)
            verticalLineToRelative(-0.18f)
            curveToRelative(0.02f, -1.69f, -2.44f, -2.05f, -2.92f, -0.46f)
            lineTo(6.07f, 0.06f)
            curveToRelative(-1.53f, -0.3f, -3.04f, 0.59f, -3.49f, 2.12f)
            lineTo(0.06f, 11.09f)
            curveToRelative(-0.37f, 2.6f, 1.86f, 4.93f, 4.44f, 4.91f)
            curveToRelative(2.59f, 0.02f, 4.83f, -2.33f, 4.44f, -4.93f)
            lineTo(6.58f, 3.24f)
            lineToRelative(3.92f, 0.86f)
            lineTo(10.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(-5f)
            lineTo(13.5f, 4.75f)
            lineToRelative(3.94f, 0.86f)
            curveToRelative(0.09f, 0.02f, 0.18f, 0.04f, 0.27f, 0.08f)
            lineToRelative(-2.64f, 8.35f)
            curveToRelative(-0.05f, 0.15f, -0.07f, 0.3f, -0.07f, 0.45f)
            close()
            moveTo(4.45f, 6.57f)
            lineToRelative(1.33f, 4.43f)
            lineTo(3.2f, 11f)
            lineToRelative(1.25f, -4.43f)
            close()
            moveTo(20.78f, 14f)
            horizontalLineToRelative(-2.55f)
            lineToRelative(1.31f, -4.15f)
            lineToRelative(1.24f, 4.15f)
            close()
        }
    }.also { _BalanceScaleRight = it }
