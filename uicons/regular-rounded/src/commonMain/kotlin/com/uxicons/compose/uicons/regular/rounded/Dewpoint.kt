package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dewpoint: ImageVector? = null

val Icons.Rr.Dewpoint: ImageVector
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
                moveTo(10.01f, 2f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, 0.8f)
                curveTo(8.16f, 2.9f, 2f, 9.46f, 2f, 14f)
                curveToRelative(-0.12f, 7.01f, 8.78f, 10.69f, 13.66f, 5.66f)
                curveToRelative(6.22f, -6.01f, -1.94f, -14.6f, -3.87f, -16.82f)
                arcTo(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.01f, 2f)
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
