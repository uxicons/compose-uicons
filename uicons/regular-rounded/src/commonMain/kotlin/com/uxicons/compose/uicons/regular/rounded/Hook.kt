package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hook: ImageVector? = null

val Icons.Rr.Hook: ImageVector
    get() = _Hook ?: UXIcon(name = "Hook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.43f, 8.77f)
                curveToRelative(-1.28f, -0.61f, -2.14f, -1.71f, -2.37f, -2.97f)
                curveToRelative(1.13f, -0.43f, 1.94f, -1.52f, 1.94f, -2.8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.32f, 0.86f, 2.43f, 2.05f, 2.83f)
                curveToRelative(0.24f, 2.02f, 1.54f, 3.8f, 3.52f, 4.75f)
                curveToRelative(2.08f, 0.99f, 3.43f, 3.12f, 3.43f, 5.42f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-0.17f)
                curveToRelative(0f, -0.58f, -0.29f, -0.93f, -0.65f, -1.32f)
                lineToRelative(-0.34f, -0.34f)
                curveToRelative(-0.37f, -0.37f, -1.01f, -0.11f, -1.01f, 0.42f)
                curveToRelative(0.0f, 0.07f, -0.01f, 1.39f, 0.0f, 1.45f)
                curveToRelative(0.03f, 4.39f, 3.6f, 7.95f, 8.0f, 7.95f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.07f, -1.79f, -5.91f, -4.57f, -7.23f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _Hook = it}
