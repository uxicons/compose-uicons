package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleOverlap: ImageVector? = null

val Icons.Rr.CircleOverlap: ImageVector
    get() = _CircleOverlap ?: UXIcon(name = "CircleOverlap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.88f, 7.12f)
                curveTo(16.22f, 3.09f, 12.72f, 0f, 8.5f, 0f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                curveToRelative(0f, 4.22f, 3.09f, 7.72f, 7.12f, 8.38f)
                curveToRelative(0.66f, 4.03f, 4.16f, 7.12f, 8.38f, 7.12f)
                curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -4.22f, -3.09f, -7.72f, -7.12f, -8.38f)
                close()
                moveTo(2f, 8.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.08f, 0f, 5.66f, 2.15f, 6.33f, 5.03f)
                curveToRelative(-4.15f, 0.33f, -7.46f, 3.64f, -7.79f, 7.79f)
                curveToRelative(-2.88f, -0.67f, -5.03f, -3.25f, -5.03f, -6.33f)
                close()
                moveTo(15.5f, 22f)
                curveToRelative(-3.08f, 0f, -5.66f, -2.15f, -6.33f, -5.03f)
                curveToRelative(4.15f, -0.33f, 7.46f, -3.64f, 7.79f, -7.79f)
                curveToRelative(2.88f, 0.67f, 5.03f, 3.25f, 5.03f, 6.33f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                close()
            }
        }.also { _CircleOverlap = it}
