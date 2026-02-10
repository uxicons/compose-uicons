package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD6: ImageVector? = null

val Icons.Rc.DiceD6: ImageVector
    get() = _DiceD6 ?: UXIcon(name = "DiceD6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.06f, 7.47f)
                curveToRelative(-0.01f, -0.3f, -0.16f, -0.57f, -0.4f, -0.75f)
                curveToRelative(-3.38f, -2.51f, -5.47f, -3.77f, -9.29f, -5.62f)
                curveToRelative(-0.27f, -0.13f, -0.57f, -0.13f, -0.84f, -0.01f)
                curveTo(7.49f, 2.87f, 5.35f, 4.08f, 2.35f, 6.25f)
                curveToRelative(-0.24f, 0.17f, -0.39f, 0.45f, -0.41f, 0.74f)
                curveToRelative(-0.0f, 0.02f, -0.0f, 9.99f, -0.0f, 9.99f)
                curveToRelative(0f, 0.23f, 0.08f, 0.45f, 0.22f, 0.63f)
                curveToRelative(2.16f, 2.66f, 8.76f, 5.06f, 9.5f, 5.33f)
                curveToRelative(0f, 0f, 0.0f, 0f, 0.0f, 0f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.06f, 0.33f, 0.06f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.34f, -0.06f)
                curveToRelative(0.74f, -0.27f, 7.34f, -2.67f, 9.5f, -5.33f)
                curveToRelative(0.14f, -0.18f, 0.22f, -0.4f, 0.22f, -0.63f)
                curveToRelative(0f, 0f, 0f, -9.5f, -0.0f, -9.51f)
                close()
                moveTo(11.91f, 3.1f)
                curveToRelative(3.02f, 1.47f, 4.91f, 2.59f, 7.46f, 4.42f)
                curveToRelative(-2.06f, 1.46f, -3.97f, 2.45f, -7.36f, 3.84f)
                curveToRelative(-3.29f, -1.41f, -5.18f, -2.49f, -7.42f, -4.25f)
                curveToRelative(2.27f, -1.57f, 4.15f, -2.59f, 7.32f, -4.01f)
                close()
                moveTo(3.94f, 16.6f)
                verticalLineToRelative(-7.46f)
                curveToRelative(2.09f, 1.58f, 4f, 2.64f, 7.06f, 3.97f)
                verticalLineToRelative(7.44f)
                curveToRelative(-2.21f, -0.89f, -5.64f, -2.47f, -7.06f, -3.94f)
                close()
                moveTo(13f, 20.55f)
                verticalLineToRelative(-7.42f)
                curveToRelative(3.17f, -1.31f, 5.09f, -2.29f, 7.06f, -3.63f)
                verticalLineToRelative(7.12f)
                curveToRelative(-1.42f, 1.47f, -4.85f, 3.05f, -7.06f, 3.94f)
                close()
            }
        }.also { _DiceD6 = it}
