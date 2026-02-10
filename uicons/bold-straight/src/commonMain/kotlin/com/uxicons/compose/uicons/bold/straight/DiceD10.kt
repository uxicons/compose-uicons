package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Bs.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 0.98f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.79f, 0f)
                lineTo(0.01f, 13.1f)
                lineToRelative(9.6f, 9.91f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, -0.02f)
                lineTo(23.99f, 13.1f)
                close()
                moveTo(18.24f, 10.67f)
                lineTo(14.47f, 9.26f)
                lineToRelative(-1.79f, -5.63f)
                close()
                moveTo(11.32f, 3.63f)
                lineTo(9.53f, 9.26f)
                lineTo(5.76f, 10.67f)
                close()
                moveTo(5.15f, 14.1f)
                lineToRelative(3.64f, -1.36f)
                lineToRelative(1.71f, 1.42f)
                verticalLineToRelative(5.46f)
                close()
                moveTo(13.5f, 19.64f)
                lineTo(13.5f, 14.17f)
                lineToRelative(1.71f, -1.43f)
                lineToRelative(3.64f, 1.36f)
                close()
            }
        }.also { _DiceD10 = it}
