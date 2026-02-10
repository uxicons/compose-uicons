package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Picture: ImageVector? = null

val Icons.Rc.Picture: ImageVector
    get() = _Picture ?: UXIcon(name = "Picture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.96f, 11.47f)
                curveToRelative(2.5f, 0f, 3.03f, -1.65f, 3.03f, -3.03f)
                reflectiveCurveToRelative(-0.53f, -3.03f, -3.03f, -3.03f)
                reflectiveCurveToRelative(-3.03f, 1.65f, -3.03f, 3.03f)
                reflectiveCurveToRelative(0.53f, 3.03f, 3.03f, 3.03f)
                close()
                moveTo(15.96f, 7.4f)
                curveToRelative(0.82f, 0f, 1.03f, 0.1f, 1.03f, 1.03f)
                curveToRelative(0f, 0.91f, -0.21f, 1.03f, -1.03f, 1.03f)
                reflectiveCurveToRelative(-1.03f, -0.1f, -1.03f, -1.03f)
                reflectiveCurveToRelative(0.21f, -1.03f, 1.03f, -1.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 3.21f)
                curveToRelative(-0.1f, -0.32f, -0.36f, -0.57f, -0.69f, -0.66f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.14f, -9.11f, -1.14f)
                reflectiveCurveTo(3.06f, 2.51f, 2.89f, 2.55f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.34f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.15f, -1.2f, 3.85f, -1.2f, 8.78f)
                curveToRelative(0f, 4.97f, 1.15f, 8.63f, 1.2f, 8.79f)
                curveToRelative(0.1f, 0.32f, 0.36f, 0.57f, 0.69f, 0.66f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.14f, 9.11f, 1.14f)
                reflectiveCurveToRelative(8.94f, -1.09f, 9.11f, -1.14f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.34f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.15f, 1.2f, -3.85f, 1.2f, -8.78f)
                curveToRelative(0f, -4.97f, -1.15f, -8.63f, -1.2f, -8.79f)
                close()
                moveTo(3.96f, 4.35f)
                curveToRelative(1.25f, -0.29f, 4.47f, -0.94f, 8.04f, -0.94f)
                reflectiveCurveToRelative(6.8f, 0.65f, 8.04f, 0.94f)
                curveToRelative(0.3f, 1.15f, 0.95f, 4.06f, 0.95f, 7.65f)
                curveToRelative(0f, 2.51f, -0.33f, 4.71f, -0.62f, 6.19f)
                curveToRelative(-0.63f, -0.78f, -1.4f, -1.66f, -2.28f, -2.52f)
                curveToRelative(-4.29f, -4.18f, -8.48f, -5.17f, -8.66f, -5.21f)
                curveToRelative(-0.21f, -0.05f, -0.43f, -0.03f, -0.63f, 0.06f)
                curveToRelative(-0.14f, 0.06f, -2.99f, 1.35f, -5.67f, 4.36f)
                curveToRelative(-0.08f, -0.88f, -0.13f, -1.85f, -0.13f, -2.87f)
                curveToRelative(0f, -3.56f, 0.66f, -6.49f, 0.96f, -7.65f)
                close()
                moveTo(3.95f, 19.65f)
                curveToRelative(-0.12f, -0.44f, -0.28f, -1.15f, -0.45f, -2.05f)
                curveToRelative(2.17f, -3.03f, 4.9f, -4.63f, 5.81f, -5.11f)
                curveToRelative(1.0f, 0.31f, 4.18f, 1.48f, 7.38f, 4.6f)
                curveToRelative(0.96f, 0.94f, 1.79f, 1.92f, 2.44f, 2.74f)
                curveToRelative(-1.57f, 0.31f, -4.24f, 0.74f, -7.14f, 0.74f)
                curveToRelative(-3.58f, 0f, -6.8f, -0.65f, -8.05f, -0.94f)
                close()
            }
        }.also { _Picture = it}
