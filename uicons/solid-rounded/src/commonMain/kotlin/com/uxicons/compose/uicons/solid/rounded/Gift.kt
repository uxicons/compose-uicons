package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gift: ImageVector? = null

val Icons.Sr.Gift: ImageVector
    get() = _Gift ?: UXIcon(name = "Gift") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                lineTo(7f, 24f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                close()
                moveTo(24f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(13f, 13f)
                lineTo(13f, 8.96f)
                curveToRelative(-0.34f, 0.03f, -0.67f, 0.04f, -1f, 0.04f)
                reflectiveCurveToRelative(-0.66f, -0.02f, -1f, -0.04f)
                lineTo(11f, 13f)
                lineTo(2f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                lineTo(5.74f, 7f)
                arcTo(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                curveToRelative(0f, 2.62f, 2.37f, 3.53f, 4.17f, 3.84f)
                arcTo(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                arcToRelative(9.33f, 9.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, 3.84f)
                curveTo(15.63f, 6.53f, 18f, 5.62f, 18f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcToRelative(5.14f, 5.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, 4f)
                lineTo(20f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 11f)
                close()
                moveTo(11f, 3f)
                arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3.01f)
                arcTo(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(22f, 15f)
                lineTo(13f, 15f)
                close()
            }
        }.also { _Gift = it}
