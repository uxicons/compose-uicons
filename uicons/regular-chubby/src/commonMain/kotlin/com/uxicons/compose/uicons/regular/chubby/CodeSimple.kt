package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Rc.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.47f, 19.85f)
                curveTo(3.61f, 16.81f, 1.23f, 12.67f, 1.13f, 12.49f)
                curveToRelative(-0.17f, -0.31f, -0.17f, -0.68f, 0f, -0.99f)
                curveToRelative(0.1f, -0.17f, 2.48f, -4.32f, 7.34f, -7.35f)
                curveToRelative(0.47f, -0.29f, 1.08f, -0.15f, 1.38f, 0.32f)
                curveToRelative(0.29f, 0.47f, 0.15f, 1.08f, -0.32f, 1.38f)
                curveToRelative(-3.47f, 2.17f, -5.59f, 5.02f, -6.35f, 6.15f)
                curveToRelative(0.76f, 1.13f, 2.88f, 3.98f, 6.35f, 6.15f)
                curveToRelative(0.47f, 0.29f, 0.64f, 0.93f, 0.32f, 1.38f)
                curveToRelative(-0.51f, 0.72f, -1.21f, 0.42f, -1.38f, 0.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.53f, 19.85f)
                curveToRelative(4.85f, -3.04f, 7.24f, -7.18f, 7.34f, -7.35f)
                curveToRelative(0.17f, -0.31f, 0.17f, -0.68f, 0f, -0.99f)
                curveToRelative(-0.1f, -0.17f, -2.48f, -4.32f, -7.34f, -7.35f)
                curveToRelative(-0.47f, -0.29f, -1.08f, -0.15f, -1.38f, 0.32f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.08f, 0.32f, 1.38f)
                curveToRelative(3.47f, 2.17f, 5.59f, 5.02f, 6.35f, 6.15f)
                curveToRelative(-0.76f, 1.13f, -2.88f, 3.98f, -6.35f, 6.15f)
                curveToRelative(-0.47f, 0.29f, -0.64f, 0.93f, -0.32f, 1.38f)
                curveToRelative(0.51f, 0.72f, 1.21f, 0.42f, 1.38f, 0.32f)
                close()
            }
        }.also { _CodeSimple = it}
