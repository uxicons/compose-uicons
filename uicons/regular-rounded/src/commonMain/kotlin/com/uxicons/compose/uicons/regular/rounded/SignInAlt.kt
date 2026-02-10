package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Rr.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 0f)
                horizontalLineTo(5.1f)
                arcTo(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                verticalLineTo(5f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.1f, 2f)
                horizontalLineTo(18.9f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(19f)
                arcToRelative(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.1f, 3f)
                horizontalLineTo(5.1f)
                arcTo(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.1f, 5f)
                horizontalLineTo(18.9f)
                arcTo(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19f)
                verticalLineTo(5f)
                arcTo(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.9f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineTo(4f)
                lineToRelative(13.19f, -0.03f)
                lineToRelative(-4.32f, 4.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(4.59f, -4.59f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineTo(14.28f, 5.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(4.26f, 4.26f)
                lineTo(4f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                close()
            }
        }.also { _SignInAlt = it}
