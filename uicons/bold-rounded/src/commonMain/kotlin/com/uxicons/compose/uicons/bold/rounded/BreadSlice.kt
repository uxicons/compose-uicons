package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Br.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 11.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.5f)
            close()
            moveTo(13.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15f)
            close()
            moveTo(8.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 15f)
            close()
            moveTo(22f, 17.51f)
            lineTo(22f, 10.35f)
            arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, -5.33f)
            horizontalLineToRelative(0f)
            arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.54f, 1f)
            lineTo(5.46f, 1f)
            arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 5.02f)
            arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 10.35f)
            verticalLineToRelative(7.15f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 23f)
            lineTo(16.5f, 23f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17.51f)
            close()
            moveTo(18.54f, 4f)
            arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, 1.73f)
            arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, 2.54f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 9.57f)
            verticalLineToRelative(7.93f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 20f)
            lineTo(7.5f, 20f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17.51f)
            lineTo(5f, 9.57f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, -1.3f)
            arcTo(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.07f, 5.73f)
            arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.46f, 4f)
            close()
        }
    }.also { _BreadSlice = it }
