package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Ss.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.43f, 9.84f)
                lineToRelative(-2.12f, 1.82f)
                lineToRelative(4.05f, 4.05f)
                lineToRelative(1.82f, -2.12f)
                close()
                moveTo(15.48f, 12.07f)
                lineTo(23.94f, 2.21f)
                lineTo(21.79f, 0.06f)
                lineTo(11.95f, 8.53f)
                close()
                moveTo(8.05f, 24f)
                horizontalLineToRelative(-1.65f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -6.4f)
                verticalLineToRelative(-1.63f)
                lineToRelative(6.62f, -3.35f)
                lineToRelative(4.73f, 4.73f)
                close()
            }
        }.also { _MakeupBrush = it}
