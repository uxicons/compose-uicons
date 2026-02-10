package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bookmark: ImageVector? = null

val Icons.Sc.Bookmark: ImageVector
    get() = _Bookmark ?: UXIcon(name = "Bookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.2f, 7.19f)
                curveToRelative(-0.45f, -2.78f, -2.42f, -5.01f, -5.01f, -5.67f)
                curveToRelative(-1.34f, -0.34f, -2.75f, -0.52f, -4.18f, -0.52f)
                curveToRelative(-1.43f, 0.0f, -2.84f, 0.18f, -4.18f, 0.52f)
                curveToRelative(-2.6f, 0.66f, -4.57f, 2.89f, -5.01f, 5.67f)
                curveToRelative(-0.65f, 4.07f, -0.58f, 8.38f, 0.23f, 13.18f)
                curveToRelative(0.21f, 1.24f, 1.1f, 2.22f, 2.32f, 2.53f)
                curveToRelative(1.45f, 0.37f, 2.64f, -0.31f, 3.26f, -1.08f)
                curveToRelative(0.63f, -0.79f, 3.05f, -3.87f, 3.05f, -3.87f)
                curveToRelative(0.11f, -0.14f, 0.26f, -0.17f, 0.34f, -0.17f)
                reflectiveCurveToRelative(0.23f, 0.02f, 0.34f, 0.17f)
                curveToRelative(0f, 0f, 2.42f, 3.08f, 3.05f, 3.87f)
                curveToRelative(0.79f, 0.98f, 2.04f, 1.4f, 3.26f, 1.08f)
                curveToRelative(1.22f, -0.32f, 2.11f, -1.29f, 2.32f, -2.53f)
                curveToRelative(0.81f, -4.8f, 0.89f, -9.11f, 0.23f, -13.18f)
                close()
            }
        }.also { _Bookmark = it}
