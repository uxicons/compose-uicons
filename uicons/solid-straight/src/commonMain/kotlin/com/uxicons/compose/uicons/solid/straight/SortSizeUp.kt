package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeUp: ImageVector? = null

val Icons.Ss.SortSizeUp: ImageVector
    get() = _SortSizeUp ?: UXIcon(name = "SortSizeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.41f, 0.59f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.5f, -3.5f)
                lineTo(7f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 3f)
                lineTo(1.5f, 6.5f)
                lineTo(0.09f, 5.09f)
                lineTo(4.59f, 0.59f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                close()
                moveTo(16f, 23f)
                horizontalLineToRelative(8f)
                lineTo(24f, 15f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                close()
                moveTo(14f, 1f)
                lineTo(14f, 11f)
                horizontalLineToRelative(10f)
                lineTo(24f, 1f)
                lineTo(14f, 1f)
                close()
            }
        }.also { _SortSizeUp = it}
