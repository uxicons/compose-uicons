package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Bs.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.54f, 9.54f)
                lineTo(14f, 13.07f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.18f, -2.06f)
                lineToRelative(3.59f, -3.59f)
                close()
                moveTo(24f, 13f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, 9.71f)
                lineTo(18.64f, 23f)
                lineTo(5.36f, 23f)
                lineToRelative(-0.39f, -0.29f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.35f, 20f)
                lineTo(17.65f, 20f)
                arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                close()
            }
        }.also { _Tachometer = it}
