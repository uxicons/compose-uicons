package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneFlip: ImageVector? = null

val Icons.Sr.PhoneFlip: ImageVector
    get() = _PhoneFlip ?: UXIcon(name = "PhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.24f)
                curveToRelative(0f, 7.64f, -10.13f, 17.76f, -17.76f, 17.76f)
                curveToRelative(-1.67f, 0f, -3.23f, -0.63f, -4.38f, -1.78f)
                lineToRelative(-1f, -1.15f)
                curveToRelative(-1.16f, -1.16f, -1.16f, -3.12f, 0.05f, -4.33f)
                curveToRelative(0.03f, -0.03f, 2.44f, -1.88f, 2.44f, -1.88f)
                curveToRelative(1.2f, -1.14f, 3.09f, -1.14f, 4.28f, 0f)
                lineToRelative(1.46f, 1.17f)
                curveToRelative(3.2f, -1.36f, 5.47f, -3.64f, 6.93f, -6.95f)
                lineToRelative(-1.16f, -1.46f)
                curveToRelative(-1.15f, -1.19f, -1.15f, -3.09f, 0f, -4.28f)
                curveToRelative(0f, 0f, 1.85f, -2.41f, 1.88f, -2.44f)
                curveToRelative(1.21f, -1.21f, 3.17f, -1.21f, 4.38f, 0f)
                lineToRelative(1.05f, 0.91f)
                curveToRelative(1.2f, 1.19f, 1.83f, 2.75f, 1.83f, 4.42f)
                close()
            }
        }.also { _PhoneFlip = it}
