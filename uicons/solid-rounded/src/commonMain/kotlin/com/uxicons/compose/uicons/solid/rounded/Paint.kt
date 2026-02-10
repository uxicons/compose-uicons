package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paint: ImageVector? = null

val Icons.Sr.Paint: ImageVector
    get() = _Paint ?: UXIcon(name = "Paint") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.75f, 24f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.72f, -3.15f)
                curveToRelative(0.26f, -1.81f, 1.13f, -5.13f, 2.37f, -6.37f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 7.12f)
                curveToRelative(-1.24f, 1.24f, -4.57f, 2.11f, -6.37f, 2.37f)
                arcToRelative(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.4f, 0.03f)
                close()
                moveTo(23.1f, 0.9f)
                arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.33f, 0f)
                lineToRelative(-10.5f, 10.5f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.33f, 4.34f)
                lineToRelative(10.5f, -10.51f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.33f)
                close()
            }
        }.also { _Paint = it}
