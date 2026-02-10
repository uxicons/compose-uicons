package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bold: ImageVector? = null

val Icons.Sr.Bold: ImageVector
    get() = _Bold ?: UXIcon(name = "Bold") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.05f, -6.34f)
                arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                lineTo(5f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 2f)
                lineTo(3f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(15f, 24f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                lineTo(7f, 10f)
                close()
                moveTo(15f, 20f)
                lineTo(7f, 20f)
                lineTo(7f, 14f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _Bold = it}
