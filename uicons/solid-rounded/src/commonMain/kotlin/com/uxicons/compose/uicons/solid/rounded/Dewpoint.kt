package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Sr.Dewpoint: ImageVector
    get() = _Dewpoint ?: UXIcon(name = "Dewpoint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                arcTo(10.05f, 10.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14f)
                curveTo(0f, 8.66f, 6.5f, 1.75f, 6.77f, 1.46f)
                arcTo(4.29f, 4.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.01f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(4.31f, 4.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.27f, 1.5f)
                curveToRelative(2.77f, 3.02f, 11f, 12.49f, 3.8f, 19.57f)
                arcTo(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 24f)
                close()
                moveTo(21f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                close()
                moveTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 2f)
                close()
            }
        }.also { _Dewpoint = it}
