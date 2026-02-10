package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrame: ImageVector? = null

val Icons.Ts.WindowFrame: ImageVector
    get() = _WindowFrame ?: UXIcon(name = "WindowFrame") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 23f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(20.5f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(10f)
                close()
                moveTo(21f, 2.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-8.5f)
                lineTo(12.5f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(11f)
                lineTo(3f, 12f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(10f)
                lineTo(3f, 23f)
                verticalLineToRelative(-10f)
                close()
            }
        }.also { _WindowFrame = it}
