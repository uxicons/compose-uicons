package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Ts.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 4.5f)
                verticalLineToRelative(3.5f)
                lineTo(7f, 8f)
                lineTo(7f, 3f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5f)
                lineTo(7f, 14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(6f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(1f, 20f)
                verticalLineToRelative(-5f)
                close()
                moveTo(7f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5f)
                lineTo(7f, 20f)
                close()
            }
        }.also { _TableList = it}
