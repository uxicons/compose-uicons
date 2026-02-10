package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Rc.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 20.98f)
                curveToRelative(-1.4f, 0f, -2.77f, -0.36f, -3.98f, -1.04f)
                curveToRelative(-1.22f, -0.69f, -2.23f, -1.4f, -3.09f, -2.16f)
                curveToRelative(-2.57f, -2.29f, -3.9f, -4.75f, -3.93f, -7.34f)
                curveToRelative(0.13f, -4.37f, 2.9f, -7.42f, 6.74f, -7.44f)
                curveToRelative(1.46f, 0.06f, 2.67f, 0.62f, 3.63f, 1.68f)
                lineToRelative(1.4f, 1.68f)
                curveToRelative(0.15f, 0.18f, 0.23f, 0.41f, 0.23f, 0.64f)
                verticalLineToRelative(12.98f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(7.7f, 5.0f)
                curveToRelative(-2.69f, 0.02f, -4.6f, 2.21f, -4.7f, 5.46f)
                curveToRelative(0.03f, 1.96f, 1.12f, 3.93f, 3.26f, 5.83f)
                curveToRelative(0.75f, 0.67f, 1.65f, 1.29f, 2.75f, 1.92f)
                curveToRelative(0.61f, 0.35f, 1.29f, 0.58f, 1.99f, 0.7f)
                verticalLineToRelative(-11.54f)
                lineToRelative(-1.14f, -1.37f)
                curveToRelative(-0.57f, -0.63f, -1.27f, -0.96f, -2.15f, -0.99f)
                close()
            }
        }.also { _HeartHalf = it}
