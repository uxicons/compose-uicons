package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RubleSign: ImageVector? = null

val Icons.Br.RubleSign: ImageVector
    get() = _RubleSign ?: UXIcon(name = "RubleSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 15f)
            curveToRelative(9.93f, -0.35f, 9.92f, -14.65f, 0f, -15f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(6.5f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(6.5f)
            close()
            moveTo(8f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(5.93f, 0.16f, 5.93f, 8.85f, 0f, 9f)
            horizontalLineToRelative(-6.5f)
            verticalLineTo(5.5f)
            close()
        }
    }.also { _RubleSign = it }
