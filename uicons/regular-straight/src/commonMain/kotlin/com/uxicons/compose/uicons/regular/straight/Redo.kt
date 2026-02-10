package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Rs.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.01f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(0.01f, 16f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                lineToRelative(4.84f, -0.15f)
                lineTo(13.84f, 0.43f)
                lineToRelative(9.29f, 9.29f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineTo(13.85f, 23.26f)
                lineTo(13.85f, 16.85f)
                lineTo(9f, 17f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.01f, 24f)
                close()
                moveTo(9.01f, 15f)
                lineTo(15.85f, 14.85f)
                verticalLineToRelative(3.59f)
                lineToRelative(5.87f, -5.88f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
                lineTo(15.84f, 5.26f)
                lineTo(15.84f, 8.85f)
                lineTo(9f, 9f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, 7f)
                verticalLineToRelative(2.35f)
                arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                close()
            }
        }.also { _Redo = it}
