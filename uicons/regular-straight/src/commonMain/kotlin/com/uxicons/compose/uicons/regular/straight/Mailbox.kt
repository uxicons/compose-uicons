package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Rs.Mailbox: ImageVector
    get() = _Mailbox ?: UXIcon(name = "Mailbox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                lineTo(6f, 3f)
                curveTo(2.69f, 3f, 0f, 5.69f, 0f, 9f)
                verticalLineToRelative(12f)
                lineTo(24f, 21f)
                lineTo(24f, 9f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                close()
                moveTo(10f, 19f)
                lineTo(2f, 19f)
                lineTo(2f, 9f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(10f)
                close()
                moveTo(22f, 19f)
                lineTo(12f, 19f)
                lineTo(12f, 9f)
                curveToRelative(0f, -1.53f, -0.58f, -2.94f, -1.53f, -4f)
                horizontalLineToRelative(7.53f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(10f)
                close()
                moveTo(14f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(4f, 11f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Mailbox = it}
