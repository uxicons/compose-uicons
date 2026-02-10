package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Bs.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23f)
                lineTo(2f, 23f)
                lineTo(2f, 10.35f)
                curveTo(-1.95f, 7.35f, 0.47f, 0.91f, 5.32f, 1f)
                lineTo(18.68f, 1f)
                curveTo(23.54f, 0.91f, 25.95f, 7.35f, 22f, 10.35f)
                close()
                moveTo(5f, 20f)
                lineTo(19f, 20f)
                lineTo(19f, 8.7f)
                lineToRelative(0.74f, -0.43f)
                arcTo(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.68f, 4f)
                lineTo(5.32f, 4f)
                arcTo(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.25f, 8.27f)
                lineTo(5f, 8.7f)
                close()
                moveTo(8.5f, 10f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 10f)
                close()
                moveTo(13.5f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15f)
                close()
                moveTo(8.5f, 15f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 15f)
                close()
            }
        }.also { _BreadSlice = it}
