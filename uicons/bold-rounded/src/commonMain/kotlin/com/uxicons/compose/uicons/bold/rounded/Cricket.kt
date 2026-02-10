package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cricket: ImageVector? = null

val Icons.Br.Cricket: ImageVector
    get() = _Cricket ?: UXIcon(name = "Cricket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 21f)
            close()
            moveTo(21f, 5.12f)
            lineTo(17.16f, 8.96f)
            horizontalLineToRelative(0f)
            arcToRelative(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.66f, 1.52f)
            arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 0.81f)
            arcTo(3.55f, 3.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15.27f)
            lineTo(8.34f, 22.94f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, 0.99f)
            arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.36f, 24f)
            arcToRelative(5.31f, 5.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.84f, -1.51f)
            arcTo(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 17.66f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -2.0f)
            lineTo(8.73f, 8f)
            arcTo(3.54f, 3.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.7f, 7.32f)
            arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.84f, 0.18f)
            arcToRelative(2.19f, 2.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -0.66f)
            lineTo(18.88f, 3f)
            lineToRelative(-0.44f, -0.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.56f, 0.44f)
            lineToRelative(3f, 3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            close()
            moveTo(13.03f, 14f)
            curveToRelative(-0.6f, 0f, -1.24f, 0f, -1.6f, 0f)
            curveTo(11f, 14f, 10f, 14f, 10f, 12.67f)
            verticalLineToRelative(-1.7f)
            lineTo(3.19f, 17.79f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, 0.3f)
            arcToRelative(2.65f, 2.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.59f, 2.28f)
            arcToRelative(2.64f, 2.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 0.59f)
            arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, -0.14f)
            close()
        }
    }.also { _Cricket = it }
