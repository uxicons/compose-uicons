package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeftFromBracket: ImageVector? = null

val Icons.Rr.LeftFromBracket: ImageVector
    get() = _LeftFromBracket ?: UXIcon(name = "LeftFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(15f, 16.96f)
                lineToRelative(-2f, -0.01f)
                verticalLineToRelative(2.05f)
                curveToRelative(-0.0f, 1.23f, -0.71f, 2.28f, -1.85f, 2.75f)
                curveToRelative(-0.38f, 0.16f, -0.77f, 0.23f, -1.15f, 0.23f)
                curveToRelative(-0.77f, 0f, -1.51f, -0.3f, -2.09f, -0.88f)
                lineTo(1.16f, 14.82f)
                curveToRelative(-1.57f, -1.57f, -1.57f, -4.09f, -0.03f, -5.64f)
                curveToRelative(0.01f, -0.01f, 6.77f, -6.37f, 6.77f, -6.37f)
                curveToRelative(0.85f, -0.85f, 2.09f, -1.1f, 3.22f, -0.63f)
                curveToRelative(1.13f, 0.47f, 1.84f, 1.52f, 1.85f, 2.74f)
                verticalLineToRelative(2.07f)
                reflectiveCurveToRelative(2.04f, 0.02f, 2.04f, 0.02f)
                curveToRelative(2.18f, 0f, 3.96f, 1.78f, 3.96f, 3.97f)
                verticalLineToRelative(1.98f)
                curveToRelative(0f, 2.19f, -1.78f, 3.97f, -3.97f, 3.97f)
                close()
                moveTo(15.0f, 14.96f)
                curveToRelative(1.08f, 0f, 1.97f, -0.89f, 1.97f, -1.97f)
                verticalLineToRelative(-1.98f)
                curveToRelative(0f, -1.09f, -0.89f, -1.97f, -1.97f, -1.97f)
                lineToRelative(-3.04f, -0.03f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.45f, -0.99f, -1f)
                verticalLineToRelative(-3.06f)
                curveToRelative(-0.0f, -0.6f, -0.47f, -0.84f, -0.61f, -0.9f)
                curveToRelative(-0.14f, -0.06f, -0.64f, -0.22f, -1.07f, 0.21f)
                lineTo(2.54f, 10.61f)
                curveToRelative(-0.76f, 0.77f, -0.75f, 2.01f, 0.01f, 2.78f)
                lineToRelative(6.75f, 6.28f)
                curveToRelative(0.46f, 0.46f, 0.95f, 0.3f, 1.09f, 0.24f)
                curveToRelative(0.14f, -0.06f, 0.6f, -0.3f, 0.61f, -0.9f)
                verticalLineToRelative(-3.05f)
                curveToRelative(0f, -0.27f, 0.1f, -0.52f, 0.29f, -0.71f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(0.0f)
                lineToRelative(3f, 0.01f)
                close()
            }
        }.also { _LeftFromBracket = it}
