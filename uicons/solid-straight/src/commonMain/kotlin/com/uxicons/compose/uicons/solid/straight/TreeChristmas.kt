package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TreeChristmas: ImageVector? = null

val Icons.Ss.TreeChristmas: ImageVector
    get() = _TreeChristmas ?: UXIcon(name = "TreeChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.91f, 22f)
                lineTo(18.24f, 15f)
                horizontalLineToRelative(2.67f)
                lineToRelative(-4f, -6f)
                lineTo(19.1f, 9f)
                lineTo(13.72f, 0.7f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.35f, 0f)
                lineTo(4.95f, 9f)
                lineTo(7.17f, 9f)
                lineToRelative(-4f, 6f)
                lineTo(5.84f, 15f)
                lineTo(1.17f, 22f)
                horizontalLineToRelative(9.87f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(13.04f, 22f)
                close()
                moveTo(13f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18f)
                close()
                moveTo(16f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                close()
                moveTo(15f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11f)
                close()
                moveTo(13f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5f)
                close()
                moveTo(8f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                close()
                moveTo(9f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                close()
                moveTo(10f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 10f)
                close()
            }
        }.also { _TreeChristmas = it}
