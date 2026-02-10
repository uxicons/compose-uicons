package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageAlert: ImageVector? = null

val Icons.Rs.MessageAlert: ImageVector
    get() = _MessageAlert ?: UXIcon(name = "MessageAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                horizontalLineToRelative(5.93f)
                lineToRelative(-1.17f, 2f)
                lineTo(7f, 17f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.27f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.1f)
                lineToRelative(1.17f, -2f)
                close()
                moveTo(17f, 12f)
                lineToRelative(7f, 12f)
                lineTo(10f, 24f)
                lineToRelative(7f, -12f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 1.23f, -0.23f, 2.41f, -0.64f, 3.5f)
                lineToRelative(1.24f, 2.12f)
                curveToRelative(0.89f, -1.68f, 1.41f, -3.59f, 1.41f, -5.62f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                lineTo(7.68f, 24f)
                lineToRelative(1.17f, -2f)
                lineTo(2f, 22f)
                close()
                moveTo(7f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                lineTo(7f, 7f)
                close()
            }
        }.also { _MessageAlert = it}
