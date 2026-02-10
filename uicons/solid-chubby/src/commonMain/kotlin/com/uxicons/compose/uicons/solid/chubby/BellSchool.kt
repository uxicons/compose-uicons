package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Sc.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 6.84f)
                curveToRelative(-2.6f, 0f, -3.14f, 1.71f, -3.14f, 3.13f)
                curveToRelative(0f, 1.4f, 0.52f, 3.07f, 2.99f, 3.13f)
                curveToRelative(-0.73f, 3.57f, -2.81f, 5.8f, -6.23f, 6.64f)
                curveToRelative(-0.51f, 0.12f, -1.02f, 0.03f, -1.44f, -0.27f)
                curveToRelative(-0.29f, -0.2f, -0.5f, -0.48f, -0.62f, -0.8f)
                curveToRelative(2.42f, -0.22f, 4.99f, -1.08f, 6.3f, -3.93f)
                curveToRelative(-1.88f, -0.7f, -2.99f, -2.4f, -2.99f, -4.77f)
                reflectiveCurveToRelative(1.1f, -4.07f, 2.99f, -4.77f)
                curveToRelative(-1.61f, -3.49f, -5.11f, -4.0f, -7.92f, -4.0f)
                curveTo(6.02f, 1.2f, 1.0f, 2.11f, 1.0f, 9.97f)
                curveToRelative(0f, 6.88f, 3.85f, 8.44f, 7.34f, 8.71f)
                curveToRelative(0.17f, 1.3f, 0.88f, 2.47f, 1.96f, 3.24f)
                curveToRelative(0.81f, 0.57f, 1.77f, 0.87f, 2.75f, 0.87f)
                curveToRelative(0.38f, 0f, 0.77f, -0.05f, 1.15f, -0.14f)
                curveToRelative(5.62f, -1.39f, 8.8f, -5.82f, 8.8f, -12.49f)
                curveToRelative(0f, -1.67f, -0.54f, -3.33f, -3.14f, -3.33f)
                close()
                moveTo(9.8f, 8.47f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _BellSchool = it}
