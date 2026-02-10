package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resources: ImageVector? = null

val Icons.Rr.Resources: ImageVector
    get() = _Resources ?: UXIcon(name = "Resources") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                lineTo(13f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                lineTo(12f, 7.27f)
                lineTo(9.6f, 3.11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.47f, 0f)
                horizontalLineToRelative(0f)
                lineTo(0.13f, 13.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 15f)
                lineTo(5.29f, 15f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 0f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -2f)
                lineTo(23f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(24f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 3f)
                close()
                moveTo(2.73f, 13f)
                lineTo(7.86f, 4.11f)
                lineTo(11.29f, 10f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 3f)
                close()
                moveTo(12f, 22f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(22f, 13f)
                lineTo(17.74f, 13f)
                arcTo(7.07f, 7.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 10.29f)
                lineTo(14f, 5f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Resources = it}
