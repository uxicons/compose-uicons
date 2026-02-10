package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Poo: ImageVector? = null

val Icons.Ss.Poo: ImageVector
    get() = _Poo ?: UXIcon(name = "Poo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.11f, 14.48f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.46f, -6.12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 4f)
                lineTo(15.86f, 4f)
                curveTo(15.37f, 2.13f, 13.69f, 0f, 12f, 0f)
                arcToRelative(5.42f, 5.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 4f)
                lineTo(7f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.34f, 8.37f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.46f, 6.12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                lineTo(19f, 24f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.11f, 14.48f)
                close()
                moveTo(14.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 11f)
                close()
                moveTo(9.5f, 11f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 11f)
                close()
                moveTo(12f, 19f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -2.25f)
                lineToRelative(1.33f, -1.49f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.67f, 0f)
                lineToRelative(1.33f, 1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                close()
            }
        }.also { _Poo = it}
