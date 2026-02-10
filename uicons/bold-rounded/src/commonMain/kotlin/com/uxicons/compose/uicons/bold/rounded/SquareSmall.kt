package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareSmall: ImageVector? = null

val Icons.Br.SquareSmall: ImageVector
    get() = _SquareSmall ?: UXIcon(name = "SquareSmall") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 19f)
            horizontalLineToRelative(-4f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            close()
            moveTo(10f, 8f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.also { _SquareSmall = it }
