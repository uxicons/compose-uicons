package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radio: ImageVector? = null

val Icons.Rc.Radio: ImageVector
    get() = _Radio ?: UXIcon(name = "Radio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19f, 14f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -1.59f, -0.41f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 2f)
                reflectiveCurveToRelative(0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                close()
                moveTo(23f, 14f)
                curveToRelative(0f, 4.34f, -0.74f, 7.33f, -0.77f, 7.45f)
                curveToRelative(-0.09f, 0.36f, -0.37f, 0.64f, -0.73f, 0.73f)
                curveToRelative(-0.14f, 0.03f, -3.44f, 0.82f, -9.49f, 0.82f)
                reflectiveCurveToRelative(-9.36f, -0.79f, -9.49f, -0.82f)
                curveToRelative(-0.36f, -0.09f, -0.64f, -0.37f, -0.73f, -0.73f)
                curveToRelative(-0.03f, -0.12f, -0.77f, -3.11f, -0.77f, -7.45f)
                reflectiveCurveToRelative(0.74f, -7.33f, 0.77f, -7.45f)
                curveToRelative(0.07f, -0.26f, 0.25f, -0.48f, 0.48f, -0.63f)
                curveToRelative(5.07f, -2.98f, 10.22f, -4.5f, 16.68f, -4.92f)
                curveToRelative(0.54f, -0.03f, 1.03f, 0.38f, 1.06f, 0.93f)
                curveToRelative(0.04f, 0.55f, -0.38f, 1.03f, -0.93f, 1.06f)
                curveToRelative(-3.87f, 0.26f, -7.25f, 0.92f, -10.41f, 2.09f)
                curveToRelative(1.0f, -0.05f, 2.11f, -0.09f, 3.35f, -0.09f)
                curveToRelative(6.05f, 0f, 9.36f, 0.79f, 9.49f, 0.82f)
                curveToRelative(0.36f, 0.09f, 0.64f, 0.37f, 0.73f, 0.73f)
                curveToRelative(0.03f, 0.12f, 0.77f, 3.11f, 0.77f, 7.45f)
                close()
                moveTo(21f, 14f)
                curveToRelative(0f, -2.98f, -0.38f, -5.31f, -0.58f, -6.36f)
                curveToRelative(-1.18f, -0.22f, -4.07f, -0.65f, -8.42f, -0.65f)
                reflectiveCurveToRelative(-7.23f, 0.43f, -8.42f, 0.65f)
                curveToRelative(-0.21f, 1.05f, -0.58f, 3.38f, -0.58f, 6.36f)
                reflectiveCurveToRelative(0.38f, 5.31f, 0.58f, 6.36f)
                curveToRelative(1.18f, 0.22f, 4.07f, 0.65f, 8.42f, 0.65f)
                reflectiveCurveToRelative(7.23f, -0.43f, 8.42f, -0.65f)
                curveToRelative(0.21f, -1.05f, 0.58f, -3.38f, 0.58f, -6.36f)
                close()
            }
        }.also { _Radio = it}
