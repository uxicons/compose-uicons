package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Br.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12.5f, 20.98f)
            lineTo(12.5f, 19.69f)
            arcTo(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.31f, 15.5f)
            lineTo(8.3f, 15.5f)
            arcToRelative(3.14f, 3.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.22f, -0.92f)
            lineTo(3.02f, 11.52f)
            arcTo(8.98f, 8.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.02f, 4.53f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, 0.3f)
            lineTo(14.67f, 4.83f)
            arcTo(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.11f, 6.39f)
            lineTo(13.11f, 7.43f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 1.55f)
            horizontalLineToRelative(0f)
            arcTo(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 10.54f)
            verticalLineToRelative(1.04f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 1.55f)
            horizontalLineToRelative(4.16f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.55f, 1.55f)
            verticalLineToRelative(1.52f)
            arcToRelative(1.55f, 1.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, 1.1f)
            lineToRelative(0.83f, 0.83f)
            arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 20.98f)
            close()
        }
    }.also { _World = it }
