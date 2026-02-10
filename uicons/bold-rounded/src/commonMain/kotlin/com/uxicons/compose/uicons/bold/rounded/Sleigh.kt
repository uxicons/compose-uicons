package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sleigh: ImageVector? = null

val Icons.Br.Sleigh: ImageVector
    get() = _Sleigh ?: UXIcon(name = "Sleigh") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 17f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.5f)
            verticalLineToRelative(-2f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.04f, 9f)
            horizontalLineTo(13.75f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 7.11f)
            lineToRelative(-0.48f, -1.94f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 1f)
            horizontalLineToRelative(-1f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(6f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.48f)
            verticalLineTo(20f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(20f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            horizontalLineTo(17f)
            verticalLineTo(17f)
            close()
            moveTo(3f, 11.5f)
            verticalLineToRelative(-6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4f)
            horizontalLineToRelative(1f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.93f, 5.89f)
            lineTo(8.41f, 7.83f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 12f)
            horizontalLineTo(17.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
            verticalLineToRelative(2f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 14f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.5f)
            close()
            moveTo(14f, 20f)
            horizontalLineTo(8f)
            verticalLineTo(17f)
            horizontalLineToRelative(6f)
            close()
        }
    }.also { _Sleigh = it }
