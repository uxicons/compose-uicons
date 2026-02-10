package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Rr.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.17f, 1.82f)
                lineToRelative(-1.05f, -0.91f)
                curveToRelative(-1.21f, -1.21f, -3.17f, -1.21f, -4.38f, 0f)
                curveToRelative(-0.03f, 0.03f, -1.88f, 2.44f, -1.88f, 2.44f)
                curveToRelative(-1.14f, 1.2f, -1.14f, 3.09f, 0f, 4.28f)
                lineToRelative(1.16f, 1.46f)
                curveToRelative(-1.46f, 3.31f, -3.73f, 5.59f, -6.93f, 6.95f)
                lineToRelative(-1.46f, -1.17f)
                curveToRelative(-1.19f, -1.15f, -3.09f, -1.15f, -4.28f, 0f)
                curveToRelative(0f, 0f, -2.41f, 1.85f, -2.44f, 1.88f)
                curveToRelative(-1.21f, 1.21f, -1.21f, 3.17f, -0.05f, 4.33f)
                lineToRelative(1f, 1.15f)
                curveToRelative(1.15f, 1.15f, 2.7f, 1.78f, 4.38f, 1.78f)
                curveToRelative(7.64f, 0f, 17.76f, -10.13f, 17.76f, -17.76f)
                curveToRelative(0f, -1.67f, -0.63f, -3.23f, -1.83f, -4.42f)
                close()
                moveTo(6.24f, 22f)
                curveToRelative(-1.14f, 0f, -2.19f, -0.42f, -2.91f, -1.15f)
                lineToRelative(-1f, -1.15f)
                curveToRelative(-0.41f, -0.41f, -0.43f, -1.08f, -0.04f, -1.51f)
                curveToRelative(0f, 0f, 2.39f, -1.84f, 2.42f, -1.87f)
                curveToRelative(0.41f, -0.41f, 1.13f, -0.41f, 1.55f, 0f)
                curveToRelative(0.03f, 0.03f, 2.04f, 1.64f, 2.04f, 1.64f)
                curveToRelative(0.28f, 0.22f, 0.65f, 0.28f, 0.98f, 0.15f)
                curveToRelative(4.14f, -1.58f, 7.11f, -4.54f, 8.82f, -8.81f)
                curveToRelative(0.13f, -0.33f, 0.08f, -0.71f, -0.15f, -1f)
                curveToRelative(0f, 0f, -1.61f, -2.02f, -1.63f, -2.04f)
                curveToRelative(-0.43f, -0.43f, -0.43f, -1.12f, 0f, -1.55f)
                curveToRelative(0.03f, -0.03f, 1.87f, -2.42f, 1.87f, -2.42f)
                curveToRelative(0.43f, -0.39f, 1.1f, -0.38f, 1.56f, 0.08f)
                lineToRelative(1.05f, 0.91f)
                curveToRelative(0.77f, 0.77f, 1.2f, 1.82f, 1.2f, 2.96f)
                curveToRelative(0f, 6.96f, -9.77f, 15.76f, -15.76f, 15.76f)
                close()
            }
        }.also { _PhoneFlip = it}
