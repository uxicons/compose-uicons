package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comment: ImageVector? = null

val Icons.Br.Comment: ImageVector
    get() = _Comment ?: UXIcon(name = "Comment") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 11.25f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.02f, 24f)
            horizontalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
            verticalLineTo(11.34f)
            close()
            moveTo(21f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 21f)
            horizontalLineTo(12.02f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.73f, -3.01f)
            arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.23f, -7.03f)
            arcToRelative(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.79f, -7.88f)
            arcTo(9.48f, 9.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.02f, 3f)
            arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.74f, 2.07f)
            arcTo(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11.39f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 11f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 13f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _Comment = it }
