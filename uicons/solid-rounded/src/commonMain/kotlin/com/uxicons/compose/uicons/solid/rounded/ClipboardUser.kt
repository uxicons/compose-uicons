package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardUser: ImageVector? = null

val Icons.Sr.ClipboardUser: ImageVector
    get() = _ClipboardUser ?: UXIcon(name = "ClipboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(3f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(0.17f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(9.5f, 10.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(16.97f, 17.75f)
                curveToRelative(-0.56f, -2.17f, -2.65f, -3.75f, -4.97f, -3.75f)
                reflectiveCurveToRelative(-4.41f, 1.58f, -4.97f, 3.75f)
                curveToRelative(-0.14f, 0.54f, 0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(0.54f, 0.14f, 1.08f, -0.18f, 1.22f, -0.72f)
                curveToRelative(0.33f, -1.28f, 1.63f, -2.25f, 3.03f, -2.25f)
                reflectiveCurveToRelative(2.7f, 0.97f, 3.03f, 2.25f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                close()
            }
        }.also { _ClipboardUser = it}
