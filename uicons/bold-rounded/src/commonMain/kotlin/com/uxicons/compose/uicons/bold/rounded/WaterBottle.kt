package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaterBottle: ImageVector? = null

val Icons.Br.WaterBottle: ImageVector
    get() = _WaterBottle ?: UXIcon(name = "WaterBottle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 10.71f)
            arcToRelative(3.83f, 3.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -2.57f)
            arcToRelative(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.51f, -3.62f)
            lineTo(16f, 3.96f)
            verticalLineTo(2.91f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 0f)
            horizontalLineToRelative(-7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 2.91f)
            verticalLineTo(3.96f)
            lineToRelative(-1.49f, 0.56f)
            arcTo(3.88f, 3.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.14f)
            arcToRelative(3.83f, 3.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.57f)
            arcTo(4.42f, 4.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.17f, 16.5f)
            arcTo(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
            horizontalLineToRelative(7f)
            arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.33f, -7.5f)
            arcTo(4.42f, 4.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10.71f)
            close()
            moveTo(15.5f, 15f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
            moveTo(7.56f, 7.33f)
            lineTo(10.03f, 6.4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 5f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            verticalLineTo(5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.97f, 1.4f)
            lineToRelative(2.47f, 0.93f)
            arcToRelative(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 1.67f)
            horizontalLineTo(7.86f)
            arcToRelative(0.86f, 0.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -1.67f)
            close()
            moveTo(15.5f, 21f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
            close()
        }
    }.also { _WaterBottle = it }
