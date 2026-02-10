package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Branding: ImageVector? = null

val Icons.Rs.Branding: ImageVector
    get() = _Branding ?: UXIcon(name = "Branding") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(11.41f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineTo(6f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4f, 13.59f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(10.59f)
                close()
                moveTo(19.41f, 0f)
                horizontalLineToRelative(-8.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                lineTo(10f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                lineTo(24f, 4.59f)
                lineTo(19.41f, 0f)
                close()
                moveTo(19f, 2.41f)
                lineToRelative(2.59f, 2.59f)
                horizontalLineToRelative(-2.59f)
                verticalLineToRelative(-2.59f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17.07f, 15.01f)
                lineToRelative(-2.61f, 2.61f)
                curveToRelative(-0.53f, 0.53f, -1.4f, 0.53f, -1.93f, 0f)
                lineToRelative(-2.61f, -2.61f)
                curveToRelative(0.03f, -0.0f, 7.12f, -0.0f, 7.14f, 0f)
                close()
                moveTo(9f, 22f)
                verticalLineToRelative(-5.09f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.64f, 0.64f, 1.48f, 0.99f, 2.38f, 0.99f)
                reflectiveCurveToRelative(1.74f, -0.35f, 2.38f, -0.99f)
                lineToRelative(2.12f, -2.12f)
                verticalLineToRelative(5.09f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _Branding = it}
