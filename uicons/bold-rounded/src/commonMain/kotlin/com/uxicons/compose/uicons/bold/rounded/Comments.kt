package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Br.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.26f, 18f)
            lineTo(3.5f, 18f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.5f)
            lineTo(0f, 9.23f)
            arcTo(9.31f, 9.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 2.01f)
            arcTo(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.77f, 0.18f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.09f, 7.26f)
            arcTo(8.64f, 8.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.97f, 14.6f)
            arcTo(9.98f, 9.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.26f, 18f)
            close()
            moveTo(8.98f, 3f)
            arcTo(5.73f, 5.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.3f, 4.33f)
            arcTo(6.4f, 6.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.23f)
            lineTo(3f, 14.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
            lineTo(8.26f, 15f)
            arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.41f, -2.34f)
            arcToRelative(5.68f, 5.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.23f, -4.71f)
            arcToRelative(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.72f, -4.83f)
            arcTo(6.25f, 6.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.98f, 3f)
            close()
            moveTo(20.98f, 9.78f)
            arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.69f)
            arcToRelative(10.55f, 10.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, 3.33f)
            arcTo(5.36f, 5.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16.2f)
            verticalLineToRelative(4.3f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
            lineTo(16.64f, 21f)
            arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.27f, -1.67f)
            arcToRelative(12.74f, 12.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 0.63f)
            arcToRelative(7.66f, 7.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, 1.02f)
            arcTo(8.85f, 8.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.64f, 24f)
            lineTo(20.5f, 24f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
            lineTo(24f, 16.2f)
            arcTo(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.98f, 9.78f)
            close()
        }
    }.also { _Comments = it }
