package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Rr.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 18f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5.74f)
                lineToRelative(-1.84f, 1.41f)
                curveToRelative(-0.14f, 0.1f, -0.19f, 0.3f, -0.14f, 0.47f)
                lineToRelative(0.94f, 3.08f)
                curveToRelative(0.16f, 0.53f, -0.14f, 1.09f, -0.67f, 1.25f)
                curveToRelative(-0.53f, 0.16f, -1.09f, -0.14f, -1.25f, -0.67f)
                lineToRelative(-0.93f, -3.06f)
                curveToRelative(-0.32f, -0.95f, 0.01f, -2.02f, 0.82f, -2.66f)
                lineToRelative(2.46f, -1.88f)
                curveToRelative(1.21f, -1.01f, 2.21f, -1.21f, 3.61f, -1.21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.4f, 0f, -0.71f, 0.03f, -1f, 0.08f)
                verticalLineToRelative(6.92f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(10.82f, 19.05f)
                curveToRelative(-0.53f, -0.18f, -1.09f, 0.11f, -1.26f, 0.63f)
                lineToRelative(-0.77f, 2.32f)
                lineTo(4f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.78f)
                curveToRelative(0.86f, 0f, 1.62f, -0.55f, 1.9f, -1.37f)
                lineToRelative(0.77f, -2.32f)
                curveToRelative(0.17f, -0.52f, -0.11f, -1.09f, -0.63f, -1.26f)
                close()
            }
        }.also { _PersonLunge = it}
