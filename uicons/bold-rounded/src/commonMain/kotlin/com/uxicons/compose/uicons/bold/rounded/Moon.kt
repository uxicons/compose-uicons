package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Moon: ImageVector? = null

val Icons.Br.Moon: ImageVector
    get() = _Moon ?: UXIcon(name = "Moon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 24f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.06f, 0.71f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 5.07f)
            curveToRelative(-5.1f, 3.92f, -5.09f, 8.54f, 0f, 12.45f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.82f, 5.07f)
            arcTo(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 24f)
            close()
            moveTo(15f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.92f, 17.51f)
            curveToRelative(-6.51f, -5.07f, -6.49f, -11.97f, 0f, -17.02f)
            arcTo(9.32f, 9.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3f)
            close()
        }
    }.also { _Moon = it }
