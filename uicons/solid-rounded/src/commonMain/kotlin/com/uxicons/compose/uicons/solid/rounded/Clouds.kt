package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clouds: ImageVector? = null

val Icons.Sr.Clouds: ImageVector
    get() = _Clouds ?: UXIcon(name = "Clouds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.4f, 24f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, -0.15f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, -6.59f)
                arcToRelative(6.38f, 6.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -2.73f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.37f, -0.86f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 0.47f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.56f, 6f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.7f, 3.7f)
                arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.1f, 24f)
                close()
                moveTo(6f, 16.23f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, -2.17f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.11f, 12.3f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 14.08f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.36f, 6.36f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -0.73f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0.84f)
                arcToRelative(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.18f)
                arcTo(5.45f, 5.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 17.3f)
                arcToRelative(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.1f, 4.47f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16.23f)
                close()
            }
        }.also { _Clouds = it}
