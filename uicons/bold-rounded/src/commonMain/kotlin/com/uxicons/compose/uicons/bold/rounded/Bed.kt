package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bed: ImageVector? = null

val Icons.Br.Bed: ImageVector
    get() = _Bed ?: UXIcon(name = "Bed") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 6f)
            horizontalLineToRelative(-5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.5f)
            verticalLineTo(14f)
            horizontalLineTo(3f)
            verticalLineTo(3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(19f)
            horizontalLineTo(21f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-10f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 6f)
            close()
            moveTo(21f, 14f)
            horizontalLineTo(13f)
            verticalLineTo(10.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 9f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.5f)
            close()
            moveTo(6.5f, 14f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 11.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 14f)
            close()
        }
    }.also { _Bed = it }
