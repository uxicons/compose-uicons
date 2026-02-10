package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareZ: ImageVector? = null

val Icons.Ts.SquareZ: ImageVector
    get() = _SquareZ ?: UXIcon(name = "SquareZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.17f, 18.23f)
                curveToRelative(-0.19f, 0.19f, -0.12f, 0.42f, -0.09f, 0.49f)
                curveToRelative(0.03f, 0.07f, 0.14f, 0.28f, 0.42f, 0.28f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(1f)
                lineTo(6.5f, 20.0f)
                curveToRelative(-0.6f, 0f, -1.12f, -0.34f, -1.35f, -0.9f)
                curveToRelative(-0.23f, -0.56f, -0.11f, -1.16f, 0.32f, -1.59f)
                lineToRelative(12.4f, -11.74f)
                curveToRelative(0.19f, -0.19f, 0.12f, -0.42f, 0.09f, -0.49f)
                curveToRelative(-0.03f, -0.07f, -0.14f, -0.28f, -0.42f, -0.28f)
                lineTo(5f, 5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12.54f)
                curveToRelative(0.6f, 0f, 1.12f, 0.34f, 1.35f, 0.9f)
                curveToRelative(0.23f, 0.56f, 0.11f, 1.16f, -0.32f, 1.59f)
                lineToRelative(-12.4f, 11.74f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(21.5f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 2.5f)
                close()
            }
        }.also { _SquareZ = it}
