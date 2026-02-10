package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancySlash: ImageVector? = null

val Icons.Ts.PenFancySlash: ImageVector
    get() = _PenFancySlash ?: UXIcon(name = "PenFancySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.24f, 4.44f)
                curveToRelative(1.01f, -1.01f, 1.01f, -2.66f, 0f, -3.68f)
                curveToRelative(-0.98f, -0.98f, -2.69f, -0.98f, -3.68f, 0f)
                lineToRelative(-9.03f, 9.06f)
                lineTo(0.75f, 0.05f)
                lineTo(0.05f, 0.75f)
                lineToRelative(23.2f, 23.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-9.74f, -9.75f)
                lineToRelative(9.03f, -9.06f)
                close()
                moveTo(20.27f, 1.47f)
                curveToRelative(0.62f, -0.62f, 1.64f, -0.62f, 2.27f, 0f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, 0f, 2.27f)
                lineToRelative(-9.03f, 9.06f)
                lineToRelative(-2.26f, -2.26f)
                lineTo(20.27f, 1.47f)
                close()
                moveTo(2.59f, 13.34f)
                lineTo(0.11f, 23.92f)
                lineToRelative(10.58f, -2.48f)
                lineToRelative(1.52f, -6.25f)
                lineToRelative(-3.4f, -3.34f)
                lineToRelative(-6.22f, 1.5f)
                close()
                moveTo(9.86f, 20.61f)
                lineToRelative(-7.49f, 1.75f)
                lineToRelative(4.32f, -4.32f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-4.32f, 4.32f)
                lineToRelative(1.75f, -7.48f)
                lineToRelative(5.08f, -1.22f)
                lineToRelative(2.6f, 2.55f)
                lineToRelative(-1.25f, 5.11f)
                close()
            }
        }.also { _PenFancySlash = it}
