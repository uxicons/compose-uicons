package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingsWedding: ImageVector? = null

val Icons.Sr.RingsWedding: ImageVector
    get() = _RingsWedding ?: UXIcon(name = "RingsWedding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.97f, 2.7f)
                arcToRelative(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -0.52f)
                lineTo(9.9f, 7.45f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, -0.97f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.15f, 6.48f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.04f, 0.97f)
                lineToRelative(1.36f, 2.73f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.87f, 12.31f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 8f)
                close()
                moveTo(11.23f, 19.63f)
                arcToRelative(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, -6.14f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, 6.14f)
                close()
                moveTo(2f, 17f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.88f, -4.63f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 8.73f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                close()
                moveTo(16f, 22f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, -0.98f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.7f, 11.83f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 22f)
                close()
                moveTo(10.11f, 3.55f)
                lineToRelative(1f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.79f, 0.89f)
                lineToRelative(-1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, -0.89f)
                close()
                moveTo(1.1f, 2.45f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, 1.55f)
                lineToRelative(1f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, 0.89f)
                close()
                moveTo(6f, 3f)
                lineTo(6f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1f)
                lineTo(8f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                close()
            }
        }.also { _RingsWedding = it}
