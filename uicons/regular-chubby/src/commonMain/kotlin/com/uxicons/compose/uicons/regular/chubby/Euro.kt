package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Euro: ImageVector? = null

val Icons.Rc.Euro: ImageVector
    get() = _Euro ?: UXIcon(name = "Euro") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.56f, 17.78f)
                curveToRelative(-2.12f, 2.03f, -4.22f, 3.14f, -6.07f, 3.22f)
                curveToRelative(-3.15f, 0.1f, -6.74f, -2.81f, -8.23f, -6.11f)
                horizontalLineToRelative(6.65f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5.64f)
                curveToRelative(-0.05f, -0.29f, -0.08f, -0.58f, -0.08f, -0.86f)
                curveToRelative(0.01f, -0.3f, 0.04f, -0.61f, 0.09f, -0.91f)
                horizontalLineToRelative(7.26f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(6.26f)
                curveToRelative(1.49f, -3.31f, 5.04f, -6.18f, 8.2f, -6.11f)
                curveToRelative(1.87f, 0.08f, 3.97f, 1.2f, 6.09f, 3.22f)
                curveToRelative(0.4f, 0.38f, 1.03f, 0.37f, 1.41f, -0.03f)
                curveToRelative(0.38f, -0.4f, 0.37f, -1.03f, -0.03f, -1.41f)
                curveToRelative(-2.51f, -2.4f, -4.99f, -3.67f, -7.4f, -3.78f)
                curveToRelative(-0.06f, -0.0f, -0.12f, -0.0f, -0.17f, -0.0f)
                curveToRelative(-4.23f, 0f, -8.7f, 3.75f, -10.25f, 8.11f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.88f)
                curveToRelative(-0.04f, 0.3f, -0.07f, 0.61f, -0.07f, 0.91f)
                curveToRelative(0.01f, 0.29f, 0.03f, 0.57f, 0.07f, 0.86f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.35f)
                curveToRelative(1.53f, 4.34f, 6.02f, 8.11f, 10.27f, 8.11f)
                curveToRelative(0.06f, 0f, 0.12f, 0f, 0.18f, -0.0f)
                curveToRelative(2.39f, -0.1f, 4.88f, -1.38f, 7.38f, -3.77f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.01f, 0.03f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                close()
            }
        }.also { _Euro = it}
