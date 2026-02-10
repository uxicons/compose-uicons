package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Rs.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.73f, 5.57f)
                lineToRelative(1.6f, -5.57f)
                lineTo(7.67f, 0f)
                lineToRelative(1.6f, 5.57f)
                lineToRelative(-3.92f, 12.43f)
                lineToRelative(6.65f, 6.04f)
                lineToRelative(6.65f, -6.04f)
                lineToRelative(-3.92f, -12.43f)
                close()
                moveTo(13.67f, 2f)
                lineToRelative(-0.57f, 2f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(-0.57f, -2f)
                horizontalLineToRelative(3.35f)
                close()
                moveTo(7.65f, 17.38f)
                lineToRelative(3.59f, -11.38f)
                horizontalLineToRelative(1.53f)
                lineToRelative(3.59f, 11.38f)
                lineToRelative(-4.35f, 3.96f)
                lineToRelative(-4.35f, -3.96f)
                close()
            }
        }.also { _Tie = it}
