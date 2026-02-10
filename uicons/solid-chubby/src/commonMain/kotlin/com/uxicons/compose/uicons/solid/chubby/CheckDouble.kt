package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Sc.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.81f, 13f)
                curveToRelative(-0.28f, 0f, -0.56f, -0.08f, -0.8f, -0.23f)
                curveToRelative(-1.96f, -1.24f, -3.75f, -2.92f, -5.21f, -4.87f)
                curveToRelative(-0.49f, -0.67f, -0.36f, -1.6f, 0.31f, -2.1f)
                curveToRelative(0.67f, -0.49f, 1.6f, -0.36f, 2.1f, 0.31f)
                curveToRelative(1.04f, 1.39f, 2.28f, 2.62f, 3.62f, 3.6f)
                curveToRelative(2.93f, -2.04f, 5.43f, -5.36f, 6.86f, -7.93f)
                curveToRelative(0.4f, -0.73f, 1.32f, -0.98f, 2.04f, -0.58f)
                curveToRelative(0.72f, 0.4f, 0.98f, 1.32f, 0.58f, 2.04f)
                curveToRelative(-0.85f, 1.52f, -3.98f, 6.71f, -8.73f, 9.56f)
                curveToRelative(-0.24f, 0.14f, -0.51f, 0.21f, -0.77f, 0.21f)
                close()
                moveTo(10.3f, 22.79f)
                curveToRelative(6.05f, -3.63f, 10.13f, -9.08f, 12.49f, -13.02f)
                curveToRelative(0.43f, -0.71f, 0.2f, -1.63f, -0.51f, -2.06f)
                curveToRelative(-0.71f, -0.43f, -1.63f, -0.2f, -2.06f, 0.52f)
                curveToRelative(-2.08f, 3.46f, -5.58f, 8.19f, -10.66f, 11.49f)
                curveToRelative(-2.21f, -1.54f, -4.39f, -3.62f, -5.84f, -5.6f)
                curveToRelative(-0.49f, -0.67f, -1.43f, -0.81f, -2.1f, -0.33f)
                curveToRelative(-0.67f, 0.49f, -0.81f, 1.43f, -0.33f, 2.1f)
                curveToRelative(1.85f, 2.53f, 4.63f, 5.11f, 7.43f, 6.88f)
                curveToRelative(0.48f, 0.3f, 1.09f, 0.31f, 1.57f, 0.02f)
                close()
            }
        }.also { _CheckDouble = it}
