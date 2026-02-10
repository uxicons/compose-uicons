package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Ss.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 22f)
                curveToRelative(0f, -6.08f, 4.92f, -11f, 11f, -11f)
                curveToRelative(0f, 6.08f, -4.92f, 11f, -11f, 11f)
                moveToRelative(-2f, 0f)
                curveToRelative(0f, -6.08f, -4.92f, -11f, -11f, -11f)
                curveToRelative(0f, 6.08f, 4.92f, 11f, 11f, 11f)
                moveToRelative(1f, -5f)
                curveToRelative(1.03f, -2.45f, 2.78f, -4.53f, 5.0f, -5.95f)
                curveToRelative(-0.21f, -3.28f, -1.72f, -6.53f, -4.29f, -9.09f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-2.56f, 2.56f, -4.08f, 5.81f, -4.29f, 9.09f)
                curveToRelative(2.21f, 1.42f, 3.97f, 3.5f, 5.0f, 5.95f)
                close()
            }
        }.also { _Massage = it}
