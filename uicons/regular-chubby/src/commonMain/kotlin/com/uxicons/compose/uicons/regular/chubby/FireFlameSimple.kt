package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Rc.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.58f, 10.18f)
                curveToRelative(-0.34f, -0.23f, -0.78f, -0.24f, -1.12f, -0.01f)
                curveToRelative(-0.57f, 0.38f, -3.43f, 2.41f, -3.43f, 4.86f)
                curveToRelative(0f, 1.97f, 1.96f, 3.94f, 3.96f, 3.98f)
                horizontalLineToRelative(0.03f)
                curveToRelative(2.01f, -0.03f, 3.9f, -1.91f, 3.96f, -3.99f)
                curveToRelative(-0.04f, -2.45f, -3.06f, -4.6f, -3.4f, -4.83f)
                close()
                moveTo(12.0f, 17f)
                curveToRelative(-0.93f, -0.03f, -1.98f, -1.07f, -1.98f, -1.98f)
                curveToRelative(0f, -0.91f, 1.03f, -2.03f, 1.97f, -2.77f)
                curveToRelative(0.86f, 0.72f, 1.97f, 1.89f, 1.98f, 2.75f)
                curveToRelative(-0.03f, 0.96f, -1.04f, 1.98f, -1.97f, 2.0f)
                close()
                moveTo(12.59f, 1.18f)
                curveToRelative(-0.34f, -0.23f, -0.78f, -0.23f, -1.12f, -0.01f)
                curveToRelative(-0.92f, 0.61f, -8.97f, 6.18f, -8.97f, 12.33f)
                curveToRelative(0f, 4.71f, 4.7f, 9.41f, 9.48f, 9.5f)
                horizontalLineToRelative(0.03f)
                curveToRelative(4.73f, -0.07f, 9.34f, -4.67f, 9.49f, -9.52f)
                curveToRelative(-0.1f, -6.2f, -8.82f, -12.25f, -8.91f, -12.31f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-3.65f, -0.08f, -7.5f, -3.93f, -7.5f, -7.5f)
                curveToRelative(0f, -4.45f, 5.67f, -8.93f, 7.52f, -10.27f)
                curveToRelative(2.49f, 1.86f, 7.42f, 6.35f, 7.48f, 10.24f)
                curveToRelative(-0.11f, 3.74f, -3.83f, 7.47f, -7.5f, 7.53f)
                close()
            }
        }.also { _FireFlameSimple = it}
