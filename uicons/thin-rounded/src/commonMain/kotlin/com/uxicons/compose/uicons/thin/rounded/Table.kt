package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Tr.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(1f, 7f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                lineTo(1f, 13.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(12.5f, 7f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(1.04f, 6f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
                moveTo(1f, 17.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(19.5f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Table = it}
