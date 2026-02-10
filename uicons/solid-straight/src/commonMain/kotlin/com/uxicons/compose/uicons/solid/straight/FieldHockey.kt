package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FieldHockey: ImageVector? = null

val Icons.Ss.FieldHockey: ImageVector
    get() = _FieldHockey ?: UXIcon(name = "FieldHockey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.96f, 8.8f)
                lineTo(19.74f, 0.01f)
                lineTo(24f, 2.63f)
                lineTo(18.12f, 11.56f)
                close()
                moveTo(12.86f, 10.47f)
                lineTo(7.7f, 18.31f)
                arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.49f, -1.53f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.96f, 14.15f)
                arcToRelative(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6.78f)
                lineToRelative(5.07f, -7.7f)
                close()
                moveTo(24f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20.5f, 24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
                close()
            }
        }.also { _FieldHockey = it}
