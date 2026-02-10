package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardUser: ImageVector? = null

val Icons.Rr.ClipboardUser: ImageVector
    get() = _ClipboardUser ?: UXIcon(name = "ClipboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(3f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.17f)
                curveTo(8.58f, 0.84f, 9.7f, 0f, 11f, 0f)
                horizontalLineToRelative(2f)
                curveTo(14.3f, 0f, 15.42f, 0.84f, 15.83f, 2f)
                horizontalLineToRelative(0.17f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
                moveTo(8f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(19f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12f, 13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(16.25f, 18.97f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveToRelative(-0.56f, -2.17f, -2.65f, -3.75f, -4.97f, -3.75f)
                reflectiveCurveToRelative(-4.41f, 1.58f, -4.97f, 3.75f)
                curveToRelative(-0.14f, 0.54f, 0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(0.54f, 0.14f, 1.08f, -0.18f, 1.22f, -0.72f)
                curveToRelative(0.33f, -1.28f, 1.63f, -2.25f, 3.03f, -2.25f)
                reflectiveCurveToRelative(2.7f, 0.97f, 3.03f, 2.25f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                close()
            }
        }.also { _ClipboardUser = it}
