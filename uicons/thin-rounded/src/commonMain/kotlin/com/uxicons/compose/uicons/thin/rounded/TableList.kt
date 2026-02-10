package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Tr.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(1f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(1f, 14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(5f)
                lineTo(7f, 14f)
                verticalLineToRelative(-5f)
                close()
                moveTo(23f, 6.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 8f)
                lineTo(7f, 3f)
                horizontalLineToRelative(12.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1f, 16.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(19.5f, 20f)
                lineTo(7f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _TableList = it}
