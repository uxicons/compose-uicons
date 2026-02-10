package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClock: ImageVector? = null

val Icons.Bs.ChessClock: ImageVector
    get() = _ChessClock ?: UXIcon(name = "ChessClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 5f)
                lineTo(20f, 5f)
                lineTo(20f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 5f)
                lineTo(8f, 5f)
                lineTo(8f, 3f)
                horizontalLineToRelative(2f)
                lineTo(10f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 5f)
                lineTo(3.5f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.5f)
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                lineTo(5f, 24f)
                lineTo(5f, 22f)
                lineTo(19f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                close()
                moveTo(3f, 8.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 8f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(21f, 19f)
                lineTo(3f, 19f)
                close()
                moveTo(10.87f, 12.59f)
                lineTo(8.96f, 13.54f)
                lineTo(10.84f, 14.48f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.02f, -1.89f)
                close()
                moveTo(20f, 13.5f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.48f, 1.73f)
                lineTo(17.5f, 14.56f)
                lineToRelative(0.67f, 2f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 13.5f)
                close()
            }
        }.also { _ChessClock = it}
