package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Sc.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.86f, 4.53f)
                curveToRelative(-0.11f, -0.27f, -0.33f, -0.49f, -0.61f, -0.58f)
                curveToRelative(-0.06f, -0.02f, -1.26f, -0.42f, -3.31f, -0.69f)
                curveToRelative(-0.54f, -1.52f, -1.84f, -2.26f, -3.94f, -2.26f)
                reflectiveCurveToRelative(-3.4f, 0.74f, -3.94f, 2.26f)
                curveToRelative(-2.05f, 0.28f, -3.26f, 0.67f, -3.31f, 0.69f)
                curveToRelative(-0.28f, 0.09f, -0.5f, 0.31f, -0.61f, 0.58f)
                curveToRelative(-0.05f, 0.12f, -1.14f, 2.94f, -1.14f, 8.47f)
                reflectiveCurveToRelative(1.09f, 8.35f, 1.14f, 8.47f)
                curveToRelative(0.1f, 0.27f, 0.32f, 0.47f, 0.58f, 0.57f)
                curveToRelative(0.11f, 0.04f, 2.65f, 0.96f, 7.28f, 0.96f)
                reflectiveCurveToRelative(7.17f, -0.92f, 7.28f, -0.96f)
                curveToRelative(0.27f, -0.1f, 0.48f, -0.31f, 0.58f, -0.57f)
                curveToRelative(0.05f, -0.12f, 1.14f, -2.94f, 1.14f, -8.47f)
                reflectiveCurveToRelative(-1.09f, -8.35f, -1.14f, -8.47f)
                close()
                moveTo(16.84f, 10.21f)
                curveToRelative(-1.17f, 1.83f, -2.84f, 4.14f, -5.37f, 5.65f)
                curveToRelative(-0.32f, 0.19f, -0.73f, 0.19f, -1.05f, -0.01f)
                curveToRelative(-1.36f, -0.86f, -2.39f, -1.79f, -3.22f, -2.91f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.44f, -0.33f, 1.07f, -0.24f, 1.4f, 0.2f)
                curveToRelative(0.58f, 0.78f, 1.27f, 1.44f, 2.17f, 2.07f)
                curveToRelative(1.87f, -1.28f, 3.16f, -3.07f, 4.19f, -4.68f)
                curveToRelative(0.3f, -0.46f, 0.92f, -0.6f, 1.38f, -0.3f)
                reflectiveCurveToRelative(0.6f, 0.92f, 0.3f, 1.38f)
                close()
            }
        }.also { _ClipboardCheck = it}
