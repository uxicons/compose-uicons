package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Bs.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.51f, 6.28f)
                lineToRelative(2.07f, -6.28f)
                lineTo(6.43f, 0f)
                lineToRelative(2.07f, 6.28f)
                lineToRelative(-3.73f, 11.18f)
                lineToRelative(7.23f, 6.58f)
                lineToRelative(7.23f, -6.58f)
                lineToRelative(-3.73f, -11.18f)
                close()
                moveTo(13.43f, 3f)
                lineToRelative(-0.66f, 2f)
                horizontalLineToRelative(-1.54f)
                lineToRelative(-0.66f, -2f)
                horizontalLineToRelative(2.85f)
                close()
                moveTo(8.23f, 16.55f)
                lineToRelative(2.85f, -8.55f)
                horizontalLineToRelative(1.84f)
                lineToRelative(2.85f, 8.55f)
                lineToRelative(-3.77f, 3.42f)
                lineToRelative(-3.77f, -3.42f)
                close()
            }
        }.also { _Tie = it}
