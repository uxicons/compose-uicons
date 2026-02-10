package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Br.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            curveTo(0.6f, -3.9f, 23.4f, -3.89f, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
            curveToRelative(0.45f, 11.92f, 17.55f, 11.92f, 18f, 0f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            close()
            moveTo(15.5f, 14f)
            horizontalLineToRelative(-7f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.27f, 2.2f)
            arcTo(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcToRelative(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.77f, -2.8f)
            arcTo(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
            close()
            moveTo(8.4f, 11.7f)
            lineToRelative(2f, -1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.4f)
            lineToRelative(-2f, -1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.6f, 8.7f)
            lineTo(7f, 9f)
            lineToRelative(-0.4f, 0.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.8f, 2.4f)
            close()
            moveTo(17.7f, 11.4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.3f, -2.1f)
            lineTo(17f, 9f)
            lineToRelative(0.4f, -0.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.8f, -2.4f)
            lineToRelative(-2f, 1.5f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.4f)
            lineToRelative(2f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.1f, -0.3f)
            close()
        }
    }.also { _LaughSquint = it }
