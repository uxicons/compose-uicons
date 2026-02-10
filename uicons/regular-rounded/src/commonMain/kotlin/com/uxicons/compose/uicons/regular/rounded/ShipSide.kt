package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShipSide: ImageVector? = null

val Icons.Rr.ShipSide: ImageVector
    get() = _ShipSide ?: UXIcon(name = "ShipSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.99f, 12f)
                lineTo(18.65f, 12f)
                arcToRelative(15.71f, 15.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, -5.86f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.15f, 5f)
                lineTo(8.82f, 5f)
                lineTo(8.11f, 2.31f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.1f, 3.9f)
                lineTo(2.39f, 5f)
                lineTo(1f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7f)
                lineTo(11.15f, 7f)
                arcToRelative(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.91f, 0.69f)
                arcToRelative(13.41f, 13.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.39f, 4.32f)
                horizontalLineToRelative(-0.82f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.69f, 0.5f)
                lineToRelative(-1.98f, 1.32f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.4f, 14f)
                lineTo(1f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(11.4f, 16f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.66f, -0.5f)
                lineToRelative(1.98f, -1.32f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.57f, -0.17f)
                lineToRelative(4.37f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, 0.94f)
                arcToRelative(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, 1.91f)
                arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.67f, 22f)
                lineTo(1f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(13.67f, 24f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.95f, -6.3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.99f, 12f)
                close()
                moveTo(4.04f, 3.39f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.14f, -0.56f)
                lineTo(6.75f, 5f)
                lineTo(4.46f, 5f)
                close()
                moveTo(0f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 9f)
                horizontalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(1f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10f)
                close()
                moveTo(4f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                close()
                moveTo(8f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                close()
                moveTo(12f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, -1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.also { _ShipSide = it}
