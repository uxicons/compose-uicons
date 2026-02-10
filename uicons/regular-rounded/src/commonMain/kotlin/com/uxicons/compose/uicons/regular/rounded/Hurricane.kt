package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Rr.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.43f, 24f)
                lineTo(6f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.82f, -1.24f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.27f, -13.1f)
                arcTo(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.57f, 0f)
                lineTo(18f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.82f, 1.24f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.27f, 13.1f)
                arcTo(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.43f, 24f)
                close()
                moveTo(12.47f, 2.06f)
                arcTo(9.39f, 9.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.45f, 8.3f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.08f, 10.57f)
                arcToRelative(1.81f, 1.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, 1.35f)
                arcToRelative(1.84f, 1.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.73f)
                arcTo(9.39f, 9.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.55f, 15.7f)
                arcTo(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.47f, 5.13f)
                horizontalLineToRelative(0f)
                arcToRelative(1.81f, 1.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.44f, -1.35f)
                arcTo(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.47f, 2.06f)
                close()
                moveTo(12f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
                moveTo(12f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.also { _Hurricane = it}
