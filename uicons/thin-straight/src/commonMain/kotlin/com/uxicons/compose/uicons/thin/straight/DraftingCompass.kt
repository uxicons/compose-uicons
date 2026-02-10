package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DraftingCompass: ImageVector? = null

val Icons.Ts.DraftingCompass: ImageVector
    get() = _DraftingCompass ?: UXIcon(name = "DraftingCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.87f, 15.21f)
                curveToRelative(1.12f, -0.62f, 2.19f, -1.4f, 3.14f, -2.35f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.9f, 0.9f, -1.9f, 1.63f, -2.96f, 2.21f)
                lineToRelative(-3.46f, -5.6f)
                curveToRelative(0.69f, -0.72f, 1.11f, -1.69f, 1.11f, -2.76f)
                curveToRelative(0f, -2.03f, -1.53f, -3.7f, -3.5f, -3.95f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2.05f)
                curveToRelative(-1.97f, 0.25f, -3.5f, 1.92f, -3.5f, 3.95f)
                curveToRelative(0f, 1.07f, 0.43f, 2.04f, 1.11f, 2.76f)
                lineToRelative(-3.46f, 5.6f)
                curveToRelative(-1.06f, -0.58f, -2.06f, -1.31f, -2.96f, -2.21f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(0.95f, 0.95f, 2.02f, 1.73f, 3.14f, 2.35f)
                lineTo(0.07f, 23.39f)
                lineToRelative(0.85f, 0.53f)
                lineTo(6.03f, 15.66f)
                curveToRelative(1.89f, 0.88f, 3.93f, 1.33f, 5.97f, 1.33f)
                reflectiveCurveToRelative(4.08f, -0.46f, 5.97f, -1.33f)
                lineToRelative(5.1f, 8.26f)
                lineToRelative(0.85f, -0.53f)
                lineToRelative(-5.05f, -8.18f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(6.55f, 14.8f)
                lineToRelative(3.34f, -5.42f)
                curveToRelative(0.61f, 0.38f, 1.33f, 0.61f, 2.1f, 0.61f)
                reflectiveCurveToRelative(1.49f, -0.23f, 2.1f, -0.61f)
                lineToRelative(3.34f, 5.42f)
                curveToRelative(-3.45f, 1.57f, -7.44f, 1.57f, -10.89f, 0f)
                close()
            }
        }.also { _DraftingCompass = it}
