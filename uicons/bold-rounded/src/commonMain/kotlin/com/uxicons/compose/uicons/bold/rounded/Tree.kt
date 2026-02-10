package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Br.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.4f, 16.67f)
            lineToRelative(-0.01f, -0.02f)
            lineToRelative(-1.11f, -1.56f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.47f, -0.64f)
            arcToRelative(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.27f, -3.02f)
            lineTo(17.94f, 9.36f)
            arcToRelative(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.91f)
            arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.22f, -2.89f)
            curveTo(18.43f, 5.5f, 14.2f, 0.99f, 14.2f, 0.99f)
            arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.83f, 0.96f)
            reflectiveCurveToRelative(-4.26f, 4.54f, -4.3f, 4.6f)
            arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.31f, 8.45f)
            arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.76f, 0.92f)
            lineToRelative(-1.53f, 2.1f)
            arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.31f, 14.4f)
            arcToRelative(2.85f, 2.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.68f)
            lineTo(3.6f, 16.67f)
            arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 22f)
            horizontalLineToRelative(4.1f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(13.5f, 22f)
            horizontalLineToRelative(4.1f)
            arcToRelative(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.8f, -5.33f)
            close()
            moveTo(17.95f, 18.79f)
            arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 19f)
            lineTo(6.4f, 19f)
            arcToRelative(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, -0.21f)
            arcToRelative(0.36f, 0.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -0.36f)
            lineTo(7.87f, 16f)
            lineTo(11.5f, 16f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(7.13f, 13f)
            lineToRelative(2.18f, -3f)
            lineTo(10.5f, 10f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(8.27f, 7f)
            lineToRelative(3.72f, -3.99f)
            lineTo(15.73f, 7f)
            horizontalLineToRelative(-0.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.21f, 2.39f)
            lineTo(16.89f, 13f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.11f, 2.37f)
            lineToRelative(2.15f, 3.01f)
            arcTo(0.38f, 0.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.95f, 18.79f)
            close()
        }
    }.also { _Tree = it }
