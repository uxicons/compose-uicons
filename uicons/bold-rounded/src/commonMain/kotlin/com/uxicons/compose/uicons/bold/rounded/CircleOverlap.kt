package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleOverlap: ImageVector? = null

val Icons.Br.CircleOverlap: ImageVector
    get() = _CircleOverlap ?: UXIcon(name = "CircleOverlap") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.61f, 6.39f)
            curveTo(16.49f, 2.7f, 13.05f, 0f, 9f, 0f)
            curveTo(4.04f, 0f, 0f, 4.04f, 0f, 9f)
            curveToRelative(0f, 4.05f, 2.7f, 7.49f, 6.39f, 8.61f)
            curveToRelative(1.12f, 3.69f, 4.56f, 6.39f, 8.61f, 6.39f)
            curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
            curveToRelative(0f, -4.05f, -2.7f, -7.49f, -6.39f, -8.61f)
            close()
            moveTo(3f, 9f)
            curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
            curveToRelative(2.23f, 0f, 4.18f, 1.23f, 5.21f, 3.04f)
            curveToRelative(-4.33f, 0.38f, -7.79f, 3.84f, -8.17f, 8.17f)
            curveToRelative(-1.81f, -1.03f, -3.04f, -2.98f, -3.04f, -5.21f)
            close()
            moveTo(15f, 21f)
            curveToRelative(-2.23f, 0f, -4.18f, -1.23f, -5.21f, -3.04f)
            curveToRelative(4.33f, -0.38f, 7.79f, -3.84f, 8.17f, -8.17f)
            curveToRelative(1.81f, 1.03f, 3.04f, 2.98f, 3.04f, 5.21f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            close()
        }
    }.also { _CircleOverlap = it }
