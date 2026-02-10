package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Rs.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 18f)
                curveToRelative(-1.99f, 0f, -4f, -3.44f, -4f, -10f)
                horizontalLineToRelative(2f)
                lineTo(17f, 6f)
                lineTo(15.44f, 6f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, 2f)
                lineTo(7f, 6f)
                lineTo(7f, 8f)
                lineTo(9f, 8f)
                curveToRelative(0f, 6.57f, -2.01f, 10f, -4f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(22f, 24f)
                lineTo(22f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                close()
                moveTo(10f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.47f, 0.89f, 7.96f, 2.41f, 10f)
                lineTo(8.59f, 18f)
                curveTo(10.11f, 15.96f, 11f, 12.47f, 11f, 8f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
        }.also { _ChessPawnAlt = it}
