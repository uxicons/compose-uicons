package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Info: ImageVector? = null

val Icons.Br.Info: ImageVector
    get() = _Info ?: UXIcon(name = "Info") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, -9f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.54f, 9.54f)
            horizontalLineToRelative(-0.3f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.64f, 10.94f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12.53f)
            verticalLineToRelative(4.65f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(12f)
            arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.54f, 9.54f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.83f, 8.47f)
            arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.11f, 6.75f)
            arcTo(1.72f, 1.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.83f, 8.47f)
            close()
        }
    }.also { _Info = it }
