package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Bs.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 15.5f)
                lineTo(0f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-0.52f)
                lineTo(3f, 23.48f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 17f)
                horizontalLineToRelative(3.33f)
                verticalLineToRelative(5.79f)
                lineToRelative(10.15f, -8.81f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
                lineTo(22.9f, 8.95f)
                lineTo(12.83f, 0.21f)
                lineTo(12.83f, 6f)
                lineTo(9.5f, 6f)
                arcTo(9.51f, 9.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.5f)
                close()
                moveTo(3f, 16.58f)
                lineTo(3f, 15.5f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 9f)
                horizontalLineToRelative(6.33f)
                lineTo(15.83f, 6.79f)
                lineToRelative(5.05f, 4.38f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.66f)
                lineToRelative(-5.05f, 4.38f)
                lineTo(15.83f, 14f)
                lineTo(9.5f, 14f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16.58f)
                close()
            }
        }.also { _Redo = it}
