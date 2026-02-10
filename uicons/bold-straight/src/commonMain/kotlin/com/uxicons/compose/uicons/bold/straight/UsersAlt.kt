package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersAlt: ImageVector? = null

val Icons.Bs.UsersAlt: ImageVector
    get() = _UsersAlt ?: UXIcon(name = "UsersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 24f)
                lineTo(15f, 24f)
                lineTo(15f, 20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                lineTo(9f, 24f)
                lineTo(6f, 24f)
                lineTo(6f, 20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 17f)
                horizontalLineToRelative(5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20.5f)
                close()
                moveTo(12f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                close()
                moveTo(18f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 7f)
                close()
                moveTo(6f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                close()
                moveTo(8.8f, 8.03f)
                curveTo(8.7f, 8.02f, 8.6f, 8f, 8.5f, 8f)
                horizontalLineToRelative(-5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
                lineTo(0f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                lineTo(6.71f, 11f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.8f, 8.03f)
                close()
                moveTo(20.5f, 8f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.1f, 0f, -0.2f, 0.02f, -0.3f, 0.03f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.29f, 11f)
                lineTo(20.5f, 11f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                lineTo(21f, 15f)
                horizontalLineToRelative(3f)
                lineTo(24f, 11.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 8f)
                close()
            }
        }.also { _UsersAlt = it}
