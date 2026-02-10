package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Detergent: ImageVector? = null

val Icons.Br.Detergent: ImageVector
    get() = _Detergent ?: UXIcon(name = "Detergent") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(2.37f)
            curveToRelative(-2.38f, 1.26f, -4f, 3.76f, -4f, 6.63f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(22f, 9f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(19f, 9f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-7f)
            horizontalLineToRelative(1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
            moveTo(9f, 5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(16.5f, 21f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(4.45f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5f, 13f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(0.95f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            close()
        }
    }.also { _Detergent = it }
