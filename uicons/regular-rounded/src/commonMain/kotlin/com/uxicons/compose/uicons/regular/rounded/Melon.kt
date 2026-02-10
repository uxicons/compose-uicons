package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Melon: ImageVector? = null

val Icons.Rr.Melon: ImageVector
    get() = _Melon ?: UXIcon(name = "Melon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 2.32f)
                arcTo(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 1.27f)
                lineTo(1.27f, 15.5f)
                arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, 19.24f)
                curveToRelative(0.72f, 3.92f, 5.82f, 4.61f, 9.04f, 4.76f)
                curveTo(19.98f, 24.16f, 27.52f, 12.05f, 22.37f, 2.32f)
                close()
                moveTo(12.42f, 12.42f)
                arcToRelative(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.24f, 0.99f)
                lineToRelative(7.23f, -7.23f)
                arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.42f, 12.42f)
                close()
                moveTo(18.22f, 18.22f)
                arcTo(12.87f, 12.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.23f, 20.59f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.55f, -3.68f)
                lineToRelative(2.04f, -2.04f)
                curveToRelative(6.56f, 4.13f, 14.25f, -3.62f, 10.16f, -10.16f)
                lineToRelative(2.03f, -2.03f)
                arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.68f, 0.55f)
                arcTo(12.87f, 12.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.22f, 18.22f)
                close()
            }
        }.also { _Melon = it}
