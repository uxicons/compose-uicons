package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Rr.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 0f)
                lineTo(8f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                lineTo(3f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.56f, 0.82f)
                lineTo(6.67f, 22.39f)
                lineToRelative(2.11f, 1.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 0f)
                lineToRelative(2.1f, -1.44f)
                lineToRelative(2.1f, 1.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 0f)
                lineToRelative(2.1f, -1.44f)
                lineToRelative(2.1f, 1.44f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 23f)
                lineTo(21f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                close()
                moveTo(19f, 21.1f)
                lineTo(17.9f, 20.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 0f)
                lineToRelative(-2.1f, 1.44f)
                lineToRelative(-2.1f, -1.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 0f)
                lineToRelative(-2.1f, 1.44f)
                lineToRelative(-2.1f, -1.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, 0f)
                lineTo(5f, 21.1f)
                lineTo(5f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8f)
                lineTo(16f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 9f)
                lineTo(17f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                lineTo(8f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                lineTo(7f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                lineTo(14f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 13f)
                lineTo(15f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 14f)
                lineTo(8f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13f)
                lineTo(7f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                close()
            }
        }.also { _Receipt = it}
