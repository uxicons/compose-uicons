package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Br.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(12f, 21f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9f, -9f)
            curveTo(3.45f, 0.08f, 20.55f, 0.08f, 21f, 12f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
            close()
            moveTo(17.06f, 14.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.1f, 2.14f)
            arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.91f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.1f, -2.14f)
            curveTo(9.44f, 12.4f, 14.59f, 12.41f, 17.06f, 14.93f)
            close()
            moveTo(18f, 8.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1.42f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
            horizontalLineToRelative(-0.5f)
            lineToRelative(0f, -0.02f)
            horizontalLineToRelative(-0.03f)
            curveTo(11.51f, 11.62f, 13.36f, 6.76f, 16.5f, 7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8.5f)
            close()
            moveTo(7f, 9.91f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 7f)
            curveToRelative(3.16f, -0.24f, 4.99f, 4.67f, 2f, 5f)
            lineTo(9f, 12f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9.91f)
            close()
        }
    }.also { _Angry = it }
