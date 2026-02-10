package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePen: ImageVector? = null

val Icons.Br.SquarePen: ImageVector
    get() = _SquarePen ?: UXIcon(name = "SquarePen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(11.73f, 9.19f)
            lineTo(14.81f, 12.27f)
            lineTo(10.4f, 16.68f)
            curveToRelative(-0.84f, 0.84f, -1.99f, 1.32f, -3.18f, 1.32f)
            horizontalLineToRelative(-0.72f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-0.72f)
            curveToRelative(0f, -1.19f, 0.47f, -2.34f, 1.32f, -3.18f)
            close()
            moveTo(17.86f, 6.14f)
            curveToRelative(0.85f, 0.85f, 0.85f, 2.23f, 0f, 3.09f)
            lineToRelative(-1.01f, 1.01f)
            lineToRelative(-3.09f, -3.09f)
            lineToRelative(1.01f, -1.01f)
            curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
            close()
        }
    }.also { _SquarePen = it }
