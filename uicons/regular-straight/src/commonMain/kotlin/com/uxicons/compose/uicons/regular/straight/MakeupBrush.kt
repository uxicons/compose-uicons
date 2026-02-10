package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBrush: ImageVector? = null

val Icons.Rs.MakeupBrush: ImageVector
    get() = _MakeupBrush ?: UXIcon(name = "MakeupBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.48f)
                lineToRelative(-3.48f, -3.48f)
                lineToRelative(-15.09f, 13.17f)
                lineToRelative(-5.43f, 2.8f)
                verticalLineToRelative(1.63f)
                arcToRelative(6.41f, 6.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 6.4f)
                horizontalLineToRelative(1.65f)
                lineToRelative(2.79f, -5.44f)
                close()
                moveTo(9.95f, 16.54f)
                lineTo(7.46f, 14.05f)
                lineTo(9.26f, 12.48f)
                lineTo(11.52f, 14.73f)
                close()
                moveTo(21.27f, 3.57f)
                lineTo(12.84f, 13.22f)
                lineTo(10.78f, 11.16f)
                lineTo(20.43f, 2.73f)
                close()
                moveTo(6.82f, 22f)
                horizontalLineToRelative(-0.42f)
                arcToRelative(4.41f, 4.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.4f, -4.4f)
                verticalLineToRelative(-0.41f)
                lineToRelative(3.81f, -1.96f)
                lineToRelative(2.97f, 2.97f)
                close()
            }
        }.also { _MakeupBrush = it}
