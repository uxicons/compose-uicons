package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClockAlt: ImageVector? = null

val Icons.Bs.ChessClockAlt: ImageVector
    get() = _ChessClockAlt ?: UXIcon(name = "ChessClockAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 5f)
                lineTo(19f, 5f)
                lineTo(19f, 3f)
                horizontalLineToRelative(2f)
                lineTo(21f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 3f)
                horizontalLineToRelative(2f)
                lineTo(16f, 5f)
                lineTo(10f, 5f)
                lineTo(10f, 3f)
                lineTo(4f, 3f)
                lineTo(4f, 5f)
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
                moveTo(16.5f, 10f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.34f, 4.48f)
                lineToRelative(1.88f, -0.94f)
                lineToRelative(-1.91f, -0.95f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 10f)
                close()
                moveTo(7.5f, 10f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, -0.44f)
                lineToRelative(0.67f, -2f)
                lineToRelative(-2.02f, 0.67f)
                arcTo(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 10f)
                close()
            }
        }.also { _ChessClockAlt = it}
