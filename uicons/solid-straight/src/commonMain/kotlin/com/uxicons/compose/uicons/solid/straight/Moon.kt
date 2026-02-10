package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Ss.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(1.85f, 3.04f, 12.03f, -2.98f, 19.79f, 1.51f)
                lineToRelative(1.55f, 0.86f)
                lineToRelative(-1.54f, 0.88f)
                curveToRelative(-6.7f, 3.69f, -6.21f, 13.87f, 0.8f, 16.91f)
                lineToRelative(1.62f, 0.73f)
                lineToRelative(-1.47f, 1.01f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                close()
            }
        }.also { _Moon = it}
