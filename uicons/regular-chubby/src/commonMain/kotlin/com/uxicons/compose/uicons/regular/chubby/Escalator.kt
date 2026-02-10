package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Rc.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(23f, 9f)
                curveToRelative(0f, 2.62f, -1.38f, 4f, -4f, 4f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-9.69f, 9.19f, -11.04f, 10f, -13.53f, 10f)
                curveToRelative(-2.56f, 0f, -3.87f, -1.35f, -3.87f, -4f)
                curveToRelative(0f, -2.61f, 1.38f, -3.99f, 3.98f, -4.0f)
                curveToRelative(0.01f, -1.48f, -0.03f, -4.78f, 0.06f, -6.61f)
                curveToRelative(0.1f, -1.28f, 1.16f, -2.3f, 2.44f, -2.38f)
                curveToRelative(0.34f, -0.02f, 0.67f, -0.02f, 1.02f, 0f)
                curveToRelative(1.28f, 0.08f, 2.33f, 1.1f, 2.44f, 2.38f)
                curveToRelative(0.05f, 0.51f, 0.04f, 1.02f, 0.04f, 1.58f)
                curveToRelative(4.99f, -4.54f, 6.12f, -4.97f, 8.02f, -4.97f)
                curveToRelative(2.62f, 0f, 4f, 1.38f, 4f, 4f)
                close()
                moveTo(6.99f, 12.21f)
                curveToRelative(-0.0f, 0.49f, -0.01f, 1.01f, -0.01f, 1.48f)
                curveToRelative(0.72f, -0.68f, 1.4f, -1.32f, 2.02f, -1.9f)
                curveToRelative(0f, 0f, 0.01f, -2.09f, -0.05f, -3.24f)
                curveToRelative(-0.02f, -0.3f, -0.26f, -0.53f, -0.57f, -0.55f)
                curveToRelative(-0.26f, -0.02f, -0.51f, -0.02f, -0.77f, 0f)
                curveToRelative(-0.31f, 0.02f, -0.55f, 0.25f, -0.57f, 0.54f)
                curveToRelative(-0.07f, 1.18f, -0.02f, 2.46f, -0.04f, 3.65f)
                close()
                moveTo(21f, 9f)
                curveToRelative(0f, -1.5f, -0.51f, -2f, -2f, -2f)
                curveToRelative(-1.65f, 0f, -2.48f, 0.39f, -12.31f, 9.72f)
                curveToRelative(-0.19f, 0.18f, -0.43f, 0.28f, -0.69f, 0.28f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.5f, 0f, -2f, 0.51f, -2f, 2f)
                curveToRelative(0f, 1.55f, 0.42f, 2f, 1.86f, 2f)
                curveToRelative(1.64f, 0f, 2.71f, -0.47f, 12.45f, -9.72f)
                curveToRelative(0.19f, -0.18f, 0.43f, -0.28f, 0.69f, -0.28f)
                horizontalLineToRelative(1f)
                curveToRelative(1.5f, 0f, 2f, -0.51f, 2f, -2f)
                close()
            }
        }.also { _Escalator = it}
