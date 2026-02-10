package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stats: ImageVector? = null

val Icons.Br.Stats: ImageVector
    get() = _Stats ?: UXIcon(name = "Stats") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 21f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            verticalLineTo(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
            verticalLineToRelative(17f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 22.5f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 18f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.5f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 18f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 18f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16.5f)
            verticalLineToRelative(-6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 18f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 18f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 16.5f)
            verticalLineTo(5.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(11f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 18f)
            close()
        }
    }.also { _Stats = it }
