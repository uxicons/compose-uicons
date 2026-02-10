package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Bs.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.02f, 13.5f)
                horizontalLineTo(14.46f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(4.19f, -4.19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.24f)
                lineToRelative(-4.2f, -4.2f)
                lineTo(11.75f, 7.8f)
                lineToRelative(2.7f, 2.7f)
                horizontalLineTo(3.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                horizontalLineTo(3.5f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.55f)
                verticalLineTo(7.9f)
                horizontalLineTo(3f)
                verticalLineTo(3.55f)
                arcTo(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3f)
                horizontalLineToRelative(17f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.55f)
                verticalLineToRelative(16.9f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.55f)
                horizontalLineTo(3.5f)
                arcToRelative(0.53f, 0.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, -0.55f)
                verticalLineTo(16.1f)
                horizontalLineTo(0f)
                verticalLineToRelative(4.35f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 24f)
                horizontalLineToRelative(17f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.45f)
                verticalLineTo(3.55f)
                arcTo(3.53f, 3.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 0f)
                close()
            }
        }.also { _SignInAlt = it}
