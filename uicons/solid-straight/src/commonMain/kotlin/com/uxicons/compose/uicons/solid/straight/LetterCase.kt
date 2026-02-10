package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Ss.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                lineTo(22f, 9.03f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.03f)
                lineTo(22f, 18f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                close()
                moveTo(19f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                horizontalLineToRelative(2.24f)
                lineTo(7.12f, 3.76f)
                lineTo(0f, 18f)
                horizontalLineTo(2.24f)
                lineToRelative(2f, -4f)
                horizontalLineTo(10f)
                close()
                moveTo(5.24f, 12f)
                lineTo(7.12f, 8.24f)
                lineTo(9f, 12f)
                close()
            }
        }.also { _LetterCase = it}
