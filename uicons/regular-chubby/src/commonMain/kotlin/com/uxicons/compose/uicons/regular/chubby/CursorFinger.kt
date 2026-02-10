package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Rc.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.98f, 11.04f)
                curveToRelative(-0.07f, -0.23f, -0.23f, -0.43f, -0.44f, -0.56f)
                curveToRelative(-0.11f, -0.07f, -2.77f, -1.64f, -5.92f, -1.64f)
                curveToRelative(-0.49f, 0f, -0.99f, 0.02f, -1.5f, 0.06f)
                lineTo(12.11f, 3.97f)
                curveToRelative(0f, -1.64f, -1.33f, -2.97f, -2.96f, -2.97f)
                reflectiveCurveToRelative(-2.96f, 1.33f, -2.96f, 2.97f)
                verticalLineToRelative(7.2f)
                curveToRelative(-0.32f, 0.22f, -0.75f, 0.56f, -1.23f, 1.06f)
                curveToRelative(-3.28f, 3.42f, -1.05f, 7.43f, 0.54f, 9.03f)
                curveToRelative(0.25f, 0.29f, 1.75f, 1.75f, 6.7f, 1.75f)
                curveToRelative(4.99f, 0f, 7.22f, -1.51f, 7.31f, -1.58f)
                curveToRelative(0.17f, -0.12f, 0.3f, -0.29f, 0.37f, -0.49f)
                curveToRelative(0.03f, -0.1f, 0.85f, -2.44f, 0.85f, -5.08f)
                curveToRelative(0f, -2.42f, -0.72f, -4.71f, -0.75f, -4.81f)
                close()
                moveTo(18.1f, 19.92f)
                curveToRelative(-0.66f, 0.33f, -2.54f, 1.08f, -5.91f, 1.08f)
                curveToRelative(-4.05f, 0f, -5.2f, -1.07f, -5.23f, -1.1f)
                curveToRelative(-0.33f, -0.34f, -3.1f, -3.31f, -0.78f, -6.05f)
                verticalLineToRelative(1.51f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(8.19f, 3.97f)
                curveToRelative(0f, -0.54f, 0.43f, -0.97f, 0.96f, -0.97f)
                reflectiveCurveToRelative(0.96f, 0.44f, 0.96f, 0.97f)
                verticalLineToRelative(6.04f)
                curveToRelative(0f, 0.4f, 0.35f, 1.07f, 1.12f, 0.99f)
                curveToRelative(0.83f, -0.09f, 1.63f, -0.15f, 2.38f, -0.15f)
                curveToRelative(2.01f, 0f, 3.84f, 0.81f, 4.57f, 1.18f)
                curveToRelative(0.19f, 0.7f, 0.55f, 2.26f, 0.55f, 3.83f)
                curveToRelative(0f, 1.74f, -0.42f, 3.38f, -0.63f, 4.07f)
                close()
            }
        }.also { _CursorFinger = it}
