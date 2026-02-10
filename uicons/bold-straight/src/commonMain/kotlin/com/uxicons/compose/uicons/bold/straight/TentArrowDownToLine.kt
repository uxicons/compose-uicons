package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TentArrowDownToLine: ImageVector? = null

val Icons.Bs.TentArrowDownToLine: ImageVector
    get() = _TentArrowDownToLine ?: UXIcon(name = "TentArrowDownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.54f, 19.53f)
                lineTo(14.0f, 6.01f)
                lineTo(3.41f, 21.02f)
                lineTo(0f, 21.02f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(21.02f)
                curveToRelative(1.08f, 0f, 2.08f, -0.58f, 2.61f, -1.51f)
                curveToRelative(0.52f, -0.93f, 0.5f, -2.02f, -0.08f, -2.98f)
                close()
                moveTo(17.26f, 21.02f)
                lineToRelative(-3.26f, -4.54f)
                lineToRelative(-3.26f, 4.54f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(6.98f, -9.58f)
                lineToRelative(6.94f, 9.58f)
                horizontalLineToRelative(-3.68f)
                close()
                moveTo(0f, 4.98f)
                horizontalLineToRelative(3f)
                lineTo(3f, -0.02f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(0f, 4.98f)
                close()
            }
        }.also { _TentArrowDownToLine = it}
