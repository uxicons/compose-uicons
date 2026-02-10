package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sauce: ImageVector? = null

val Icons.Bs.Sauce: ImageVector
    get() = _Sauce ?: UXIcon(name = "Sauce") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8.05f)
                verticalLineTo(5f)
                horizontalLineTo(13.83f)
                lineTo(13f, 0f)
                horizontalLineTo(11f)
                lineToRelative(-0.83f, 5f)
                horizontalLineTo(7f)
                verticalLineTo(8.05f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 11.5f)
                verticalLineTo(24f)
                horizontalLineTo(20f)
                verticalLineTo(11.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 8.05f)
                close()
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
                moveTo(8.97f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Sauce = it}
