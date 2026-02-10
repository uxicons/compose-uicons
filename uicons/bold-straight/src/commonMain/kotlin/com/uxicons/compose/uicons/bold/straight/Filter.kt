package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filter: ImageVector? = null

val Icons.Bs.Filter: ImageVector
    get() = _Filter ?: UXIcon(name = "Filter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24.02f)
                lineToRelative(-8f, -4.8f)
                verticalLineToRelative(-4.69f)
                lineToRelative(-7f, -8.5f)
                verticalLineToRelative(-2.54f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                verticalLineToRelative(2.54f)
                lineToRelative(-7f, 8.5f)
                close()
                moveTo(11f, 17.52f)
                lineTo(13f, 18.72f)
                verticalLineToRelative(-5.26f)
                lineToRelative(7f, -8.5f)
                verticalLineToRelative(-1.46f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(1.46f)
                lineToRelative(7f, 8.5f)
                close()
            }
        }.also { _Filter = it}
