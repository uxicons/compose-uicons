package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareAltSquare: ImageVector? = null

val Icons.Rr.ShareAltSquare: ImageVector
    get() = _ShareAltSquare ?: UXIcon(name = "ShareAltSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.17f, 0.01f, 0.34f, 0.04f, 0.5f)
                lineToRelative(-4.06f, 2.25f)
                curveToRelative(-0.53f, -0.47f, -1.22f, -0.75f, -1.99f, -0.75f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.76f, 0f, 1.46f, -0.28f, 1.99f, -0.75f)
                lineToRelative(4.06f, 2.25f)
                curveToRelative(-0.03f, 0.16f, -0.04f, 0.33f, -0.04f, 0.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                curveToRelative(-0.76f, 0f, -1.46f, 0.28f, -1.99f, 0.75f)
                lineToRelative(-4.06f, -2.25f)
                curveToRelative(0.03f, -0.16f, 0.04f, -0.33f, 0.04f, -0.5f)
                reflectiveCurveToRelative(-0.01f, -0.34f, -0.04f, -0.5f)
                lineToRelative(4.06f, -2.25f)
                curveToRelative(0.53f, 0.47f, 1.22f, 0.75f, 1.99f, 0.75f)
                close()
                moveTo(16f, 6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(7f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _ShareAltSquare = it}
