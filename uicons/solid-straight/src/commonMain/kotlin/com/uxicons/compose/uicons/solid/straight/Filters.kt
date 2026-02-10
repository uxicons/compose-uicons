package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filters: ImageVector? = null

val Icons.Ss.Filters: ImageVector
    get() = _Filters ?: UXIcon(name = "Filters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 20f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-3.09f)
                lineTo(4f, 5.41f)
                lineTo(4f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2.41f)
                lineToRelative(-7f, 7f)
                verticalLineToRelative(7.59f)
                close()
                moveTo(9f, 13.24f)
                lineTo(2f, 6.24f)
                verticalLineToRelative(-2.06f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(2.41f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(3.09f)
                lineToRelative(6f, 4.5f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-4f, -3f)
                verticalLineToRelative(-3.26f)
                close()
            }
        }.also { _Filters = it}
