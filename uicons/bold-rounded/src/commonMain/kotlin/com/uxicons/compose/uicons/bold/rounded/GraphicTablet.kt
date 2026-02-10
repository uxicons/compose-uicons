package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GraphicTablet: ImageVector? = null

val Icons.Br.GraphicTablet: ImageVector
    get() = _GraphicTablet ?: UXIcon(name = "GraphicTablet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineTo(5.5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.5f)
            verticalLineTo(11f)
            horizontalLineTo(2.01f)
            arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 11.99f)
            horizontalLineTo(3f)
            arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.99f, 0.99f)
            horizontalLineTo(0f)
            verticalLineTo(15.5f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(13f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.5f)
            verticalLineToRelative(-7f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 3f)
            close()
            moveTo(21f, 15.5f)
            arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.58f, 18f)
            horizontalLineTo(6.98f)
            verticalLineTo(6f)
            horizontalLineToRelative(11.6f)
            arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8.5f)
            close()
        }
    }.also { _GraphicTablet = it }
