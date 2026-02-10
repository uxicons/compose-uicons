package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUpAlt: ImageVector? = null

val Icons.Ss.SortAmountUpAlt: ImageVector
    get() = _SortAmountUpAlt ?: UXIcon(name = "SortAmountUpAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 5.5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(6.41f, 0.59f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, 0.21f, -1.41f, 0.59f)
                lineTo(0.09f, 4.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.5f, -2.5f)
                lineTo(4f, 24f)
                horizontalLineToRelative(2f)
                lineTo(6f, 3f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(2f)
                lineTo(10f, 9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                lineTo(10f, 12f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                lineTo(10f, 17f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SortAmountUpAlt = it}
