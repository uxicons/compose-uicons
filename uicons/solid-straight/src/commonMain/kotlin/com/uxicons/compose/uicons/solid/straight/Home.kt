package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Ss.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(7.03f)
                horizontalLineToRelative(6f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.34f, 0.83f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
                lineTo(0f, 10.43f)
                verticalLineToRelative(10.4f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, 3.2f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                verticalLineToRelative(7.03f)
                horizontalLineToRelative(3.8f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.2f, -3.2f)
                verticalLineToRelative(-10.4f)
                close()
            }
        }.also { _Home = it}
