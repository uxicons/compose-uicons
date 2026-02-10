package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudShowers: ImageVector? = null

val Icons.Ss.CloudShowers: ImageVector
    get() = _CloudShowers ?: UXIcon(name = "CloudShowers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                lineTo(13f, 24f)
                lineTo(13f, 17f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 17f)
                lineTo(5f, 17f)
                verticalLineToRelative(7f)
                lineTo(7f, 24f)
                close()
                moveTo(19f, 15f)
                lineTo(17f, 15f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 12.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 6f)
                lineTo(21f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(17f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(13f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(9f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(5f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(2.4f)
                curveToRelative(-3.55f, -1.63f, -4.04f, -7.15f, -0.73f, -9.35f)
                curveTo(-0.07f, 0.2f, 13.62f, -4.04f, 17.44f, 5.06f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
            }
        }.also { _CloudShowers = it}
