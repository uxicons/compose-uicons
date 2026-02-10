package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Br.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 0f)
            horizontalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 24f)
            horizontalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18.5f)
            verticalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 0f)
            close()
            moveTo(19f, 18f)
            horizontalLineTo(13f)
            verticalLineToRelative(1f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            horizontalLineToRelative(0f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            verticalLineTo(18f)
            horizontalLineTo(5f)
            verticalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 3f)
            horizontalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 5.5f)
            close()
        }
    }.also { _Tablet = it }
