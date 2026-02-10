package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlag: ImageVector? = null

val Icons.Bs.BrazilFlag: ImageVector
    get() = _BrazilFlag ?: UXIcon(name = "BrazilFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(3.5f, 12f)
                lineToRelative(8.5f, 6.5f)
                lineToRelative(8.5f, -6.5f)
                lineTo(12f, 5.5f)
                lineTo(3.5f, 12f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
                curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
                curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
                curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _BrazilFlag = it}
