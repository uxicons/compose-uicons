package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Bs.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(1.85f, 3.04f, 12.03f, -2.98f, 19.79f, 1.51f)
                lineTo(22.12f, 2.8f)
                lineTo(19.81f, 4.12f)
                arcToRelative(8.55f, 8.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, 15.17f)
                lineToRelative(2.43f, 1.1f)
                lineToRelative(-2.2f, 1.51f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                close()
                moveTo(14f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.85f, 17.53f)
                curveToRelative(-5.37f, -4.02f, -5.79f, -12.77f, -0.82f, -17.3f)
                arcTo(8.87f, 8.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 3f)
                close()
            }
        }.also { _Moon = it}
