package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yen: ImageVector? = null

val Icons.Br.Yen: ImageVector
    get() = _Yen ?: UXIcon(name = "Yen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.41f, 0.31f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.1f, 0.29f)
            lineToRelative(-8.31f, 10.93f)
            lineToRelative(-8.31f, -10.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.39f, 1.82f)
            lineToRelative(8.05f, 10.59f)
            horizontalLineToRelative(-2.86f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-2.86f)
            lineToRelative(8.05f, -10.59f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, -2.1f)
            close()
        }
    }.also { _Yen = it }
