package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClock: ImageVector? = null

val Icons.Rs.ChessClock: ImageVector
    get() = _ChessClock ?: UXIcon(name = "ChessClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
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
                lineTo(0f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(2f)
                lineTo(4f, 24f)
                lineTo(4f, 22f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(22f, 22f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                lineTo(2f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                lineTo(21f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(7.5f, 9f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 13.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 9f)
                close()
                moveTo(7.5f, 16f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.26f, -3.55f)
                lineTo(7.5f, 13.5f)
                lineToRelative(2.24f, 1.09f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 16f)
                close()
                moveTo(16.5f, 9f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21f, 13.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                close()
                moveTo(14f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.12f, 0.73f)
                lineToRelative(-2.37f, -0.74f)
                lineToRelative(0.69f, 2.4f)
                arcToRelative(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 0.11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13.5f)
                close()
            }
        }.also { _ChessClock = it}
