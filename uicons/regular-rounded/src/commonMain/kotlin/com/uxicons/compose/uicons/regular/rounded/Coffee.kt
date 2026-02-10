package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Coffee: ImageVector? = null

val Icons.Rr.Coffee: ImageVector
    get() = _Coffee ?: UXIcon(name = "Coffee") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-0.17f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                lineTo(7f, 0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.17f, 2f)
                lineTo(4f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.02f, 7.24f)
                lineTo(3.57f, 19.62f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 24f)
                horizontalLineToRelative(6.94f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.96f, -4.38f)
                lineTo(21.98f, 7.24f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 5f)
                close()
                moveTo(19.12f, 14f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.89f, -5.29f, -6.95f, -5.28f, -7.84f, 0f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(-0.75f, -6f)
                lineTo(19.87f, 8f)
                close()
                moveTo(14f, 15f)
                curveToRelative(-0.1f, 3.95f, -3.9f, 3.95f, -4f, 0f)
                curveTo(10.11f, 11.05f, 13.9f, 11.05f, 14f, 15f)
                close()
                moveTo(4f, 4f)
                lineTo(5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                lineTo(17f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(4f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                close()
                moveTo(18.45f, 19.37f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.47f, 22f)
                lineTo(8.53f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.98f, -2.63f)
                lineTo(5.13f, 16f)
                lineTo(8.08f, 16f)
                curveToRelative(0.89f, 5.29f, 6.95f, 5.28f, 7.84f, 0f)
                horizontalLineToRelative(2.95f)
                close()
            }
        }.also { _Coffee = it}
