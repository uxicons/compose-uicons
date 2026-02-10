package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LastSquare: ImageVector? = null

val Icons.Ts.LastSquare: ImageVector
    get() = _LastSquare ?: UXIcon(name = "LastSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(23f, 23f)
                close()
                moveTo(15f, 11.14f)
                lineTo(7f, 6.64f)
                verticalLineToRelative(10.71f)
                lineToRelative(8f, -4.5f)
                verticalLineToRelative(4.14f)
                horizontalLineToRelative(3f)
                lineTo(18f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.14f)
                close()
                moveTo(8f, 15.65f)
                verticalLineToRelative(-7.29f)
                lineToRelative(6.48f, 3.65f)
                lineToRelative(-6.48f, 3.65f)
                close()
                moveTo(17f, 8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 8f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _LastSquare = it}
