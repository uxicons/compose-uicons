package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Br.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 2f)
            lineTo(6.5f, 2f)
            curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            lineTo(20.5f, 22f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            lineTo(24f, 8.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(3f, 18.5f)
            lineTo(3f, 8.5f)
            curveToRelative(0.12f, -4.62f, 6.88f, -4.61f, 7f, 0f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(3.5f, 19f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-7.54f)
            curveToRelative(0.02f, -0.16f, 0.04f, -0.33f, 0.04f, -0.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.29f, -0.38f, -2.49f, -1.02f, -3.5f)
            horizontalLineToRelative(5.53f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(10f)
            close()
            moveTo(7.56f, 9.44f)
            curveToRelative(0.58f, 0.55f, 0.58f, 1.56f, 0f, 2.12f)
            curveToRelative(-1.39f, 1.38f, -3.5f, -0.73f, -2.12f, -2.12f)
            curveToRelative(0.56f, -0.56f, 1.56f, -0.56f, 2.12f, 0f)
            close()
        }
    }.also { _Mailbox = it }
