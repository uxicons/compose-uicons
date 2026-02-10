package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Ts.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.37f, 4.53f)
                lineToRelative(1.3f, -4.53f)
                horizontalLineToRelative(-7.33f)
                lineToRelative(1.3f, 4.53f)
                lineToRelative(-2.68f, 14.94f)
                lineToRelative(5.04f, 4.48f)
                lineToRelative(5.04f, -4.48f)
                lineToRelative(-2.68f, -14.94f)
                close()
                moveTo(14.34f, 1f)
                lineToRelative(-0.86f, 3f)
                horizontalLineToRelative(-2.95f)
                lineToRelative(-0.86f, -3f)
                horizontalLineToRelative(4.67f)
                close()
                moveTo(8.04f, 19.09f)
                lineToRelative(2.52f, -14.1f)
                horizontalLineToRelative(2.87f)
                lineToRelative(2.52f, 14.1f)
                lineToRelative(-3.96f, 3.52f)
                lineToRelative(-3.96f, -3.52f)
                close()
            }
        }.also { _Tie = it}
