package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camping: ImageVector? = null

val Icons.Br.Camping: ImageVector
    get() = _Camping ?: UXIcon(name = "Camping") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.32f, 23.98f)
            lineTo(18.68f, 23.98f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.8f, -7.59f)
            lineToRelative(-6.66f, -13.3f)
            arcTo(5.27f, 5.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.02f)
            horizontalLineToRelative(0f)
            arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 3.05f)
            lineTo(0.5f, 16.43f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, 7.55f)
            close()
            moveTo(3.21f, 17.72f)
            lineTo(9.9f, 4.36f)
            arcToRelative(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.22f, 0.04f)
            lineToRelative(6.66f, 13.3f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.1f, 3.28f)
            lineTo(16.66f, 20.98f)
            lineToRelative(-2.95f, -5.89f)
            arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 0f)
            lineToRelative(-2.95f, 5.9f)
            lineTo(5.32f, 20.99f)
            arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.11f, -3.27f)
            close()
        }
    }.also { _Camping = it }
