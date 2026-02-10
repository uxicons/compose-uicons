package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Biking: ImageVector? = null

val Icons.Br.Biking: ImageVector
    get() = _Biking ?: UXIcon(name = "Biking") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 23f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9f, 18.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 23f)
            close()
            moveTo(4.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 17f)
            close()
            moveTo(19.5f, 23f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 18.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 23f)
            close()
            moveTo(19.5f, 17f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 18.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 17f)
            close()
            moveTo(13.5f, 19.5f)
            lineTo(13.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -1.23f)
            lineToRelative(-2.72f, -1.91f)
            arcTo(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.53f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, -0.38f)
            curveToRelative(0.03f, -0.03f, 1.88f, -2.05f, 1.88f, -2.05f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, 0.05f)
            curveToRelative(0.03f, 0.03f, 2.81f, 2.48f, 2.81f, 2.48f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 12f)
            horizontalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(17.07f, 9f)
            lineTo(14.8f, 7f)
            arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, -0.09f)
            curveToRelative(-0.03f, 0.03f, -1.91f, 2.07f, -1.91f, 2.07f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, 5.19f)
            curveToRelative(0.04f, 0.03f, 2.28f, 1.61f, 2.28f, 1.61f)
            lineTo(10.5f, 19.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            close()
            moveTo(16.5f, 1f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 3.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 1f)
            close()
        }
    }.also { _Biking = it }
