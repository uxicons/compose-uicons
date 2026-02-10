package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Sr.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.42f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.42f)
                curveTo(1.24f, 3.2f, 0f, 4.96f, 0f, 7f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.04f, 1.24f, 3.8f, 3f, 4.58f)
                verticalLineToRelative(5.42f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.42f)
                curveToRelative(1.76f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.04f, -1.24f, -3.8f, -3f, -4.58f)
                close()
            }
        }.also { _SignPosts = it}
