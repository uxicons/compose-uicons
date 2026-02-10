package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendBack: ImageVector? = null

val Icons.Ts.SendBack: ImageVector
    get() = _SendBack ?: UXIcon(name = "SendBack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 13f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-4.3f)
                curveToRelative(0f, -1.49f, -1.21f, -2.7f, -2.7f, -2.7f)
                horizontalLineToRelative(-4.3f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                lineTo(1f, 10f)
                lineTo(1f, 2.5f)
                close()
                moveTo(13f, 15.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4.3f)
                curveToRelative(0.94f, 0f, 1.7f, 0.76f, 1.7f, 1.7f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _SendBack = it}
