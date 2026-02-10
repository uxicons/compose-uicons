package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Bs.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 2f)
                lineTo(6.5f, 2f)
                curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 22f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(3f, 8.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                lineTo(3f, 19f)
                lineTo(3f, 8.5f)
                close()
                moveTo(21f, 19f)
                lineTo(13f, 19f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.29f, -0.38f, -2.49f, -1.02f, -3.5f)
                horizontalLineToRelative(5.53f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Mailbox = it}
