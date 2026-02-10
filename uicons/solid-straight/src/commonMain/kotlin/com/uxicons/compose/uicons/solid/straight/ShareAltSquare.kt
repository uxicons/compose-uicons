package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareAltSquare: ImageVector? = null

val Icons.Ss.ShareAltSquare: ImageVector
    get() = _ShareAltSquare ?: UXIcon(name = "ShareAltSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(16f, 18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(9.96f, 11.5f)
                lineToRelative(4.06f, -2.25f)
                curveToRelative(0.53f, 0.47f, 1.22f, 0.75f, 1.99f, 0.75f)
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
                close()
            }
        }.also { _ShareAltSquare = it}
