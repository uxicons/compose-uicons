package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPieAlt: ImageVector? = null

val Icons.Br.ChartPieAlt: ImageVector
    get() = _ChartPieAlt ?: UXIcon(name = "ChartPieAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.56f, 11.38f)
            lineTo(14.01f, 11.38f)
            arcToRelative(1.39f, 1.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.39f, -1.39f)
            lineTo(12.62f, 5.43f)
            arcToRelative(3.43f, 3.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, -2.72f)
            arcTo(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.44f, 2.1f)
            arcTo(11.11f, 11.11f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21.9f, 15.58f)
            arcToRelative(3.31f, 3.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -2.86f)
            arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.56f, 11.38f)
            close()
            moveTo(18.99f, 14.84f)
            arcTo(8.12f, 8.12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.17f, 5.01f)
            arcTo(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.24f, 5f)
            arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.2f, 0.08f)
            arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.18f, 0.36f)
            lineTo(9.62f, 9.99f)
            arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.39f, 4.39f)
            horizontalLineToRelative(4.54f)
            arcToRelative(0.47f, 0.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, 0.18f)
            arcTo(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.99f, 14.84f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.65f, 7.45f)
            arcTo(10.07f, 10.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.58f, 0.37f)
            arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.02f, 2.3f)
            verticalLineTo(7f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
            horizontalLineToRelative(4.72f)
            arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.65f, 7.45f)
            close()
        }
    }.also { _ChartPieAlt = it }
