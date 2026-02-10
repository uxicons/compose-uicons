package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Rs.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.29f, 2.29f)
                lineTo(19f, 5.59f)
                lineTo(19f, 19f)
                lineTo(16f, 19f)
                lineTo(16f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(16f, 24f)
                lineTo(16f, 21f)
                horizontalLineToRelative(5f)
                lineTo(21f, 6.41f)
                lineToRelative(2.71f, -2.71f)
                close()
                moveTo(3f, 2f)
                lineTo(13f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                lineTo(14f, 9f)
                lineTo(12f, 9f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, -2.6f)
                lineToRelative(1.69f, -1.69f)
                lineTo(11.29f, 3.29f)
                lineTo(9.34f, 5.25f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 9f)
                lineTo(2f, 9f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                close()
                moveTo(10f, 9f)
                lineTo(6f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
                moveTo(2f, 22f)
                lineTo(2f, 11f)
                lineTo(14f, 11f)
                lineTo(14f, 22f)
                close()
            }
        }.also { _GasPump = it}
