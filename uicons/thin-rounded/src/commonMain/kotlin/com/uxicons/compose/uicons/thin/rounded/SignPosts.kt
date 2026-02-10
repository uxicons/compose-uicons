package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignPosts: ImageVector? = null

val Icons.Tr.SignPosts: ImageVector
    get() = _SignPosts ?: UXIcon(name = "SignPosts") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2.28f)
                lineTo(21f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(-0.17f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f)
                lineTo(4.5f, 2f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.03f, -0.5f, 0.05f)
                lineTo(4f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.78f)
                curveTo(1.26f, 2.9f, 0f, 4.55f, 0f, 6.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.95f, 1.26f, 3.6f, 3f, 4.22f)
                verticalLineToRelative(5.78f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.55f)
                curveToRelative(0.17f, 0.02f, 0.33f, 0.05f, 0.5f, 0.05f)
                horizontalLineToRelative(15f)
                curveToRelative(0.17f, 0f, 0.33f, -0.03f, 0.5f, -0.05f)
                verticalLineToRelative(5.55f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.78f)
                curveToRelative(1.74f, -0.62f, 3f, -2.27f, 3f, -4.22f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
                close()
                moveTo(23f, 13.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _SignPosts = it}
