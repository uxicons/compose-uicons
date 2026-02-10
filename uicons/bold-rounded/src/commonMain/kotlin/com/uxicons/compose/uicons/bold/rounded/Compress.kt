package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Compress: ImageVector? = null

val Icons.Br.Compress: ImageVector
    get() = _Compress ?: UXIcon(name = "Compress") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2.5f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 9f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.5f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22.5f)
            verticalLineToRelative(-1f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 15f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            horizontalLineToRelative(-1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21.5f)
            verticalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 9f)
            horizontalLineToRelative(-1f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 2.5f)
            verticalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 6f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 24f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 22.5f)
            verticalLineToRelative(-1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 18f)
            horizontalLineToRelative(-1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(1f)
            arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21.5f)
            verticalLineToRelative(1f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 24f)
            close()
        }
    }.also { _Compress = it }
