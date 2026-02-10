package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Rr.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(21.81f, 12.87f)
                curveToRelative(0.47f, 1.13f, 0.22f, 2.38f, -0.65f, 3.25f)
                curveToRelative(0f, 0f, -6.34f, 6.74f, -6.35f, 6.75f)
                curveToRelative(-0.77f, 0.77f, -1.79f, 1.16f, -2.81f, 1.16f)
                reflectiveCurveToRelative(-2.03f, -0.39f, -2.81f, -1.16f)
                lineToRelative(-6.33f, -6.8f)
                curveToRelative(-0.84f, -0.84f, -1.09f, -2.08f, -0.63f, -3.22f)
                curveToRelative(0.47f, -1.13f, 1.52f, -1.84f, 2.75f, -1.85f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-0.01f, -2.0f)
                curveToRelative(0f, -2.19f, 1.78f, -3.98f, 3.97f, -3.98f)
                horizontalLineToRelative(1.98f)
                curveToRelative(2.19f, 0f, 3.97f, 1.78f, 3.97f, 3.97f)
                lineToRelative(0.02f, 2.03f)
                horizontalLineToRelative(2.07f)
                curveToRelative(1.23f, 0.01f, 2.28f, 0.71f, 2.75f, 1.85f)
                close()
                moveTo(19.96f, 13.63f)
                curveToRelative(-0.06f, -0.14f, -0.3f, -0.61f, -0.9f, -0.61f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(-0.55f, 0f, -0.99f, -0.44f, -1f, -0.99f)
                lineToRelative(-0.03f, -3.03f)
                curveToRelative(0f, -1.1f, -0.89f, -1.99f, -1.97f, -1.99f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-1.09f, 0f, -1.97f, 0.89f, -1.97f, 1.97f)
                lineToRelative(0.01f, 3.0f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-3.06f)
                curveToRelative(-0.6f, 0.0f, -0.84f, 0.47f, -0.9f, 0.61f)
                reflectiveCurveToRelative(-0.22f, 0.64f, 0.21f, 1.07f)
                lineToRelative(6.33f, 6.8f)
                curveToRelative(0.74f, 0.74f, 1.98f, 0.74f, 2.75f, -0.01f)
                lineToRelative(6.34f, -6.73f)
                curveToRelative(0.45f, -0.45f, 0.29f, -0.95f, 0.23f, -1.09f)
                close()
            }
        }.also { _DownFromBracket = it}
