package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectabgleVertical: ImageVector? = null

val Icons.Sr.RectabgleVertical: ImageVector
    get() = _RectabgleVertical ?: UXIcon(name = "RectabgleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 0f)
                horizontalLineToRelative(-7f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
                verticalLineToRelative(13f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
                horizontalLineToRelative(7f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
                close()
                moveTo(18f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 21f)
                horizontalLineToRelative(-7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
                verticalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
                horizontalLineToRelative(7f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
                close()
            }
        }.also { _RectabgleVertical = it}
