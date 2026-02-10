package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Sr.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.17f, 6f)
                lineToRelative(3.13f, 11.03f)
                curveToRelative(0.41f, 1.23f, 0.06f, 2.58f, -0.9f, 3.44f)
                lineToRelative(-3.49f, 3.17f)
                curveToRelative(-0.52f, 0.47f, -1.31f, 0.47f, -1.83f, 0f)
                lineToRelative(-3.49f, -3.17f)
                curveToRelative(-0.95f, -0.87f, -1.31f, -2.22f, -0.9f, -3.44f)
                lineToRelative(3.13f, -11.03f)
                horizontalLineToRelative(4.35f)
                close()
                moveTo(9.71f, 4f)
                horizontalLineToRelative(4.57f)
                lineToRelative(0.67f, -2.33f)
                curveToRelative(0.27f, -0.82f, -0.34f, -1.67f, -1.21f, -1.67f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(-0.86f, 0f, -1.48f, 0.85f, -1.21f, 1.67f)
                lineToRelative(0.67f, 2.33f)
                close()
            }
        }.also { _Tie = it}
