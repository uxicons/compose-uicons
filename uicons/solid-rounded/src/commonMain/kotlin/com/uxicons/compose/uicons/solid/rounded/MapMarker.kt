package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Sr.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 7f)
                close()
                moveTo(16.96f, 12.18f)
                lineTo(13.9f, 15.21f)
                arcToRelative(2.67f, 2.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.79f, 0f)
                lineTo(7.05f, 12.2f)
                arcTo(7.26f, 7.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 2.1f)
                arcToRelative(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.92f, 0f)
                arcTo(7.26f, 7.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.96f, 12.18f)
                close()
                moveTo(16f, 7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 7f)
                close()
                moveTo(20.75f, 9.2f)
                arcToRelative(9.1f, 9.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.36f, 4.38f)
                lineToRelative(-3.08f, 3.05f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.3f, 1.37f)
                horizontalLineToRelative(0f)
                arcToRelative(4.67f, 4.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.3f, -1.37f)
                lineTo(5.65f, 13.62f)
                arcTo(9.2f, 9.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.28f, 9.31f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, 1.08f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                verticalLineToRelative(4.08f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 4.8f)
                lineToRelative(2.87f, 0.9f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.96f, 24f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, -0.19f)
                lineToRelative(5.78f, -1.71f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 0f)
                lineToRelative(2.39f, 0.8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.02f)
                lineTo(24f, 13.87f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 9.2f)
                close()
            }
        }.also { _MapMarker = it}
