package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Ss.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(0f, 5.24f, 0f, 8f)
                verticalLineToRelative(13f)
                lineTo(10f, 21f)
                lineTo(10f, 8f)
                close()
                moveTo(7f, 11f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2f)
                lineTo(7f, 9f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 3f)
                lineTo(9.89f, 3f)
                curveToRelative(1.3f, 1.27f, 2.11f, 3.04f, 2.11f, 5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(12f)
                lineTo(24f, 9f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(21f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _Mailbox = it}
