package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HelicopterSide: ImageVector? = null

val Icons.Bs.HelicopterSide: ImageVector
    get() = _HelicopterSide ?: UXIcon(name = "HelicopterSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                lineTo(24f, 1f)
                lineTo(17f, 1f)
                lineTo(17f, 0f)
                lineTo(14f, 0f)
                lineTo(14f, 1f)
                lineTo(7f, 1f)
                lineTo(7f, 4f)
                horizontalLineToRelative(7f)
                lineTo(14f, 6f)
                lineTo(3f, 6f)
                lineTo(3f, 4f)
                lineTo(0f, 4f)
                verticalLineToRelative(7.13f)
                lineToRelative(7.03f, 2.01f)
                arcTo(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.5f)
                lineTo(11f, 21f)
                lineTo(7f, 21f)
                verticalLineToRelative(3f)
                lineTo(20.5f, 24f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
                lineTo(24f, 20f)
                lineTo(21f, 20f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                lineTo(19f, 21f)
                lineTo(19f, 19f)
                horizontalLineToRelative(0.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.5f)
                arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -8.36f)
                lineTo(17f, 4f)
                close()
                moveTo(16f, 21f)
                lineTo(14f, 21f)
                lineTo(14f, 19f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19.5f, 16f)
                horizontalLineToRelative(-6f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12.5f)
                lineTo(10f, 10.87f)
                lineTo(3.46f, 9f)
                lineTo(14f, 9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.97f)
                curveToRelative(0.01f, 0.16f, 0.03f, 0.33f, 0.03f, 0.49f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 16f)
                close()
            }
        }.also { _HelicopterSide = it}
