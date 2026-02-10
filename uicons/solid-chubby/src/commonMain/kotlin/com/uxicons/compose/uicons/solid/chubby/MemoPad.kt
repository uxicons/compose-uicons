package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MemoPad: ImageVector? = null

val Icons.Sc.MemoPad: ImageVector
    get() = _MemoPad ?: UXIcon(name = "MemoPad") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.09f, 9f)
                curveToRelative(-0.05f, 0.9f, -0.09f, 1.9f, -0.09f, 3f)
                curveToRelative(0f, 6.09f, 1.01f, 9.19f, 1.05f, 9.32f)
                curveToRelative(0.11f, 0.32f, 0.38f, 0.57f, 0.71f, 0.65f)
                curveToRelative(0.17f, 0.04f, 4.17f, 1.03f, 8.24f, 1.03f)
                reflectiveCurveToRelative(8.07f, -0.99f, 8.24f, -1.03f)
                curveToRelative(0.33f, -0.08f, 0.6f, -0.33f, 0.71f, -0.65f)
                curveToRelative(0.04f, -0.13f, 1.05f, -3.22f, 1.05f, -9.32f)
                curveToRelative(0f, -1.1f, -0.03f, -2.1f, -0.09f, -3f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(2.25f, 7f)
                curveToRelative(0.3f, -2.79f, 0.77f, -4.23f, 0.8f, -4.32f)
                curveToRelative(0.11f, -0.32f, 0.38f, -0.57f, 0.71f, -0.65f)
                curveToRelative(0.17f, -0.04f, 4.17f, -1.03f, 8.24f, -1.03f)
                reflectiveCurveToRelative(8.07f, 0.99f, 8.24f, 1.03f)
                curveToRelative(0.33f, 0.08f, 0.6f, 0.33f, 0.71f, 0.65f)
                curveToRelative(0.03f, 0.09f, 0.49f, 1.53f, 0.8f, 4.32f)
                close()
            }
        }.also { _MemoPad = it}
