package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minus: ImageVector? = null

val Icons.Rc.Minus: ImageVector
    get() = _Minus ?: UXIcon(name = "Minus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 13.47f)
                curveToRelative(-0.04f, -0.01f, -3.89f, -0.97f, -9.75f, -0.97f)
                curveToRelative(-5.9f, 0f, -9.71f, 0.96f, -9.75f, 0.97f)
                curveToRelative(-0.53f, 0.14f, -1.08f, -0.18f, -1.22f, -0.72f)
                curveToRelative(-0.14f, -0.54f, 0.18f, -1.08f, 0.72f, -1.22f)
                curveToRelative(0.16f, -0.04f, 4.08f, -1.03f, 10.25f, -1.03f)
                curveToRelative(6.13f, 0f, 10.08f, 0.99f, 10.25f, 1.03f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.22f)
                curveToRelative(-0.12f, 0.45f, -0.58f, 0.87f, -1.22f, 0.72f)
                close()
            }
        }.also { _Minus = it}
