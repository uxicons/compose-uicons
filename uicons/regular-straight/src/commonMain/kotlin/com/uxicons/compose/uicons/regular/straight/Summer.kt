package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Summer: ImageVector? = null

val Icons.Rs.Summer: ImageVector
    get() = _Summer ?: UXIcon(name = "Summer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14.18f)
                lineTo(18f, 8f)
                lineTo(16f, 8f)
                verticalLineToRelative(6.18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                close()
                moveTo(17f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                close()
                moveTo(22f, 12.11f)
                lineTo(22f, 5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                verticalLineToRelative(7.11f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                close()
                moveTo(17f, 22f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -8.72f)
                lineToRelative(0.33f, -0.3f)
                lineTo(14f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(7.98f)
                lineToRelative(0.33f, 0.3f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                close()
                moveTo(5f, 9f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.94f, 4f)
                arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, 1.95f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.9f, 14.6f)
                lineTo(5.34f, 17.28f)
                lineTo(3.61f, 16.27f)
                lineTo(5.17f, 13.6f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.76f, -0.76f)
                lineTo(1.74f, 14.39f)
                lineTo(0.73f, 12.66f)
                lineTo(3.39f, 11.11f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.09f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 8f)
                lineTo(3.09f, 8f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.3f, -1.12f)
                lineTo(0.72f, 5.33f)
                lineToRelative(1f, -1.73f)
                lineTo(4.4f, 5.16f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, -0.78f)
                lineTo(3.63f, 1.72f)
                lineTo(5.36f, 0.72f)
                lineTo(6.91f, 3.38f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 3.08f)
                lineTo(8f, 0f)
                horizontalLineToRelative(2f)
                lineTo(10f, 5f)
                lineTo(9f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                close()
            }
        }.also { _Summer = it}
