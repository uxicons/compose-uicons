package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Ts.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.63f, 19.58f)
                lineToRelative(-2.4f, -2.58f)
                lineToRelative(-0.73f, 0.68f)
                lineToRelative(2.15f, 2.32f)
                horizontalLineToRelative(-2.65f)
                curveToRelative(-1.25f, 0f, -2.35f, -2.23f, -3.33f, -4.2f)
                curveToRelative(-1.01f, -2.04f, -1.89f, -3.81f, -3.17f, -3.81f)
                reflectiveCurveToRelative(-2.15f, 1.76f, -3.17f, 3.81f)
                curveToRelative(-0.98f, 1.97f, -2.08f, 4.2f, -3.33f, 4.2f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(0.8f, -1.23f, 1.52f, -3.55f, 2.49f, -6.81f)
                curveToRelative(0.97f, -3.26f, 2.42f, -8.19f, 3.62f, -8.19f)
                curveToRelative(0.85f, 0f, 1.82f, 2.47f, 2.67f, 5.07f)
                curveToRelative(0.44f, 0.09f, 0.84f, 0.25f, 1.2f, 0.48f)
                curveToRelative(-1.28f, -4.12f, -2.33f, -6.55f, -3.87f, -6.55f)
                curveToRelative(-1.81f, 0f, -2.94f, 3.36f, -4.58f, 8.9f)
                curveToRelative(-0.79f, 2.65f, -2.1f, 7.1f, -2.92f, 7.1f)
                lineTo(4f, 1.35f)
                lineToRelative(2.32f, 2.15f)
                lineToRelative(0.68f, -0.73f)
                lineTo(4.43f, 0.39f)
                curveToRelative(-0.25f, -0.25f, -0.58f, -0.39f, -0.93f, -0.39f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.14f, -0.92f, 0.37f)
                lineTo(0f, 2.77f)
                lineToRelative(0.68f, 0.73f)
                lineTo(3f, 1.35f)
                verticalLineToRelative(19.65f)
                horizontalLineToRelative(19.65f)
                lineToRelative(-2.15f, 2.32f)
                lineToRelative(0.73f, 0.68f)
                lineToRelative(2.38f, -2.57f)
                curveToRelative(0.25f, -0.25f, 0.39f, -0.58f, 0.39f, -0.93f)
                reflectiveCurveToRelative(-0.14f, -0.68f, -0.37f, -0.92f)
                close()
                moveTo(11.23f, 16.25f)
                curveToRelative(0.72f, -1.45f, 1.61f, -3.25f, 2.27f, -3.25f)
                reflectiveCurveToRelative(1.55f, 1.8f, 2.27f, 3.25f)
                curveToRelative(0.7f, 1.41f, 1.41f, 2.83f, 2.28f, 3.75f)
                horizontalLineToRelative(-9.1f)
                curveToRelative(0.86f, -0.92f, 1.58f, -2.34f, 2.28f, -3.75f)
                close()
            }
        }.also { _CurveArrow = it}
