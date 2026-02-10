package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Avocado: ImageVector? = null

val Icons.Sr.Avocado: ImageVector
    get() = _Avocado ?: UXIcon(name = "Avocado") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                curveToRelative(0.07f, 2.64f, -4.07f, 2.64f, -4f, 0f)
                curveTo(10.03f, 10.7f, 13.97f, 10.7f, 14f, 16f)
                close()
                moveTo(22f, 14.82f)
                curveTo(22f, 19.88f, 17.51f, 24f, 12f, 24f)
                reflectiveCurveTo(2f, 19.88f, 2f, 14.82f)
                curveTo(2f, 5.23f, 8.61f, 0f, 12f, 0f)
                arcToRelative(5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.59f, 4.36f)
                curveTo(18.49f, 8.12f, 22.38f, 10.71f, 22f, 14.82f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0.09f, -7.96f, -8.09f, -7.96f, -8f, 0f)
                curveTo(8.04f, 21.3f, 15.96f, 21.3f, 16f, 16f)
                close()
            }
        }.also { _Avocado = it}
