package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPostsWrench: ImageVector? = null

val Icons.Ss.SignPostsWrench: ImageVector
    get() = _SignPostsWrench ?: UXIcon(name = "SignPostsWrench") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 20.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.71f)
                curveToRelative(-2.31f, -0.65f, -4f, -2.77f, -4f, -5.29f)
                curveToRelative(0f, -2.33f, 1.45f, -4.32f, 3.5f, -5.12f)
                verticalLineToRelative(3.12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.12f)
                curveToRelative(2.05f, 0.8f, 3.5f, 2.79f, 3.5f, 5.12f)
                curveToRelative(0f, 2.52f, -1.69f, 4.63f, -4f, 5.29f)
                close()
                moveTo(11f, 15f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                curveToRelative(2.21f, 0f, 4.18f, 0.96f, 5.56f, 2.48f)
                verticalLineToRelative(-4.98f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(21.06f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(5.06f, 2f)
                lineTo(5.06f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveTo(1.4f, 2f, 0.06f, 3.35f, 0.06f, 5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6.57f)
                curveToRelative(-0.4f, -0.92f, -0.63f, -1.93f, -0.63f, -3f)
                close()
            }
        }.also { _SignPostsWrench = it}
