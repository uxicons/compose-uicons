package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Sr.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3f)
                close()
                moveTo(23f, 21f)
                lineTo(21.72f, 21f)
                lineTo(20.4f, 17.05f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.56f, 15f)
                lineTo(14f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(12f, 11f)
                lineTo(12f, 8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(3.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, 0.68f)
                lineToRelative(1.54f, 4.63f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 23f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(13.79f, 18.99f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 13f)
                lineTo(8f, 9.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -0.99f)
                arcTo(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 24f)
                lineTo(8f, 24f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.57f, -3.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.79f, -1.57f)
                close()
            }
        }.also { _Wheelchair = it}
