package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Br.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 9.06f)
            lineToRelative(-12.59f, 12.62f)
            curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-1.21f, -0.0f, -2.34f, -0.48f, -3.19f, -1.33f)
            lineTo(0.45f, 17.57f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, -0.01f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.01f)
            lineToRelative(4.16f, 4.11f)
            curveToRelative(0.29f, 0.29f, 0.67f, 0.45f, 1.07f, 0.45f)
            horizontalLineToRelative(0.0f)
            curveToRelative(0.4f, 0f, 0.78f, -0.16f, 1.06f, -0.44f)
            lineToRelative(12.59f, -12.62f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.59f, 2.12f, -0.0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.53f, 0.0f, 2.12f)
            close()
            moveTo(5.02f, 11.77f)
            curveToRelative(0.79f, 0.79f, 1.83f, 1.23f, 2.95f, 1.23f)
            horizontalLineToRelative(0.01f)
            curveToRelative(1.11f, 0f, 2.16f, -0.43f, 2.95f, -1.23f)
            lineTo(19.07f, 3.56f)
            curveToRelative(0.58f, -0.59f, 0.58f, -1.54f, -0.01f, -2.12f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.58f, -2.12f, 0.01f)
            lineToRelative(-8.13f, 8.21f)
            curveToRelative(-0.22f, 0.22f, -0.51f, 0.34f, -0.82f, 0.34f)
            horizontalLineToRelative(-0.0f)
            curveToRelative(-0.31f, 0f, -0.61f, -0.12f, -0.81f, -0.33f)
            lineToRelative(-3.59f, -3.71f)
            curveToRelative(-0.58f, -0.6f, -1.52f, -0.61f, -2.12f, -0.04f)
            curveToRelative(-0.59f, 0.58f, -0.61f, 1.52f, -0.04f, 2.12f)
            lineToRelative(3.6f, 3.72f)
            close()
        }
    }.also { _CheckDouble = it }
