package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dizzy: ImageVector? = null

val Icons.Bs.Dizzy: ImageVector
    get() = _Dizzy ?: UXIcon(name = "Dizzy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 21f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
                curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
                moveTo(14.5f, 16.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 16.5f)
                close()
                moveTo(18.12f, 10f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(16f, 12.12f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(13.88f, 10f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(2.12f, -2.12f)
                lineTo(16f, 7.88f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(9.44f, 13.56f)
                lineTo(8f, 12.12f)
                lineToRelative(-1.44f, 1.44f)
                lineTo(4.44f, 11.44f)
                lineTo(5.88f, 10f)
                lineTo(4.44f, 8.56f)
                lineTo(6.56f, 6.44f)
                lineTo(8f, 7.88f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(2.12f, 2.12f)
                lineTo(10.12f, 10f)
                lineToRelative(1.44f, 1.44f)
                close()
            }
        }.also { _Dizzy = it}
