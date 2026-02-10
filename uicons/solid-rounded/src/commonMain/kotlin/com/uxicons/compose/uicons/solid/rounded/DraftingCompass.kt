package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompass: ImageVector? = null

val Icons.Sr.DraftingCompass: ImageVector
    get() = _DraftingCompass ?: UXIcon(name = "DraftingCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 22.48f)
                lineToRelative(-4.54f, -7.44f)
                curveToRelative(0.82f, -0.47f, 1.61f, -1.03f, 2.35f, -1.67f)
                curveToRelative(0.41f, -0.36f, 0.46f, -1.0f, 0.09f, -1.41f)
                curveToRelative(-0.37f, -0.42f, -1.0f, -0.46f, -1.41f, -0.09f)
                curveToRelative(-0.65f, 0.57f, -1.35f, 1.05f, -2.08f, 1.47f)
                lineToRelative(-3.04f, -4.98f)
                curveToRelative(0.48f, -0.66f, 0.78f, -1.47f, 0.78f, -2.35f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 0.88f, 0.29f, 1.69f, 0.78f, 2.35f)
                lineToRelative(-3.04f, 4.98f)
                curveToRelative(-0.73f, -0.41f, -1.43f, -0.9f, -2.08f, -1.47f)
                curveToRelative(-0.42f, -0.36f, -1.05f, -0.32f, -1.41f, 0.09f)
                curveToRelative(-0.36f, 0.41f, -0.32f, 1.05f, 0.09f, 1.41f)
                curveToRelative(0.74f, 0.65f, 1.53f, 1.2f, 2.35f, 1.67f)
                lineTo(0.15f, 22.48f)
                curveToRelative(-0.29f, 0.47f, -0.14f, 1.09f, 0.33f, 1.38f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.15f, 0.52f, 0.15f)
                curveToRelative(0.34f, 0f, 0.67f, -0.17f, 0.85f, -0.48f)
                lineToRelative(4.65f, -7.61f)
                curveToRelative(1.76f, 0.71f, 3.63f, 1.08f, 5.5f, 1.08f)
                reflectiveCurveToRelative(3.74f, -0.37f, 5.5f, -1.08f)
                lineToRelative(4.65f, 7.61f)
                curveToRelative(0.19f, 0.31f, 0.52f, 0.48f, 0.85f, 0.48f)
                curveToRelative(0.18f, 0f, 0.36f, -0.05f, 0.52f, -0.15f)
                curveToRelative(0.47f, -0.29f, 0.62f, -0.9f, 0.33f, -1.38f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(7.55f, 14.19f)
                lineToRelative(2.79f, -4.56f)
                curveToRelative(0.51f, 0.23f, 1.06f, 0.37f, 1.66f, 0.37f)
                reflectiveCurveToRelative(1.15f, -0.14f, 1.66f, -0.37f)
                lineToRelative(2.79f, 4.56f)
                curveToRelative(-2.86f, 1.07f, -6.03f, 1.07f, -8.89f, 0f)
                close()
            }
        }.also { _DraftingCompass = it}
