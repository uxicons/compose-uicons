package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wheelchair: ImageVector? = null

val Icons.Br.Wheelchair: ImageVector
    get() = _Wheelchair ?: UXIcon(name = "Wheelchair") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 3f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
            close()
            moveTo(22.5f, 20f)
            horizontalLineToRelative(-0.98f)
            lineTo(20.4f, 17.2f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.25f, -2.2f)
            lineTo(13.5f, 15f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.5f)
            lineTo(13f, 13f)
            horizontalLineToRelative(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(13f, 10f)
            lineTo(13f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(6f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.61f, 3.37f)
            arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.77f, -6.74f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.69f, -2.92f)
            arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.74f, 18f)
            horizontalLineToRelative(1.4f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, 0.31f)
            lineToRelative(1.5f, 3.74f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 23f)
            horizontalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _Wheelchair = it }
