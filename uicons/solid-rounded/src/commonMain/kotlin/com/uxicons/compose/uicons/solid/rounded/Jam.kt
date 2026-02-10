package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jam: ImageVector? = null

val Icons.Sr.Jam: ImageVector
    get() = _Jam ?: UXIcon(name = "Jam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -0.07f)
                verticalLineTo(18f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 6f)
                horizontalLineTo(8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                verticalLineTo(11.92f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 11.2f)
                arcToRelative(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(6.11f, 6.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcTo(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(20f, 5f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 0f)
                horizontalLineTo(6.5f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-4.97f, 0.85f, -5.25f, 4.95f, -1f, 5f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, -0.83f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 0f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                arcToRelative(4.06f, 4.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.89f, 0f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 0f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 10f)
                curveTo(25.25f, 10.02f, 24.97f, 5.86f, 20f, 5f)
                close()
            }
        }.also { _Jam = it}
