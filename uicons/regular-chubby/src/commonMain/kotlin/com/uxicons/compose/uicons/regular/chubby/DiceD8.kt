package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD8: ImageVector? = null

val Icons.Rc.DiceD8: ImageVector
    get() = _DiceD8 ?: UXIcon(name = "DiceD8") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.98f, 12.52f)
                curveToRelative(-1.64f, -3.78f, -5.81f, -8.35f, -8.15f, -10.73f)
                curveToRelative(-0.98f, -1.0f, -2.7f, -1.0f, -3.67f, 0f)
                curveTo(7.83f, 4.17f, 3.66f, 8.74f, 2.02f, 12.52f)
                curveToRelative(-0.14f, 0.32f, -0.1f, 0.7f, 0.11f, 0.98f)
                curveToRelative(0.2f, 0.28f, 4.98f, 6.88f, 8.54f, 9.11f)
                curveToRelative(0.41f, 0.25f, 0.87f, 0.38f, 1.33f, 0.38f)
                reflectiveCurveToRelative(0.93f, -0.13f, 1.33f, -0.38f)
                curveToRelative(3.56f, -2.23f, 8.34f, -8.83f, 8.54f, -9.11f)
                curveToRelative(0.21f, -0.29f, 0.25f, -0.66f, 0.11f, -0.98f)
                close()
                moveTo(19.57f, 12.15f)
                curveToRelative(-2.12f, 0.78f, -4.32f, 1.25f, -6.57f, 1.43f)
                lineTo(13f, 3.8f)
                curveToRelative(1.8f, 1.88f, 4.89f, 5.32f, 6.57f, 8.35f)
                close()
                moveTo(11f, 3.8f)
                lineTo(11f, 13.57f)
                curveToRelative(-2.25f, -0.17f, -4.45f, -0.65f, -6.57f, -1.43f)
                curveToRelative(1.67f, -3.03f, 4.77f, -6.47f, 6.57f, -8.35f)
                close()
                moveTo(5.48f, 14.6f)
                curveToRelative(1.8f, 0.52f, 3.65f, 0.85f, 5.52f, 0.98f)
                verticalLineToRelative(4.83f)
                curveToRelative(-1.87f, -1.44f, -4.04f, -3.97f, -5.52f, -5.82f)
                close()
                moveTo(13f, 20.41f)
                verticalLineToRelative(-4.83f)
                curveToRelative(1.88f, -0.13f, 3.72f, -0.46f, 5.52f, -0.98f)
                curveToRelative(-1.48f, 1.85f, -3.65f, 4.38f, -5.52f, 5.82f)
                close()
            }
        }.also { _DiceD8 = it}
