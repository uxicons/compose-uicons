package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawnAlt: ImageVector? = null

val Icons.Bs.ChessPawnAlt: ImageVector
    get() = _ChessPawnAlt ?: UXIcon(name = "ChessPawnAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 19f)
                curveToRelative(-0.75f, 0f, -2.22f, -2.25f, -2.46f, -9f)
                lineTo(18f, 10f)
                lineTo(18f, 7f)
                lineTo(16.58f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.42f, 7f)
                lineTo(6f, 7f)
                verticalLineToRelative(3f)
                lineTo(7.96f, 10f)
                curveTo(7.72f, 16.75f, 6.25f, 19f, 5.5f, 19f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22.5f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 22.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 19f)
                close()
                moveTo(12f, 3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(10.97f, 10f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.11f, 3.3f, 0.54f, 6.67f, 1.61f, 9f)
                lineTo(9.36f, 19f)
                curveTo(10.43f, 16.67f, 10.85f, 13.3f, 10.97f, 10f)
                close()
            }
        }.also { _ChessPawnAlt = it}
