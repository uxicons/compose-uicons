package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiXmark: ImageVector? = null

val Icons.Tr.WifiXmark: ImageVector
    get() = _WifiXmark ?: UXIcon(name = "WifiXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.15f, 8.15f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.47f, -0.45f, 0.26f, -1.17f, 0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.45f, -0.47f, 1.17f, 0.26f, 0.71f, 0.71f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.47f, 0.45f, -0.26f, 1.17f, -0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.45f, 0.47f, -1.17f, -0.26f, -0.71f, -0.71f)
                close()
                moveTo(14f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(13f, 20f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(23.31f, 8.69f)
                curveToRelative(-1.86f, -1.86f, -4.17f, -3.24f, -6.67f, -4f)
                curveToRelative(-0.61f, -0.2f, -0.91f, 0.78f, -0.29f, 0.96f)
                curveToRelative(2.35f, 0.71f, 4.51f, 2.01f, 6.25f, 3.75f)
                curveToRelative(0.45f, 0.47f, 1.17f, -0.26f, 0.71f, -0.71f)
                close()
                moveTo(7.98f, 5.02f)
                curveToRelative(-0.08f, -0.27f, -0.36f, -0.42f, -0.62f, -0.33f)
                curveToRelative(-2.5f, 0.76f, -4.81f, 2.14f, -6.67f, 4f)
                curveToRelative(-0.47f, 0.45f, 0.26f, 1.17f, 0.71f, 0.71f)
                curveToRelative(1.75f, -1.75f, 3.91f, -3.04f, 6.25f, -3.75f)
                curveToRelative(0.27f, -0.08f, 0.41f, -0.36f, 0.33f, -0.62f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.4f, 0f, -4.66f, 0.94f, -6.36f, 2.64f)
                curveToRelative(-0.47f, 0.45f, 0.26f, 1.17f, 0.71f, 0.71f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                curveToRelative(0.45f, 0.47f, 1.17f, -0.26f, 0.71f, -0.71f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.64f, -6.36f, -2.64f)
                close()
            }
        }.also { _WifiXmark = it}
