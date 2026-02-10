package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSlash: ImageVector? = null

val Icons.Ss.BellSlash: ImageVector
    get() = _BellSlash ?: UXIcon(name = "BellSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.68f, 20f)
                lineToRelative(0.93f, 0.93f)
                curveToRelative(-0.76f, 1.8f, -2.54f, 3.07f, -4.61f, 3.07f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.72f, -4.9f, -4f)
                horizontalLineToRelative(8.58f)
                close()
                moveTo(3.23f, 7.55f)
                lineToRelative(-2.03f, 6.56f)
                curveToRelative(-0.6f, 1.93f, 0.85f, 3.89f, 2.87f, 3.89f)
                horizontalLineToRelative(9.61f)
                lineTo(3.23f, 7.55f)
                close()
                moveTo(19.41f, 18f)
                horizontalLineToRelative(0.31f)
                curveToRelative(2.08f, 0f, 3.53f, -2.06f, 2.82f, -4.02f)
                lineToRelative(-2.85f, -7.88f)
                curveTo(18.69f, 2.49f, 15.41f, 0f, 11.68f, 0f)
                curveToRelative(-2.75f, 0f, -5.25f, 1.35f, -6.77f, 3.49f)
                lineTo(1.43f, 0.02f)
                lineTo(0.02f, 1.43f)
                lineToRelative(22.55f, 22.55f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.57f, -4.57f)
                close()
            }
        }.also { _BellSlash = it}
