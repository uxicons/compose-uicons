package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grill: ImageVector? = null

val Icons.Sr.Grill: ImageVector
    get() = _Grill ?: UXIcon(name = "Grill") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.92f, 9.69f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.75f, 7.65f)
                lineToRelative(1.78f, 5.34f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.9f, 0.63f)
                lineTo(16.34f, 18.2f)
                arcTo(12.32f, 12.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.96f)
                lineTo(13f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 18.96f)
                arcTo(12.33f, 12.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.65f, 18.2f)
                lineToRelative(-1.7f, 5.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.9f, -0.63f)
                lineToRelative(1.78f, -5.34f)
                curveTo(2.37f, 15.8f, -3.65f, 7.04f, 3f, 6f)
                lineTo(21f, 6f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.92f, 9.69f)
                close()
                moveTo(12f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                close()
                moveTo(16f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(17f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                lineTo(15f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 4f)
                close()
                moveTo(8f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                lineTo(9f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7f, 1f)
                lineTo(7f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                close()
            }
        }.also { _Grill = it}
