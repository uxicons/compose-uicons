package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Br.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.7f, 5.13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
            lineToRelative(-4.86f, 9.7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 17f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, -0.83f)
            lineTo(3.44f, 15f)
            horizontalLineTo(9.28f)
            lineToRelative(0.58f, 1.17f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 0.83f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, -2.17f)
            close()
            moveTo(4.93f, 12f)
            lineTo(6.36f, 9.15f)
            lineTo(7.78f, 12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 6.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 0.98f)
            arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
            arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
            arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -0.48f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
            verticalLineTo(8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 6.5f)
            close()
            moveTo(19f, 14f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
            close()
        }
    }.also { _LetterCase = it }
