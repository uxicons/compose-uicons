package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Copyright: ImageVector? = null

val Icons.Rr.Copyright: ImageVector
    get() = _Copyright ?: UXIcon(name = "Copyright") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.54f, 8.46f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.95f, 7.05f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 9.9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -7.07f)
                close()
            }
        }.also { _Copyright = it}
