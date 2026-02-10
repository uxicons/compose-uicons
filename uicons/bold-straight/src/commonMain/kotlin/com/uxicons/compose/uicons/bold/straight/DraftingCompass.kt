package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompass: ImageVector? = null

val Icons.Bs.DraftingCompass: ImageVector
    get() = _DraftingCompass ?: UXIcon(name = "DraftingCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.93f, 22.41f)
                lineToRelative(-3.93f, -6.71f)
                curveToRelative(0.96f, -0.6f, 1.88f, -1.3f, 2.72f, -2.14f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.65f, 0.65f, -1.36f, 1.2f, -2.11f, 1.68f)
                lineToRelative(-3.02f, -5.15f)
                curveToRelative(0.33f, -0.58f, 0.54f, -1.25f, 0.54f, -1.96f)
                curveToRelative(0f, -1.68f, -1.04f, -3.11f, -2.5f, -3.7f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 2.3f)
                curveToRelative(-1.46f, 0.59f, -2.5f, 2.03f, -2.5f, 3.7f)
                curveToRelative(0f, 0.72f, 0.2f, 1.38f, 0.54f, 1.96f)
                lineToRelative(-3.02f, 5.15f)
                curveToRelative(-0.75f, -0.47f, -1.46f, -1.02f, -2.11f, -1.68f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(0.84f, 0.84f, 1.75f, 1.54f, 2.72f, 2.14f)
                lineTo(0.07f, 22.41f)
                lineToRelative(2.59f, 1.52f)
                lineToRelative(4.05f, -6.9f)
                curveToRelative(1.71f, 0.64f, 3.5f, 0.97f, 5.3f, 0.97f)
                reflectiveCurveToRelative(3.59f, -0.33f, 5.3f, -0.97f)
                lineToRelative(4.05f, 6.9f)
                lineToRelative(2.59f, -1.52f)
                close()
                moveTo(10.5f, 6f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.24f, 14.39f)
                lineToRelative(2.67f, -4.56f)
                curveToRelative(0.35f, 0.1f, 0.7f, 0.17f, 1.08f, 0.17f)
                reflectiveCurveToRelative(0.74f, -0.07f, 1.08f, -0.17f)
                lineToRelative(2.67f, 4.56f)
                curveToRelative(-2.44f, 0.79f, -5.07f, 0.79f, -7.51f, 0f)
                close()
            }
        }.also { _DraftingCompass = it}
