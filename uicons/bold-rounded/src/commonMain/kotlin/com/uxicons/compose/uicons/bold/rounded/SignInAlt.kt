package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Br.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.59f, 0f)
            horizontalLineTo(5.41f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.32f)
            verticalLineTo(7.18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(5.32f)
            arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.41f, 3f)
            horizontalLineTo(18.59f)
            arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.32f)
            verticalLineTo(18.68f)
            arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.59f, 21f)
            horizontalLineTo(5.41f)
            arcTo(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.68f)
            verticalLineTo(16.82f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(1.86f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.41f, 24f)
            horizontalLineTo(18.59f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.68f)
            verticalLineTo(5.32f)
            arcTo(5.37f, 5.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.59f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 12f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 13.5f)
            horizontalLineTo(5f)
            lineToRelative(9.97f, -0.03f)
            lineToRelative(-3.47f, 3.47f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(4.59f, -4.59f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.95f)
            lineTo(13.63f, 4.94f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(3.41f, 3.41f)
            lineTo(5f, 10.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 12f)
            close()
        }
    }.also { _SignInAlt = it }
