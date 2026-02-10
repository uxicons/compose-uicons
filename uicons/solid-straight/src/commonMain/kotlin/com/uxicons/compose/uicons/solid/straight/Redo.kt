package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Ss.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.01f, 24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(16f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                lineToRelative(4.84f, -0.15f)
                verticalLineTo(0.43f)
                lineToRelative(9.29f, 9.29f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.24f)
                lineTo(13.85f, 23.26f)
                verticalLineTo(16.85f)
                lineTo(9f, 17f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.01f, 24f)
                close()
            }
        }.also { _Redo = it}
