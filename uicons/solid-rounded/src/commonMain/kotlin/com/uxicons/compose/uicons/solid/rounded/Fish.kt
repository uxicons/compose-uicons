package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fish: ImageVector? = null

val Icons.Sr.Fish: ImageVector
    get() = _Fish ?: UXIcon(name = "Fish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5.27f)
                arcToRelative(16.49f, 16.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.75f, 2.62f)
                arcTo(6.55f, 6.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.37f, 3.05f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5.27f)
                close()
                moveTo(23.65f, 5.25f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.08f, -1.82f)
                arcTo(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 0.35f)
                arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 1.72f)
                lineTo(16f, 7f)
                curveTo(8.48f, 7f, 4.19f, 8.44f, 1.96f, 12.19f)
                arcTo(13.76f, 13.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.8f, 22.04f)
                curveTo(15.56f, 19.81f, 17f, 15.52f, 17f, 8f)
                horizontalLineToRelative(5.29f)
                arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.65f, 5.25f)
                close()
                moveTo(19.2f, 13f)
                horizontalLineToRelative(-0.47f)
                arcToRelative(22.8f, 22.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 4f)
                horizontalLineToRelative(0.81f)
                curveTo(21.21f, 17.08f, 22.01f, 13.12f, 19.2f, 13f)
                close()
                moveTo(9.95f, 22.91f)
                curveToRelative(-2.4f, 0.69f, -6.54f, 2.14f, -8.78f, -0.08f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 19.74f)
                arcToRelative(20.84f, 20.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.08f, -5.7f)
                arcTo(11.72f, 11.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.95f, 22.91f)
                close()
                moveTo(5f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                close()
            }
        }.also { _Fish = it}
