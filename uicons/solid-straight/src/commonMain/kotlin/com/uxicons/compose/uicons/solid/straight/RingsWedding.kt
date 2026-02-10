package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingsWedding: ImageVector? = null

val Icons.Ss.RingsWedding: ImageVector
    get() = _RingsWedding ?: UXIcon(name = "RingsWedding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                arcToRelative(7.97f, 7.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.97f, 2.7f)
                arcToRelative(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -0.52f)
                lineTo(10.22f, 6.8f)
                lineTo(8.41f, 5f)
                lineTo(5.59f, 5f)
                lineToRelative(-1.8f, 1.8f)
                lineToRelative(1.69f, 3.37f)
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
                moveTo(10.42f, 4f)
                lineTo(9f, 2.58f)
                lineTo(11.29f, 0.29f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(3.54f, 3.96f)
                lineToRelative(-2.25f, -2.25f)
                lineTo(2.71f, 0.29f)
                lineToRelative(2.25f, 2.25f)
                close()
                moveTo(8f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 0f)
                lineTo(8f, 0f)
                close()
            }
        }.also { _RingsWedding = it}
