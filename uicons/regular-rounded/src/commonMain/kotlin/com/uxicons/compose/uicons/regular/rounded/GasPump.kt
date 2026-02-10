package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Rr.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.68f, 3.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 0f)
                lineTo(19.29f, 6.24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.95f)
                lineTo(19f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(16f, 19f)
                lineTo(16f, 5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                lineTo(5f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.58f, -3f)
                lineTo(18f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(21f, 7.36f)
                lineToRelative(2.68f, -2.68f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.68f, 3.27f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(14f, 9f)
                lineTo(12f, 9f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -2.6f)
                lineToRelative(0.69f, -0.69f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineToRelative(-0.95f, 0.95f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                close()
                moveTo(6f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
                moveTo(11f, 22f)
                lineTo(5f, 22f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 11f)
                lineTo(14f, 11f)
                verticalLineToRelative(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 22f)
                close()
            }
        }.also { _GasPump = it}
