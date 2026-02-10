package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Sr.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                lineTo(8f, 15f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(16f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(5f)
                close()
                moveTo(6f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8f, 22f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(8f, 17f)
                verticalLineToRelative(5f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(-1f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                horizontalLineToRelative(6f)
                lineTo(6f, 2f)
                close()
                moveTo(6f, 17f)
                lineTo(0f, 17f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _TableList = it}
