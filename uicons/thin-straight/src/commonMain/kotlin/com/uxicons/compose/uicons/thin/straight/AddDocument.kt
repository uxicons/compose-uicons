package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddDocument: ImageVector? = null

val Icons.Ts.AddDocument: ImageVector
    get() = _AddDocument ?: UXIcon(name = "AddDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(12.5f, 14.5f)
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
            }
        }.also { _AddDocument = it}
