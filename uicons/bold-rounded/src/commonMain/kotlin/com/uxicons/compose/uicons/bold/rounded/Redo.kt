package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Redo: ImageVector? = null

val Icons.Br.Redo: ImageVector
    get() = _Redo ?: UXIcon(name = "Redo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 23.45f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
            verticalLineToRelative(-6f)
            arcToRelative(9.51f, 9.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, -9.5f)
            horizontalLineToRelative(3.66f)
            lineTo(13.16f, 4.77f)
            arcTo(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 3.26f)
            lineToRelative(6.22f, 6.7f)
            arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.98f)
            lineTo(17f, 20.64f)
            arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.84f, -1.51f)
            verticalLineToRelative(-1.68f)
            lineTo(7.5f, 17.45f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 23.45f)
            close()
            moveTo(7.5f, 14.45f)
            horizontalLineToRelative(7.16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
            verticalLineToRelative(1.18f)
            lineTo(21.02f, 11.9f)
            lineTo(16.16f, 6.75f)
            verticalLineToRelative(1.2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
            lineTo(9.5f, 9.45f)
            arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.5f, 6.5f)
            verticalLineToRelative(0f)
            arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 14.45f)
            close()
            moveTo(14.8f, 5.3f)
            lineToRelative(0.01f, 0.01f)
            close()
        }
    }.also { _Redo = it }
