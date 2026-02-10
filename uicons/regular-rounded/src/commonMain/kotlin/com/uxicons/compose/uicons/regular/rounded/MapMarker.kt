package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Rr.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                close()
                moveTo(12f, 6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                close()
                moveTo(20.66f, 9.16f)
                lineTo(19.94f, 8.92f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.09f, 9.09f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.55f, 1.3f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                verticalLineToRelative(4.08f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.6f, 4.8f)
                lineToRelative(2.87f, 0.9f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.96f, 24f)
                arcToRelative(5.08f, 5.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.35f, -0.19f)
                lineToRelative(5.78f, -1.71f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.57f, 0f)
                lineToRelative(2.39f, 0.8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.02f)
                lineTo(24f, 13.87f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.66f, 9.16f)
                close()
                moveTo(7.76f, 3.76f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.48f, 0f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 8.5f)
                lineTo(12.7f, 15.72f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.39f, 0f)
                lineTo(7.76f, 12.28f)
                arcTo(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.76f, 3.76f)
                close()
                moveTo(22f, 19.02f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.76f, 1.57f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.63f, 0.4f)
                lineTo(17.27f, 20.2f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.72f, -0.02f)
                lineTo(8.76f, 21.89f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, -0.03f)
                lineToRelative(-2.89f, -0.9f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.07f)
                lineTo(2f, 14f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, -2.16f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.67f, -0.81f)
                arcTo(8.02f, 8.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.35f, 13.7f)
                lineToRelative(3.57f, 3.45f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.17f, 0f)
                lineToRelative(3.56f, -3.46f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.81f, -2.82f)
                lineToRelative(0.54f, 0.18f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13.87f)
                close()
            }
        }.also { _MapMarker = it}
