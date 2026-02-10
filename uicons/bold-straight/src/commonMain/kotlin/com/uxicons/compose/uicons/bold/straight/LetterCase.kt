package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Bs.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                verticalLineToRelative(0.42f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -0.42f)
                lineTo(21f, 17f)
                horizontalLineToRelative(3f)
                lineTo(24f, 7f)
                close()
                moveTo(19f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 17f)
                lineTo(3.35f, 17f)
                lineToRelative(1f, -2f)
                horizontalLineToRelative(6.29f)
                lineToRelative(1f, 2f)
                lineTo(15f, 17f)
                lineTo(7.5f, 2f)
                close()
                moveTo(5.85f, 12f)
                lineTo(7.5f, 8.71f)
                lineTo(9.15f, 12f)
                close()
            }
        }.also { _LetterCase = it}
