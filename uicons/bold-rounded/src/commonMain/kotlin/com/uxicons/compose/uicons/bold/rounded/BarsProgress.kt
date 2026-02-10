package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsProgress: ImageVector? = null

val Icons.Br.BarsProgress: ImageVector
    get() = _BarsProgress ?: UXIcon(name = "BarsProgress") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 11f)
            horizontalLineToRelative(15f)
            curveToRelative(5.93f, -0.16f, 5.93f, -8.85f, 0f, -9f)
            lineTo(4.5f, 2f)
            curveToRelative(-5.93f, 0.16f, -5.93f, 8.85f, 0f, 9f)
            close()
            moveTo(21f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(4.5f, 5f)
            lineTo(14f, 5f)
            verticalLineToRelative(3f)
            lineTo(4.5f, 8f)
            curveToRelative(-1.97f, -0.04f, -1.97f, -2.96f, 0f, -3f)
            close()
            moveTo(19.5f, 13f)
            lineTo(4.5f, 13f)
            curveToRelative(-5.93f, 0.16f, -5.93f, 8.85f, 0f, 9f)
            horizontalLineToRelative(15f)
            curveToRelative(5.93f, -0.16f, 5.93f, -8.85f, 0f, -9f)
            close()
            moveTo(3f, 17.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(19.5f, 19f)
            lineTo(11f, 19f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(8.5f)
            curveToRelative(1.97f, 0.04f, 1.97f, 2.96f, 0f, 3f)
            close()
        }
    }.also { _BarsProgress = it }
