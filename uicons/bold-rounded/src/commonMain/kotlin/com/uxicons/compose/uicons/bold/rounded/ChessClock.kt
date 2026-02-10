package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClock: ImageVector? = null

val Icons.Br.ChessClock: ImageVector
    get() = _ChessClock ?: UXIcon(name = "ChessClock") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.66f, 5.44f)
            arcTo(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 3f)
            horizontalLineToRelative(-4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4.5f)
            arcToRelative(1.48f, 1.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 0.5f)
            lineTo(8f, 5f)
            lineTo(8f, 3f)
            horizontalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(5f, 3f)
            lineTo(5f, 5.03f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 10.5f)
            verticalLineToRelative(6f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.89f)
            lineTo(3f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(6f, 22f)
            lineTo(18f, 22f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(21f, 21.39f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineToRelative(-6f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.66f, 5.44f)
            close()
            moveTo(21f, 16.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 19f)
            lineTo(5.5f, 19f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.5f)
            verticalLineToRelative(-6f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 8f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10.5f)
            close()
            moveTo(8.22f, 13.9f)
            lineToRelative(1.94f, 0.97f)
            arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 0.69f)
            arcTo(3.47f, 3.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.86f, -5.49f)
            arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.17f, 0.68f)
            lineToRelative(-1.98f, 0.99f)
            arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.22f, 13.9f)
            close()
            moveTo(19.94f, 14.13f)
            arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.6f, 0.36f)
            lineToRelative(-2.1f, -0.7f)
            arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.51f, 0.51f)
            lineToRelative(0.69f, 2.05f)
            arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, 0.6f)
            arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.04f, -3.44f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.93f, 0.61f)
            close()
        }
    }.also { _ChessClock = it }
