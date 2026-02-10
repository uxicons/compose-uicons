package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareDashed: ImageVector? = null

val Icons.Ts.SquareDashed: ImageVector
    get() = _SquareDashed ?: UXIcon(name = "SquareDashed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                lineTo(0f, 7f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                close()
                moveTo(1f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(1f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                lineTo(1f, 23f)
                verticalLineToRelative(-6f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                close()
                moveTo(23f, 15f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9f, 1f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(9f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _SquareDashed = it}
