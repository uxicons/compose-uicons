package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Sc.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.01f, 0f, -10f, 2.99f, -10f, 10f)
                curveToRelative(0f, 4.73f, 1.42f, 6.96f, 5.02f, 7.67f)
                curveToRelative(0.18f, 3.62f, 1.92f, 4.33f, 4.98f, 4.33f)
                reflectiveCurveToRelative(4.8f, -0.71f, 4.98f, -4.33f)
                curveToRelative(3.59f, -0.72f, 5.02f, -2.94f, 5.02f, -7.67f)
                curveToRelative(0f, -7.01f, -2.99f, -10f, -10f, -10f)
                close()
                moveTo(8f, 14.0f)
                curveToRelative(-1.12f, -0.01f, -1.97f, -0.49f, -2f, -2f)
                curveToRelative(0.03f, -1.48f, 0.87f, -1.99f, 2f, -2f)
                curveToRelative(1.12f, 0.01f, 1.98f, 0.55f, 2f, 2f)
                curveToRelative(-0.03f, 1.51f, -0.87f, 1.99f, -2f, 2f)
                close()
                moveTo(12.86f, 17.89f)
                curveToRelative(-0.1f, 0.03f, -0.39f, 0.11f, -0.86f, 0.11f)
                reflectiveCurveToRelative(-0.76f, -0.08f, -0.86f, -0.11f)
                curveToRelative(-0.48f, -0.16f, -0.77f, -0.66f, -0.66f, -1.15f)
                curveToRelative(0.02f, -0.1f, 0.1f, -0.39f, 0.34f, -0.8f)
                curveToRelative(0.23f, -0.4f, 0.44f, -0.6f, 0.52f, -0.68f)
                curveToRelative(0.38f, -0.35f, 0.96f, -0.35f, 1.35f, 0f)
                curveToRelative(0.08f, 0.07f, 0.28f, 0.28f, 0.52f, 0.68f)
                curveToRelative(0.24f, 0.41f, 0.31f, 0.69f, 0.34f, 0.8f)
                curveToRelative(0.1f, 0.5f, -0.18f, 0.99f, -0.66f, 1.15f)
                close()
                moveTo(16f, 14.0f)
                curveToRelative(-1.12f, -0.01f, -1.97f, -0.49f, -2f, -2f)
                curveToRelative(0.03f, -1.48f, 0.87f, -1.99f, 2f, -2f)
                curveToRelative(1.12f, 0.01f, 1.98f, 0.55f, 2f, 2f)
                curveToRelative(-0.03f, 1.51f, -0.87f, 1.99f, -2f, 2f)
                close()
            }
        }.also { _Skull = it}
