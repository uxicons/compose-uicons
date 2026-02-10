package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Rc.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.86f, 4.53f)
                curveToRelative(-0.11f, -0.27f, -0.33f, -0.49f, -0.61f, -0.58f)
                curveToRelative(-0.06f, -0.02f, -1.26f, -0.42f, -3.31f, -0.69f)
                curveToRelative(-0.55f, -1.52f, -1.84f, -2.26f, -3.94f, -2.26f)
                reflectiveCurveToRelative(-3.4f, 0.74f, -3.94f, 2.26f)
                curveToRelative(-2.05f, 0.28f, -3.26f, 0.68f, -3.31f, 0.69f)
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
                moveTo(18.14f, 20.3f)
                curveToRelative(-0.86f, 0.24f, -2.97f, 0.7f, -6.14f, 0.7f)
                reflectiveCurveToRelative(-5.28f, -0.47f, -6.14f, -0.7f)
                curveToRelative(-0.28f, -0.94f, -0.86f, -3.39f, -0.86f, -7.3f)
                reflectiveCurveToRelative(0.58f, -6.34f, 0.85f, -7.29f)
                curveToRelative(0.57f, -0.15f, 1.65f, -0.39f, 3.11f, -0.55f)
                curveToRelative(0.44f, -0.05f, 0.8f, -0.38f, 0.88f, -0.81f)
                curveToRelative(0.14f, -0.74f, 0.39f, -1.35f, 2.17f, -1.35f)
                reflectiveCurveToRelative(2.03f, 0.61f, 2.17f, 1.35f)
                curveToRelative(0.08f, 0.43f, 0.44f, 0.77f, 0.88f, 0.81f)
                curveToRelative(1.46f, 0.16f, 2.53f, 0.4f, 3.1f, 0.55f)
                curveToRelative(0.28f, 0.95f, 0.85f, 3.39f, 0.85f, 7.29f)
                reflectiveCurveToRelative(-0.58f, 6.36f, -0.86f, 7.3f)
                close()
            }
        }.also { _Clipboard = it}
