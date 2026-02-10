package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Bs.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 4.56f)
                lineToRelative(-4.52f, -4.52f)
                lineToRelative(-14.24f, 12.09f)
                lineToRelative(-5.17f, 2.67f)
                verticalLineToRelative(1.99f)
                arcToRelative(7.19f, 7.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.18f, 7.18f)
                horizontalLineToRelative(2.0f)
                lineToRelative(2.59f, -5.05f)
                close()
                moveTo(19.88f, 4.73f)
                lineTo(14.61f, 10.96f)
                lineTo(13.05f, 9.4f)
                lineTo(19.27f, 4.12f)
                close()
                moveTo(7.38f, 20.97f)
                horizontalLineToRelative(-0.17f)
                arcToRelative(4.18f, 4.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.18f, -4.18f)
                verticalLineToRelative(-0.16f)
                lineToRelative(3.47f, -1.79f)
                lineToRelative(2.66f, 2.67f)
                close()
            }
        }.also { _MakeupBrush = it}
