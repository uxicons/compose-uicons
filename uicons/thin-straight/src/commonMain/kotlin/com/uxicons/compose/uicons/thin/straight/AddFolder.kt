package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddFolder: ImageVector? = null

val Icons.Ts.AddFolder: ImageVector
    get() = _AddFolder ?: UXIcon(name = "AddFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 14.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(17.5f)
                lineTo(0f, 23f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-9.62f)
                lineToRelative(-4f, -2f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 22f)
                verticalLineToRelative(-14f)
                lineTo(1f, 8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _AddFolder = it}
