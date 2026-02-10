package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleCross: ImageVector? = null

val Icons.Rs.CircleCross: ImageVector
    get() = _CircleCross ?: UXIcon(name = "CircleCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.29f, 7.29f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(3.29f, -3.29f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
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
        }.also { _CircleCross = it}
