package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FieldHockey: ImageVector? = null

val Icons.Bs.FieldHockey: ImageVector
    get() = _FieldHockey ?: UXIcon(name = "FieldHockey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.67f, 0.02f)
                lineTo(9.82f, 15.45f)
                arcToRelative(0.95f, 0.95f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.73f, -0.79f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.82f, 11.33f)
                arcTo(8.95f, 8.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 17.1f, 18.77f)
                lineTo(23.95f, 3.36f)
                close()
                moveTo(18.18f, 4.02f)
                lineTo(20f, 4.85f)
                lineToRelative(-2.33f, 5.26f)
                lineToRelative(-1.82f, -0.83f)
                close()
                moveTo(14.37f, 17.54f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 12.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.82f, 0.83f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.19f, 3.27f)
                lineToRelative(2.08f, -4.67f)
                lineToRelative(1.82f, 0.83f)
                close()
                moveTo(24f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21f)
                close()
            }
        }.also { _FieldHockey = it}
