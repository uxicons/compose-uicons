package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarker: ImageVector? = null

val Icons.Br.MapMarker: ImageVector
    get() = _MapMarker ?: UXIcon(name = "MapMarker") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 8f)
            close()
            moveTo(24f, 13.37f)
            verticalLineToRelative(5.15f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, 3.59f)
            arcToRelative(4.25f, 4.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.67f, 0.77f)
            curveToRelative(-0.04f, -0.01f, -2.33f, -0.82f, -2.33f, -0.82f)
            arcToRelative(2.11f, 2.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 0.01f)
            lineToRelative(-5.5f, 1.71f)
            arcTo(5.28f, 5.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.14f, 24f)
            arcToRelative(5.1f, 5.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -0.26f)
            lineToRelative(-2.74f, -0.9f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 17.58f)
            lineTo(0f, 13.5f)
            arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.71f, 9.46f)
            arcTo(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.01f, 8.2f)
            arcTo(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.34f, 2.37f)
            arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.33f, 0f)
            arcToRelative(8.09f, 8.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.33f, 5.65f)
            lineToRelative(0.47f, 0.16f)
            arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.37f)
            close()
            moveTo(8.47f, 11.68f)
            lineTo(11.76f, 14.9f)
            arcToRelative(0.34f, 0.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, 0f)
            lineToRelative(3.3f, -3.23f)
            arcToRelative(5.13f, 5.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -7.18f)
            horizontalLineToRelative(0f)
            arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.06f, 0f)
            arcTo(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.47f, 11.68f)
            close()
            moveTo(21f, 13.37f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, -2.36f)
            arcToRelative(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.78f, 2.77f)
            lineToRelative(-3.31f, 3.25f)
            arcToRelative(3.32f, 3.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.68f, 0f)
            lineTo(6.36f, 13.81f)
            arcTo(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, 11.13f)
            arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.82f, 0.51f)
            arcTo(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13.5f)
            verticalLineToRelative(4.08f)
            arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.7f, 2.41f)
            lineToRelative(2.78f, 0.91f)
            arcToRelative(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, 0.02f)
            lineToRelative(5.51f, -1.71f)
            arcToRelative(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.94f, 0.01f)
            lineTo(19.38f, 20f)
            arcToRelative(1.26f, 1.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.04f, -0.25f)
            arcTo(1.53f, 1.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.52f)
            close()
        }
    }.also { _MapMarker = it }
