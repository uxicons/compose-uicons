package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompass: ImageVector? = null

val Icons.Rs.DraftingCompass: ImageVector
    get() = _DraftingCompass ?: UXIcon(name = "DraftingCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.85f, 22.48f)
                lineToRelative(-4.54f, -7.43f)
                curveToRelative(1.09f, -0.63f, 2.12f, -1.41f, 3.05f, -2.34f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.82f, 0.82f, -1.72f, 1.5f, -2.68f, 2.05f)
                lineToRelative(-3.04f, -4.98f)
                curveToRelative(0.49f, -0.66f, 0.77f, -1.48f, 0.77f, -2.36f)
                curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.13f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
                curveToRelative(0f, 0.88f, 0.29f, 1.7f, 0.77f, 2.36f)
                lineToRelative(-3.04f, 4.98f)
                curveToRelative(-0.96f, -0.55f, -1.86f, -1.23f, -2.68f, -2.05f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(0.93f, 0.93f, 1.96f, 1.71f, 3.05f, 2.34f)
                lineTo(0.15f, 22.48f)
                lineToRelative(1.71f, 1.04f)
                lineToRelative(4.64f, -7.59f)
                curveToRelative(1.76f, 0.71f, 3.63f, 1.07f, 5.5f, 1.07f)
                reflectiveCurveToRelative(3.74f, -0.35f, 5.5f, -1.07f)
                lineToRelative(4.64f, 7.59f)
                lineToRelative(1.71f, -1.04f)
                close()
                moveTo(12f, 4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(7.55f, 14.19f)
                lineToRelative(2.78f, -4.55f)
                curveToRelative(0.51f, 0.23f, 1.07f, 0.36f, 1.66f, 0.36f)
                reflectiveCurveToRelative(1.16f, -0.13f, 1.66f, -0.36f)
                lineToRelative(2.78f, 4.55f)
                curveToRelative(-2.86f, 1.07f, -6.03f, 1.07f, -8.89f, 0f)
                close()
            }
        }.also { _DraftingCompass = it}
