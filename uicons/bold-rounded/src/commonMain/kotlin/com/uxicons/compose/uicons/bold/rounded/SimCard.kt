package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCard: ImageVector? = null

val Icons.Br.SimCard: ImageVector
    get() = _SimCard ?: UXIcon(name = "SimCard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.1f, 3.98f)
            lineToRelative(-2.07f, -2.07f)
            curveToRelative(-1.23f, -1.23f, -2.86f, -1.9f, -4.6f, -1.9f)
            horizontalLineToRelative(-5.93f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-9.93f)
            curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.93f)
            curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
            lineToRelative(2.07f, 2.07f)
            curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
            verticalLineToRelative(9.93f)
            close()
            moveTo(7f, 16f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            close()
            moveTo(10f, 14f)
            horizontalLineToRelative(-3f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            verticalLineToRelative(3f)
            close()
            moveTo(14f, 16f)
            horizontalLineToRelative(3f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            verticalLineToRelative(-3f)
            close()
            moveTo(17f, 14f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
            close()
        }
    }.also { _SimCard = it }
