package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Sr.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.47f, 7.69f)
                curveTo(1.89f, 4.95f, 6.44f, 3f, 12f, 3f)
                curveToRelative(5.39f, 0f, 9.83f, 1.83f, 11.39f, 4.43f)
                curveToRelative(-0.12f, 1.35f, -1.23f, 2.67f, -3.05f, 3.69f)
                curveToRelative(-1.93f, -1.19f, -5.19f, -2.12f, -8.34f, -2.12f)
                curveToRelative(-3.17f, 0f, -6.53f, 0.88f, -8.45f, 2.07f)
                curveToRelative(-1.82f, -1.01f, -2.9f, -2.26f, -3.08f, -3.38f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-5.4f, 0f, -9.94f, -1.67f, -12f, -4.12f)
                verticalLineToRelative(3.62f)
                curveToRelative(0f, 3.65f, 5.27f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.85f, 12f, -6.5f)
                verticalLineToRelative(-3.62f)
                curveToRelative(-2.06f, 2.45f, -6.6f, 4.12f, -12f, 4.12f)
                close()
            }
        }.also { _Ring = it}
