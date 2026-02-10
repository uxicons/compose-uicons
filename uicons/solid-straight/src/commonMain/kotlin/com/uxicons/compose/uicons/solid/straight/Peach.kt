package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peach: ImageVector? = null

val Icons.Ss.Peach: ImageVector
    get() = _Peach ?: UXIcon(name = "Peach") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                curveTo(24f, 18.6f, 16f, 24f, 12f, 24f)
                reflectiveCurveTo(0f, 18.6f, 0f, 11.5f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.73f, 4.04f)
                curveTo(10.36f, 4.43f, 12f, 7.73f, 12f, 11f)
                arcToRelative(15.47f, 15.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.87f, 6.5f)
                lineToRelative(1.74f, 0.99f)
                arcTo(17.28f, 17.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                arcToRelative(11.01f, 11.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -3.46f)
                curveToRelative(0.1f, 0f, 0.21f, 0.01f, 0.31f, 0.01f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.42f, -2f)
                curveToRelative(0.14f, -0.11f, 0.24f, -0.23f, 0.37f, -0.34f)
                arcTo(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11.5f)
                close()
                moveTo(18.59f, 0f)
                arcToRelative(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.32f, 2.75f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 0f)
                verticalLineTo(2f)
                curveToRelative(1.5f, 0f, 2.85f, 1.64f, 3f, 3.44f)
                curveToRelative(8.41f, 0.97f, 9f, -5f, 9f, -5f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.59f, 0f)
                close()
            }
        }.also { _Peach = it}
