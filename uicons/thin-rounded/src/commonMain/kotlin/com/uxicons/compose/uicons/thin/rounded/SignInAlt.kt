package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignInAlt: ImageVector? = null

val Icons.Tr.SignInAlt: ImageVector
    get() = _SignInAlt ?: UXIcon(name = "SignInAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.5f, 11.5f)
                horizontalLineToRelative(17.41f)
                curveToRelative(-0.07f, -0.21f, -0.19f, -0.41f, -0.36f, -0.58f)
                lineToRelative(-4.15f, -4.11f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(4.15f, 4.11f)
                curveToRelative(0.48f, 0.47f, 0.74f, 1.11f, 0.74f, 1.78f)
                curveToRelative(0f, 0.0f, 0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 0f, 0f, 0.0f, 0f, 0.0f)
                curveToRelative(0f, 0.0f, -0.0f, 0.0f, -0.0f, 0.01f)
                curveToRelative(-0.0f, 0.67f, -0.27f, 1.3f, -0.74f, 1.77f)
                lineToRelative(-4.15f, 4.08f)
                curveToRelative(-0.1f, 0.1f, -0.22f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.36f, -0.15f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.01f, -0.71f)
                lineToRelative(4.15f, -4.08f)
                curveToRelative(0.16f, -0.16f, 0.28f, -0.35f, 0.35f, -0.56f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(19.5f, 0f)
                horizontalLineTo(4.5f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _SignInAlt = it}
