package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompass: ImageVector? = null

val Icons.Ss.DraftingCompass: ImageVector
    get() = _DraftingCompass ?: UXIcon(name = "DraftingCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 15.03f)
                curveToRelative(1.09f, -0.63f, 2.13f, -1.39f, 3.06f, -2.33f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.82f, 0.82f, -1.73f, 1.49f, -2.69f, 2.04f)
                lineToRelative(-3.04f, -4.98f)
                curveToRelative(0.48f, -0.66f, 0.78f, -1.47f, 0.78f, -2.35f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2f, -3f, 3.86f)
                curveToRelative(0f, 0.88f, 0.29f, 1.69f, 0.78f, 2.35f)
                lineToRelative(-3.04f, 4.98f)
                curveToRelative(-0.96f, -0.55f, -1.87f, -1.22f, -2.69f, -2.04f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(0.93f, 0.93f, 1.97f, 1.7f, 3.06f, 2.33f)
                lineTo(0.15f, 22.48f)
                lineToRelative(1.71f, 1.04f)
                lineToRelative(4.64f, -7.6f)
                curveToRelative(1.76f, 0.71f, 3.63f, 1.07f, 5.5f, 1.07f)
                reflectiveCurveToRelative(3.74f, -0.36f, 5.5f, -1.07f)
                lineToRelative(4.64f, 7.6f)
                lineToRelative(1.71f, -1.04f)
                lineToRelative(-4.55f, -7.45f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(7.56f, 14.18f)
                lineToRelative(2.78f, -4.55f)
                curveToRelative(0.51f, 0.23f, 1.06f, 0.37f, 1.66f, 0.37f)
                reflectiveCurveToRelative(1.15f, -0.14f, 1.66f, -0.37f)
                lineToRelative(2.78f, 4.55f)
                curveToRelative(-2.86f, 1.07f, -6.02f, 1.07f, -8.88f, 0f)
                close()
            }
        }.also { _DraftingCompass = it}
