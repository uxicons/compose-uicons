package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Ss.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.86f)
                curveTo(24f, 7.54f, 23.66f, 8f, 22.97f, 8f)
                horizontalLineToRelative(-5.99f)
                curveToRelative(-0.17f, 7.69f, -2.27f, 12.2f, -7.15f, 14.37f)
                arcToRelative(12.39f, 12.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.21f, -8.2f)
                curveTo(3.8f, 9.29f, 8.3f, 7.18f, 16f, 7.02f)
                verticalLineTo(1.03f)
                curveTo(16f, 0.34f, 16.46f, 0f, 17.14f, 0f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.43f, 3.43f)
                arcTo(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 6.86f)
                close()
                moveTo(7.96f, 23.07f)
                arcTo(28.74f, 28.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                arcToRelative(28.73f, 28.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.93f, -7.95f)
                arcTo(10.37f, 10.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.96f, 23.07f)
                close()
                moveTo(4f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                close()
                moveTo(12f, 5.3f)
                verticalLineTo(3f)
                arcTo(23.64f, 23.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.62f, 4.78f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7.44f)
                verticalLineTo(9.91f)
                curveTo(4.24f, 7.4f, 7.49f, 5.9f, 12f, 5.3f)
                close()
                moveTo(18.7f, 12f)
                arcToRelative(20.09f, 20.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, 6f)
                horizontalLineToRelative(1.25f)
                curveToRelative(3.09f, -0.12f, 2.56f, -3.59f, 2.71f, -6f)
                close()
            }
        }.also { _Fish = it}
