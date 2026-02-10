package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountDown: ImageVector? = null

val Icons.Bs.SortAmountDown: ImageVector
    get() = _SortAmountDown ?: UXIcon(name = "SortAmountDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(19f)
                horizontalLineTo(0f)
                lineToRelative(4.6f, 4.59f)
                curveToRelative(0.54f, 0.55f, 1.43f, 0.55f, 1.97f, 0f)
                horizontalLineToRelative(0f)
                lineToRelative(4.59f, -4.59f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                close()
            }
        }.also { _SortAmountDown = it}
