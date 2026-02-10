package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMinus: ImageVector? = null

val Icons.Ts.FileMinus: ImageVector
    get() = _FileMinus ?: UXIcon(name = "FileMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 7.29f)
                verticalLineToRelative(16.71f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _FileMinus = it}
