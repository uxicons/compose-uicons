package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B: ImageVector? = null

val Icons.Br.B: ImageVector
    get() = _B ?: UXIcon(name = "B") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 24f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(5f)
            curveToRelative(5.32f, -0.12f, 8.47f, 6.44f, 5.12f, 10.51f)
            curveToRelative(7.02f, 2.85f, 5.07f, 13.44f, -2.62f, 13.49f)
            close()
            moveTo(5f, 13f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(5.28f, -0.14f, 5.27f, -7.86f, 0f, -8f)
            lineTo(5f, 13f)
            close()
            moveTo(5f, 10f)
            horizontalLineToRelative(7.5f)
            curveToRelative(4.62f, -0.12f, 4.61f, -6.88f, 0f, -7f)
            lineTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(4.5f)
            close()
        }
    }.also { _B = it }
