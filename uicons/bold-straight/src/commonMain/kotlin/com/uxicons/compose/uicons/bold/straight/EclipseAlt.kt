package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EclipseAlt: ImageVector? = null

val Icons.Bs.EclipseAlt: ImageVector
    get() = _EclipseAlt ?: UXIcon(name = "EclipseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                verticalLineToRelative(-3f)
                lineTo(20.87f, 10.5f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.71f)
                lineToRelative(2.21f, -2.21f)
                lineTo(19.43f, 2.45f)
                lineTo(17.21f, 4.67f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3.13f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 3.13f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.79f, 4.67f)
                lineTo(4.58f, 2.45f)
                lineTo(2.45f, 4.58f)
                lineTo(4.67f, 6.79f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.13f, 10.5f)
                lineTo(0f, 10.5f)
                verticalLineToRelative(3f)
                lineTo(3.13f, 13.5f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, 3.71f)
                lineTo(2.45f, 19.43f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.21f, -2.21f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 20.87f)
                lineTo(10.5f, 24f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 20.87f)
                arcToRelative(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, -1.54f)
                lineToRelative(2.21f, 2.21f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.21f, -2.21f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.87f, 13.5f)
                close()
                moveTo(18f, 12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, -6f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                close()
                moveTo(14.25f, 15.3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.93f, 8.5f)
                arcTo(3.93f, 3.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.82f)
                arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.25f, 15.3f)
                close()
            }
        }.also { _EclipseAlt = it}
