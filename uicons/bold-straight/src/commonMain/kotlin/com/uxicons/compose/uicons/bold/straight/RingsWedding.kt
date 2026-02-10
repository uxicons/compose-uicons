package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingsWedding: ImageVector? = null

val Icons.Bs.RingsWedding: ImageVector
    get() = _RingsWedding ?: UXIcon(name = "RingsWedding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 8f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.09f, 1.83f)
                arcToRelative(7.42f, 7.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.95f, -0.69f)
                lineTo(10.33f, 6.4f)
                lineTo(9f, 5f)
                horizontalLineTo(6f)
                lineTo(4.73f, 6.4f)
                lineTo(6.1f, 9.14f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.58f, 13.59f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 8f)
                close()
                moveTo(3f, 16.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                arcToRelative(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.44f, 0.26f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 8.29f)
                arcTo(4.45f, 4.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 21f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
                close()
                moveTo(16f, 21f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.16f, -0.51f)
                arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, -8.7f)
                arcTo(5.0f, 5.0f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.18f, 2.94f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.29f, 2.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.47f, 2.77f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _RingsWedding = it}
