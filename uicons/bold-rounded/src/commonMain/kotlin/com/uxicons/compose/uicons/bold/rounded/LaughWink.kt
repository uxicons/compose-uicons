package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughWink: ImageVector? = null

val Icons.Br.LaughWink: ImageVector
    get() = _LaughWink ?: UXIcon(name = "LaughWink") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 7f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9.67f)
            curveTo(18f, 11f, 16.88f, 11f, 15.5f, 11f)
            reflectiveCurveTo(13f, 11f, 13f, 9.67f)
            arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 7f)
            close()
            moveTo(24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
            close()
            moveTo(21f, 12f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, 9f)
            curveTo(0.08f, 20.55f, 0.08f, 3.45f, 12f, 3f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
            close()
            moveTo(11f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 8f)
            horizontalLineToRelative(-2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9.5f)
            close()
            moveTo(15.46f, 14f)
            horizontalLineToRelative(-7f)
            arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.2f, 16.2f)
            arcTo(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.96f, 19f)
            arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.77f, -2.8f)
            arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.46f, 14f)
            close()
        }
    }.also { _LaughWink = it }
