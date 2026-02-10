package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPostsWrench: ImageVector? = null

val Icons.Bs.SignPostsWrench: ImageVector
    get() = _SignPostsWrench ?: UXIcon(name = "SignPostsWrench") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(4.11f)
                curveToRelative(-0.82f, -0.84f, -1.85f, -1.47f, -3f, -1.81f)
                verticalLineToRelative(-2.29f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(9.16f)
                curveToRelative(0.25f, 1.12f, 0.76f, 2.15f, 1.48f, 3f)
                horizontalLineToRelative(-7.64f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                lineTo(0f, 19f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.2f, 3f, -3.45f)
                lineTo(3f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                lineTo(18f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.05f)
                curveToRelative(1.69f, 0.24f, 3f, 1.69f, 3f, 3.45f)
                close()
                moveTo(21f, 9.92f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3.08f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                reflectiveCurveToRelative(1.24f, 3.81f, 3f, 4.58f)
                verticalLineToRelative(4.92f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4.92f)
                curveToRelative(1.76f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                reflectiveCurveToRelative(-1.24f, -3.81f, -3f, -4.58f)
                close()
            }
        }.also { _SignPostsWrench = it}
