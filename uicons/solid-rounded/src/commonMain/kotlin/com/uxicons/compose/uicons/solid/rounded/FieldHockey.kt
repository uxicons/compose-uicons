package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FieldHockey: ImageVector? = null

val Icons.Sr.FieldHockey: ImageVector
    get() = _FieldHockey ?: UXIcon(name = "FieldHockey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.16f, 8.83f)
                lineToRelative(5.25f, -7.71f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, -0.75f)
                horizontalLineToRelative(0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.78f, 3.5f)
                lineTo(18.33f, 11.59f)
                close()
                moveTo(13.06f, 10.5f)
                lineTo(7.7f, 18.3f)
                arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.49f, -1.53f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.96f, 14.14f)
                arcToRelative(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.78f)
                lineToRelative(5.28f, -7.67f)
                close()
                moveTo(24f, 20.49f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.49f)
                close()
            }
        }.also { _FieldHockey = it}
