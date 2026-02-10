package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpFromBracket: ImageVector? = null

val Icons.Rr.UpFromBracket: ImageVector
    get() = _UpFromBracket ?: UXIcon(name = "UpFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(2.25f, 11.15f)
                curveToRelative(-0.47f, -1.14f, -0.22f, -2.38f, 0.65f, -3.25f)
                lineTo(9.18f, 1.16f)
                curveToRelative(1.57f, -1.57f, 4.09f, -1.57f, 5.64f, -0.03f)
                curveToRelative(0.01f, 0.01f, 6.37f, 6.77f, 6.37f, 6.77f)
                curveToRelative(0.85f, 0.84f, 1.1f, 2.09f, 0.63f, 3.22f)
                reflectiveCurveToRelative(-1.52f, 1.84f, -2.74f, 1.85f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.02f, 2.04f)
                curveToRelative(0f, 2.18f, -1.78f, 3.96f, -3.97f, 3.96f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.19f, 0f, -3.97f, -1.78f, -3.97f, -3.97f)
                lineToRelative(0.01f, -2f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-1.23f, -0.0f, -2.28f, -0.71f, -2.75f, -1.85f)
                close()
                moveTo(4.09f, 10.39f)
                curveToRelative(0.06f, 0.14f, 0.3f, 0.6f, 0.9f, 0.61f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.27f, 0f, 0.52f, 0.1f, 0.71f, 0.29f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                lineToRelative(-0.01f, 3f)
                curveToRelative(0f, 1.08f, 0.89f, 1.97f, 1.97f, 1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.09f, 0f, 1.97f, -0.89f, 1.97f, -1.97f)
                lineToRelative(0.03f, -3.04f)
                curveToRelative(0.01f, -0.55f, 0.45f, -0.99f, 1f, -0.99f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.6f, -0.0f, 0.84f, -0.47f, 0.9f, -0.61f)
                reflectiveCurveToRelative(0.22f, -0.64f, -0.21f, -1.07f)
                lineTo(13.39f, 2.54f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.56f, -1.38f, -0.56f)
                curveToRelative(-0.51f, 0f, -1.01f, 0.19f, -1.4f, 0.58f)
                lineToRelative(-6.28f, 6.75f)
                curveToRelative(-0.46f, 0.46f, -0.3f, 0.95f, -0.24f, 1.09f)
                close()
            }
        }.also { _UpFromBracket = it}
