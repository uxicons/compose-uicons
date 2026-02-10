package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailClipper: ImageVector? = null

val Icons.Ts.NailClipper: ImageVector
    get() = _NailClipper ?: UXIcon(name = "NailClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.11f, 15.25f)
                lineToRelative(-9.35f, -10.28f)
                lineToRelative(0.25f, -4.96f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-0.24f, 0.2f, -1.62f, 1.95f, -5.26f, 2f)
                curveToRelative(-3.64f, -0.06f, -5.0f, -1.79f, -5.28f, -2f)
                horizontalLineToRelative(-0.75f)
                lineToRelative(1.05f, 19.25f)
                curveToRelative(0.13f, 2.66f, 2.31f, 4.75f, 4.98f, 4.75f)
                reflectiveCurveToRelative(4.85f, -2.09f, 4.98f, -4.75f)
                lineToRelative(0.2f, -3.75f)
                lineToRelative(5.06f, 4.6f)
                curveToRelative(1.36f, 1.24f, 3.44f, 1.19f, 4.75f, -0.11f)
                curveToRelative(1.3f, -1.3f, 1.35f, -3.38f, 0.11f, -4.75f)
                close()
                moveTo(7f, 3f)
                curveToRelative(2.37f, 0f, 4.01f, -0.79f, 4.94f, -1.42f)
                lineToRelative(-0.1f, 1.84f)
                curveToRelative(-0.61f, 0.51f, -2.2f, 1.57f, -4.82f, 1.57f)
                curveToRelative(-2.67f, 0f, -4.29f, -1.13f, -4.86f, -1.61f)
                lineToRelative(-0.1f, -1.8f)
                curveToRelative(0.93f, 0.63f, 2.57f, 1.42f, 4.94f, 1.42f)
                close()
                moveTo(7f, 23f)
                curveToRelative(-2.13f, 0f, -3.88f, -1.67f, -3.98f, -3.8f)
                lineToRelative(-0.79f, -14.53f)
                curveToRelative(0.95f, 0.61f, 2.53f, 1.33f, 4.79f, 1.33f)
                curveToRelative(2.23f, 0f, 3.8f, -0.7f, 4.75f, -1.3f)
                lineToRelative(-0.79f, 14.51f)
                curveToRelative(-0.1f, 2.13f, -1.85f, 3.8f, -3.98f, 3.8f)
                close()
                moveTo(21.29f, 19.29f)
                curveToRelative(-0.92f, 0.92f, -2.4f, 0.96f, -3.37f, 0.08f)
                lineToRelative(-5.67f, -5.15f)
                lineToRelative(0.43f, -7.85f)
                lineToRelative(8.68f, 9.55f)
                curveToRelative(0.88f, 0.97f, 0.84f, 2.44f, -0.08f, 3.37f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _NailClipper = it}
