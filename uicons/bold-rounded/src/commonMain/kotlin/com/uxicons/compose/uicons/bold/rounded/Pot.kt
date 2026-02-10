package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pot: ImageVector? = null

val Icons.Br.Pot: ImageVector
    get() = _Pot ?: UXIcon(name = "Pot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 5f)
            horizontalLineToRelative(-9f)
            verticalLineTo(3f)
            horizontalLineToRelative(1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(1f)
            verticalLineTo(5f)
            horizontalLineToRelative(-9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(2f)
            verticalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 24f)
            horizontalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(19f, 18.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 21f)
            horizontalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18.5f)
            verticalLineTo(8f)
            horizontalLineTo(19f)
            close()
        }
    }.also { _Pot = it }
