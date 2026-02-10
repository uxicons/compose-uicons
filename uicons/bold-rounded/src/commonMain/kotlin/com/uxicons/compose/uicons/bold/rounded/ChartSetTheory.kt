package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartSetTheory: ImageVector? = null

val Icons.Br.ChartSetTheory: ImageVector
    get() = _ChartSetTheory ?: UXIcon(name = "ChartSetTheory") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.42f, 9.59f)
            arcTo(7.43f, 7.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 8.5f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15f, 0f)
            arcToRelative(7.43f, 7.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 1.09f)
            arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 22.5f)
            arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.42f, -12.9f)
            close()
            moveTo(12f, 4f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 4.5f)
            arcToRelative(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, 0.5f)
            arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.5f)
            arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.53f, 9f)
            arcTo(4.58f, 4.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 8.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
            close()
            moveTo(3f, 16.5f)
            arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.61f, -4.08f)
            arcToRelative(7.55f, 7.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.47f, 2.99f)
            arcTo(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 20.24f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            close()
            moveTo(16.5f, 21f)
            arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, -0.76f)
            arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -4.83f)
            arcToRelative(7.55f, 7.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.47f, -2.99f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 21f)
            close()
        }
    }.also { _ChartSetTheory = it }
