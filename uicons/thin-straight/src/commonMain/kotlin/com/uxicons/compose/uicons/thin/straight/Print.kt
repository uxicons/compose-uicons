package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Ts.Print: ImageVector
    get() = _Print ?: UXIcon(name = "Print") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                lineTo(5f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(24f, 8.5f)
                close()
                moveTo(6f, 1f)
                horizontalLineToRelative(12f)
                lineTo(18f, 6f)
                lineTo(6f, 6f)
                lineTo(6f, 1f)
                close()
                moveTo(18f, 23f)
                lineTo(6f, 23f)
                lineTo(6f, 15f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                lineTo(5f, 14f)
                verticalLineToRelative(6f)
                lineTo(1f, 20f)
                lineTo(1f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(15f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _Print = it}
