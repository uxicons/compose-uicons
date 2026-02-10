package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignOutAlt: ImageVector? = null

val Icons.Br.SignOutAlt: ImageVector
    get() = _SignOutAlt ?: UXIcon(name = "SignOutAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 16f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 17.5f)
            verticalLineToRelative(0.8f)
            arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.3f, 21f)
            horizontalLineTo(5.7f)
            arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.3f)
            verticalLineTo(5.7f)
            arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.7f, 3f)
            horizontalLineTo(7.3f)
            arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 5.7f)
            verticalLineToRelative(0.8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(5.7f)
            arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.3f, 0f)
            horizontalLineTo(5.7f)
            arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.7f)
            verticalLineTo(18.3f)
            arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.7f, 24f)
            horizontalLineTo(7.3f)
            arcTo(5.71f, 5.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.3f)
            verticalLineToRelative(-0.8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 16f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.56f, 9.53f)
            lineTo(17.98f, 4.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(3.41f, 3.41f)
            lineTo(7f, 10.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(7f)
            lineToRelative(12.32f, -0.03f)
            lineToRelative(-3.47f, 3.47f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(4.59f, -4.59f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.56f, 9.53f)
            close()
        }
    }.also { _SignOutAlt = it }
