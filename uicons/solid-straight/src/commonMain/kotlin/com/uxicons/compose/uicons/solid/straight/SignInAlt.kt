package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Ss.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.91f, 0f)
                horizontalLineTo(3.1f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.15f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(3.15f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, 2f)
                horizontalLineToRelative(17.81f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 3.15f)
                verticalLineTo(20.85f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.91f, 22f)
                horizontalLineTo(3.1f)
                arcTo(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.85f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineToRelative(4.85f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.1f, 24f)
                horizontalLineToRelative(17.81f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.85f)
                verticalLineTo(3.15f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.91f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                horizontalLineTo(17.09f)
                lineToRelative(-4.3f, 4.3f)
                lineTo(14.2f, 18.72f)
                lineToRelative(4.95f, -4.95f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
                lineTo(14.2f, 5.28f)
                lineTo(12.78f, 6.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(3f)
                close()
            }
        }.also { _SignInAlt = it}
