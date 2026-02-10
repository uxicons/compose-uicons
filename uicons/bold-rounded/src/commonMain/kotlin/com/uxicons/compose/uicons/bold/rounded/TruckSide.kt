package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckSide: ImageVector? = null

val Icons.Br.TruckSide: ImageVector
    get() = _TruckSide ?: UXIcon(name = "TruckSide") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.68f, 5f)
            lineTo(16.82f, 5f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.13f, -4f)
            lineTo(5.32f, 1f)
            arcTo(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.32f)
            verticalLineToRelative(9.32f)
            arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.02f, 4.13f)
            curveTo(3.01f, 19.84f, 3f, 19.92f, 3f, 20f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            horizontalLineToRelative(6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
            curveToRelative(0f, -0.08f, -0.01f, -0.15f, -0.02f, -0.23f)
            arcTo(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15.64f)
            lineTo(24f, 10.27f)
            arcTo(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.68f, 5f)
            close()
            moveTo(21f, 10.27f)
            lineTo(21f, 11f)
            lineTo(17f, 11f)
            lineTo(17f, 8f)
            horizontalLineToRelative(1.68f)
            arcTo(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.27f)
            close()
            moveTo(4.36f, 17f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15.64f)
            lineTo(3f, 6.32f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.32f, 4f)
            horizontalLineToRelative(6.36f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 6.32f)
            lineTo(14f, 17f)
            close()
            moveTo(19.64f, 17f)
            lineTo(17f, 17f)
            lineTo(17f, 14f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.64f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.64f, 17f)
            close()
        }
    }.also { _TruckSide = it }
