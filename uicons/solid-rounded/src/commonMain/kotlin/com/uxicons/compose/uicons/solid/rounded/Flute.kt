package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flute: ImageVector? = null

val Icons.Sr.Flute: ImageVector
    get() = _Flute ?: UXIcon(name = "Flute") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.22f, 1.22f)
                lineToRelative(-0.42f, -0.42f)
                curveToRelative(-0.88f, -0.88f, -2.24f, -1.05f, -3.31f, -0.43f)
                curveToRelative(-0.69f, 0.4f, -1.41f, 0.66f, -2.08f, 0.73f)
                curveToRelative(-0.52f, 0.06f, -1.01f, 0.25f, -1.43f, 0.55f)
                lineToRelative(6.39f, 6.39f)
                curveToRelative(0.3f, -0.42f, 0.49f, -0.91f, 0.55f, -1.43f)
                curveToRelative(0.08f, -0.67f, 0.33f, -1.39f, 0.73f, -2.08f)
                curveToRelative(0.62f, -1.07f, 0.45f, -2.44f, -0.43f, -3.31f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.07f, 16.5f)
                curveToRelative(-0.69f, 0.69f, -1.07f, 1.61f, -1.07f, 2.58f)
                reflectiveCurveToRelative(0.38f, 1.89f, 1.07f, 2.58f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.71f, 0.71f, 1.65f, 1.07f, 2.58f, 1.07f)
                reflectiveCurveToRelative(1.87f, -0.36f, 2.58f, -1.07f)
                curveToRelative(0f, 0f, 0f, -0.0f, 0.0f, -0.0f)
                lineToRelative(13.46f, -13.47f)
                lineToRelative(-6.46f, -6.46f)
                curveToRelative(-0.99f, 0.99f, -11.88f, 11.89f, -13.46f, 13.47f)
                close()
                moveTo(7.55f, 17.95f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(11.05f, 14.45f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Flute = it}
