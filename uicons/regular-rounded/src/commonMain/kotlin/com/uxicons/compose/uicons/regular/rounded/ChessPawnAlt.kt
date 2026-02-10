package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Rr.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.05f, 18f)
                lineTo(19f, 18f)
                curveToRelative(-1.99f, 0f, -4f, -3.44f, -4f, -10f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.54f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.54f, 6f)
                lineTo(8f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(9f, 8f)
                curveToRelative(0f, 6.57f, -2.01f, 10f, -4f, 10f)
                lineTo(4.95f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 24f)
                lineTo(19f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, -6f)
                close()
                moveTo(12f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.46f, 0.88f, 7.96f, 2.4f, 10f)
                lineTo(8.6f, 18f)
                curveTo(10.12f, 15.96f, 11f, 12.46f, 11f, 8f)
                close()
                moveTo(19f, 22f)
                lineTo(5f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(19f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _ChessPawnAlt = it}
