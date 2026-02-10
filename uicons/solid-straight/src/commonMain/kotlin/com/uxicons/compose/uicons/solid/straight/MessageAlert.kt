package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageAlert: ImageVector? = null

val Icons.Ss.MessageAlert: ImageVector
    get() = _MessageAlert ?: UXIcon(name = "MessageAlert") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.93f)
                lineToRelative(1.17f, -2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(15.27f)
                lineToRelative(1.17f, -2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1.03f)
                lineToRelative(5.59f, 9.59f)
                curveToRelative(0.89f, -1.68f, 1.41f, -3.59f, 1.41f, -5.62f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                horizontalLineTo(7.68f)
                lineToRelative(4.08f, -7f)
                horizontalLineTo(7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                horizontalLineToRelative(14f)
                lineToRelative(-7f, -12f)
                lineToRelative(-7f, 12f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _MessageAlert = it}
