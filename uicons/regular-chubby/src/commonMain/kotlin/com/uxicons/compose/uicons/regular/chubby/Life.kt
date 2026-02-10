package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Rc.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 2.77f)
                curveToRelative(0f, -0.98f, 0.78f, -1.77f, 1.75f, -1.77f)
                reflectiveCurveToRelative(1.75f, 0.66f, 1.75f, 1.64f)
                curveToRelative(0f, -0.98f, 0.78f, -1.64f, 1.75f, -1.64f)
                reflectiveCurveToRelative(1.75f, 0.79f, 1.75f, 1.77f)
                curveToRelative(0f, 1.93f, -1.75f, 3.38f, -2.77f, 4.03f)
                curveToRelative(-0.44f, 0.28f, -1.01f, 0.28f, -1.45f, 0f)
                curveToRelative(-1.02f, -0.65f, -2.77f, -2.09f, -2.77f, -4.03f)
                close()
                moveTo(12f, 8f)
                curveToRelative(1.99f, 0f, 3f, 1.01f, 3f, 3f)
                reflectiveCurveToRelative(-1.01f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.01f, -3f, -3f)
                reflectiveCurveToRelative(1.01f, -3f, 3f, -3f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-0.88f, 0f, -1f, 0.12f, -1f, 1f)
                reflectiveCurveToRelative(0.12f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.12f, 1f, -1f)
                reflectiveCurveToRelative(-0.12f, -1f, -1f, -1f)
                close()
                moveTo(22.45f, 9.11f)
                curveToRelative(-0.49f, -0.24f, -1.09f, -0.05f, -1.34f, 0.45f)
                curveToRelative(-1.56f, 3.12f, -4.8f, 5.17f, -5.74f, 5.73f)
                curveToRelative(-0.65f, -0.1f, -2.1f, -0.28f, -3.36f, -0.28f)
                reflectiveCurveToRelative(-2.71f, 0.19f, -3.36f, 0.28f)
                curveToRelative(-0.95f, -0.55f, -4.18f, -2.61f, -5.74f, -5.73f)
                curveToRelative(-0.25f, -0.49f, -0.85f, -0.69f, -1.34f, -0.45f)
                curveToRelative(-0.49f, 0.25f, -0.69f, 0.85f, -0.45f, 1.34f)
                curveToRelative(1.68f, 3.36f, 4.88f, 5.57f, 6.24f, 6.4f)
                curveToRelative(-0.14f, 0.91f, -0.35f, 2.58f, -0.35f, 4.2f)
                curveToRelative(0f, 0.17f, 0.0f, 0.82f, 0.01f, 0.99f)
                curveToRelative(0.02f, 0.54f, 0.46f, 0.97f, 1.0f, 0.97f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.55f, -0.02f, 0.99f, -0.48f, 0.97f, -1.03f)
                curveToRelative(-0.01f, -0.16f, -0.01f, -0.77f, -0.01f, -0.93f)
                curveToRelative(0f, -1.42f, 0.19f, -2.96f, 0.32f, -3.83f)
                curveToRelative(0.69f, -0.09f, 1.76f, -0.21f, 2.68f, -0.21f)
                reflectiveCurveToRelative(2.0f, 0.12f, 2.68f, 0.21f)
                curveToRelative(0.13f, 0.87f, 0.32f, 2.41f, 0.32f, 3.83f)
                curveToRelative(0f, 0.17f, -0.0f, 0.78f, -0.01f, 0.94f)
                curveToRelative(-0.01f, 0.55f, 0.42f, 1.01f, 0.98f, 1.02f)
                curveToRelative(0.53f, 0f, 1.01f, -0.42f, 1.02f, -0.98f)
                curveToRelative(0.0f, -0.17f, 0.01f, -0.81f, 0.01f, -0.98f)
                curveToRelative(0f, -1.61f, -0.21f, -3.28f, -0.35f, -4.2f)
                curveToRelative(1.36f, -0.83f, 4.56f, -3.04f, 6.24f, -6.4f)
                curveToRelative(0.25f, -0.49f, 0.05f, -1.09f, -0.45f, -1.34f)
                close()
            }
        }.also { _Life = it}
