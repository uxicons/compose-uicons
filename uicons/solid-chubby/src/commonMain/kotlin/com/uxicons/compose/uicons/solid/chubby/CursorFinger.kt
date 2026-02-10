package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Sc.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 11.04f)
                curveToRelative(-0.07f, -0.23f, -0.23f, -0.43f, -0.44f, -0.56f)
                curveToRelative(-0.11f, -0.07f, -2.77f, -1.64f, -5.92f, -1.64f)
                curveToRelative(-0.49f, 0f, -0.99f, 0.02f, -1.5f, 0.06f)
                verticalLineTo(3.97f)
                curveToRelative(0f, -1.64f, -1.33f, -2.97f, -2.96f, -2.97f)
                reflectiveCurveToRelative(-2.96f, 1.33f, -2.96f, 2.97f)
                lineToRelative(0.01f, 12.07f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, 0f, -0.04f, -3.83f, -0.05f, -3.82f)
                curveToRelative(-3.28f, 3.42f, -1.15f, 7.54f, 0.54f, 9.03f)
                curveToRelative(0.92f, 0.81f, 2.27f, 1.75f, 7.51f, 1.75f)
                curveToRelative(4.99f, 0f, 7.22f, -1.51f, 7.31f, -1.58f)
                curveToRelative(0.17f, -0.12f, 0.3f, -0.29f, 0.37f, -0.49f)
                curveToRelative(0.03f, -0.1f, 0.85f, -2.44f, 0.85f, -5.08f)
                curveToRelative(0f, -2.42f, -0.72f, -4.71f, -0.75f, -4.81f)
                close()
            }
        }.also { _CursorFinger = it}
