package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Rr.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, 18.81f)
                lineToRelative(3.94f, 3.64f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.59f, 0.02f)
                lineToRelative(3.99f, -3.69f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(18.39f, 17.34f)
                lineTo(14.41f, 21.02f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.57f, 21f)
                lineTo(5.64f, 17.36f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, 11f)
                arcTo(8.92f, 8.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.39f, 17.34f)
                close()
                moveTo(16.71f, 7.66f)
                lineToRelative(-3f, -2.08f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.42f, 0f)
                lineToRelative(-3f, 2.08f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10.13f)
                lineTo(6f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 16f)
                horizontalLineToRelative(7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13.5f)
                lineTo(18f, 10.13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.71f, 7.66f)
                close()
                moveTo(16f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(14f, 14f)
                lineTo(14f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                lineTo(8.5f, 14f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
                lineTo(8f, 10.13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, -0.82f)
                lineToRelative(3f, -2.08f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, 0f)
                lineToRelative(3f, 2.08f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 0.82f)
                close()
            }
        }.also { _MapMarkerHome = it}
