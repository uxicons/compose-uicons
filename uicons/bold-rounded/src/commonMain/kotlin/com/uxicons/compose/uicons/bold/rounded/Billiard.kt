package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Billiard: ImageVector? = null

val Icons.Br.Billiard: ImageVector
    get() = _Billiard ?: UXIcon(name = "Billiard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 6f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 6f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -6f)
            close()
            moveTo(14.79f, 11.27f)
            lineTo(12.79f, 15.27f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.57f, -1.54f)
            lineToRelative(0.79f, -1.73f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, 2.27f)
            close()
            moveTo(12f, 24f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
            arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
            close()
        }
    }.also { _Billiard = it }
