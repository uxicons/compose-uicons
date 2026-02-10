package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OliveOil: ImageVector? = null

val Icons.Sr.OliveOil: ImageVector
    get() = _OliveOil ?: UXIcon(name = "OliveOil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -3.45f)
                lineTo(15f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(8f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 8f)
                curveToRelative(-0.39f, 1.59f, -3.72f, 3.39f, -4.81f, 5f)
                lineTo(17f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 9f)
                close()
                moveTo(15.1f, 8.35f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.54f, 2.53f)
                arcTo(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.1f, 8.35f)
                close()
                moveTo(20.86f, 15f)
                curveToRelative(0.82f, 3.66f, -2.88f, 9.08f, -6.59f, 9f)
                lineTo(9.73f, 24f)
                curveToRelative(-3.71f, 0.08f, -7.4f, -5.33f, -6.59f, -9f)
                close()
            }
        }.also { _OliveOil = it}
