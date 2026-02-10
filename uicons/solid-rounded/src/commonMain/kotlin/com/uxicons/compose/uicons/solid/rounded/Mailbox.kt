package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Sr.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                lineTo(9.88f, 3f)
                curveToRelative(1.34f, 1.31f, 2.12f, 3.12f, 2.12f, 5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.13f, -0.39f, 2.16f, -1.03f, 3f)
                horizontalLineToRelative(10.03f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 9f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 12f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -2.0f, 0f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(4.5f, 3.02f)
                curveTo(1.9f, 3.28f, 0f, 5.61f, 0f, 8.22f)
                verticalLineToRelative(9.78f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(7f, 21f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                lineTo(10f, 8f)
                curveToRelative(0f, -2.92f, -2.52f, -5.27f, -5.5f, -4.98f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.31f, -0.01f, -1.31f, -1.99f, 0f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.31f, 0.01f, 1.31f, 1.99f, 0f, 2f)
                close()
            }
        }.also { _Mailbox = it}
