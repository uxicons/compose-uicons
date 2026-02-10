package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jam: ImageVector? = null

val Icons.Ss.Jam: ImageVector
    get() = _Jam ?: UXIcon(name = "Jam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.38f)
                lineToRelative(-0.25f, 0.28f)
                arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, -0.83f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, 0f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.89f, 0f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, 0f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.89f, 0f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, 0f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10f)
                arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 8.66f)
                lineTo(0f, 8.38f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8.38f)
                close()
                moveTo(21f, 12f)
                arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -0.8f)
                arcToRelative(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                arcToRelative(5.69f, 5.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -0.09f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(11.91f)
                arcTo(5.69f, 5.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                close()
            }
        }.also { _Jam = it}
