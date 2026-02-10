package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardQuestion: ImageVector? = null

val Icons.Ts.ClipboardQuestion: ImageVector
    get() = _ClipboardQuestion ?: UXIcon(name = "ClipboardQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 17.99f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21f, 2f)
                lineTo(21f, 21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3f, 2f)
                horizontalLineToRelative(5.05f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(5.05f)
                close()
                moveTo(20f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(4f, 3f)
                lineTo(4f, 21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(20f, 3f)
                close()
                moveTo(12.93f, 6.12f)
                curveToRelative(-1.08f, -0.28f, -2.2f, -0.06f, -3.07f, 0.61f)
                curveToRelative(-0.86f, 0.67f, -1.36f, 1.68f, -1.36f, 2.77f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.78f, 0.35f, -1.5f, 0.97f, -1.98f)
                reflectiveCurveToRelative(1.42f, -0.64f, 2.2f, -0.43f)
                curveToRelative(0.84f, 0.22f, 1.52f, 0.9f, 1.74f, 1.74f)
                curveToRelative(0.31f, 1.22f, -0.25f, 2.43f, -1.36f, 2.94f)
                curveToRelative(-0.94f, 0.43f, -1.55f, 1.44f, -1.55f, 2.56f)
                verticalLineToRelative(0.67f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.67f)
                curveToRelative(0f, -0.73f, 0.38f, -1.38f, 0.97f, -1.66f)
                curveToRelative(1.56f, -0.72f, 2.35f, -2.41f, 1.91f, -4.1f)
                curveToRelative(-0.31f, -1.19f, -1.27f, -2.15f, -2.46f, -2.46f)
                close()
            }
        }.also { _ClipboardQuestion = it}
