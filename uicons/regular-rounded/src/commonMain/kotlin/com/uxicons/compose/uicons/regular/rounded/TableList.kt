package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TableList: ImageVector? = null

val Icons.Rr.TableList: ImageVector
    get() = _TableList ?: UXIcon(name = "TableList") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(2f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                lineTo(2f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _TableList = it}
