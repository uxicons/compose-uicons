package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClock: ImageVector? = null

val Icons.Ss.ChessClock: ImageVector
    get() = _ChessClock ?: UXIcon(name = "ChessClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                lineTo(21f, 3f)
                lineTo(15f, 3f)
                lineTo(15f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 3f)
                lineTo(9f, 3f)
                lineTo(9f, 1f)
                lineTo(3f, 1f)
                lineTo(3f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 5f)
                lineTo(3f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                lineTo(0f, 21f)
                lineTo(2f, 21f)
                verticalLineToRelative(2f)
                lineTo(4f, 23f)
                lineTo(4f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(22f, 21f)
                horizontalLineToRelative(2f)
                lineTo(24f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 5f)
                close()
                moveTo(10.84f, 14.48f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.02f, -1.89f)
                lineTo(8f, 13.54f)
                close()
                moveTo(19.52f, 15.23f)
                lineTo(17f, 14f)
                lineToRelative(1.17f, 2.56f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 13.5f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.52f, 15.23f)
                close()
            }
        }.also { _ChessClock = it}
