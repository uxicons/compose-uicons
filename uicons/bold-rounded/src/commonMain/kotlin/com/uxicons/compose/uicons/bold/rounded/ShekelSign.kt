package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Br.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(1f, 3.5f)
            curveTo(1f, 1.57f, 2.57f, 0f, 4.5f, 0f)
            horizontalLineToRelative(4f)
            curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
            verticalLineToRelative(8f)
            curveToRelative(-0.03f, 1.97f, -2.97f, 1.97f, -3f, 0f)
            lineTo(14f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(4.5f, 3f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
            lineTo(4f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(14.5f, 24f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            lineTo(7f, 7.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(4f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(20f, 1.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            lineTo(23f, 15.5f)
            curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
            close()
        }
    }.also { _ShekelSign = it }
