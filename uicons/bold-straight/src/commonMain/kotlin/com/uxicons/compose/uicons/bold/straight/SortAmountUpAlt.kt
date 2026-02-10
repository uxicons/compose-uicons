package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUpAlt: ImageVector? = null

val Icons.Bs.SortAmountUpAlt: ImageVector
    get() = _SortAmountUpAlt ?: UXIcon(name = "SortAmountUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.16f, 5f)
                lineTo(6.57f, 0.41f)
                curveToRelative(-0.54f, -0.55f, -1.43f, -0.55f, -1.97f, 0f)
                horizontalLineToRelative(0f)
                lineTo(0f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(4.16f)
                close()
            }
        }.also { _SortAmountUpAlt = it}
