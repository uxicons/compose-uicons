package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Ss.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                lineTo(0f, 15f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 9f)
                lineTo(8f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-13f)
                verticalLineToRelative(5f)
                close()
                moveTo(6f, 7f)
                lineTo(6f, 2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(8f, 17f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-5f)
                lineTo(8f, 17f)
                close()
                moveTo(6f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                close()
            }
        }.also { _TableList = it}
