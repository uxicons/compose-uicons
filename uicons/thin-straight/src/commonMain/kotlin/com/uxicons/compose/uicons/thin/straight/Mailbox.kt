package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mailbox: ImageVector? = null

val Icons.Ts.Mailbox: ImageVector
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
                moveTo(11f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 9f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(11f)
                close()
                moveTo(23f, 20f)
                lineTo(12f, 20f)
                lineTo(12f, 9f)
                curveToRelative(0f, -2.08f, -1.07f, -3.92f, -2.69f, -5f)
                horizontalLineToRelative(8.69f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(11f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                lineTo(4f, 11f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Mailbox = it}
