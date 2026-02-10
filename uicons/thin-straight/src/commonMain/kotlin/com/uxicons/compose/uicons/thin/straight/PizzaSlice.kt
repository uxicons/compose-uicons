package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PizzaSlice: ImageVector? = null

val Icons.Ts.PizzaSlice: ImageVector
    get() = _PizzaSlice ?: UXIcon(name = "PizzaSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.32f, 0.68f)
                curveToRelative(-0.64f, -0.64f, -1.57f, -0.85f, -2.44f, -0.53f)
                lineTo(0f, 8.53f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 8.35f, 6.79f, 15.14f, 15.14f, 15.14f)
                horizontalLineToRelative(0.34f)
                lineTo(23.86f, 3.11f)
                curveToRelative(0.31f, -0.85f, 0.1f, -1.78f, -0.54f, -2.43f)
                close()
                moveTo(14.8f, 23.0f)
                curveToRelative(-7.53f, -0.18f, -13.62f, -6.27f, -13.8f, -13.8f)
                lineToRelative(3.02f, -1.21f)
                curveToRelative(0.19f, 7.36f, 4.63f, 11.8f, 11.99f, 11.99f)
                lineToRelative(-1.21f, 3.02f)
                close()
                moveTo(19.66f, 10.87f)
                curveToRelative(-1.28f, -0.47f, -2.17f, -1.69f, -2.17f, -3.08f)
                curveToRelative(0f, -1.81f, 1.47f, -3.29f, 3.29f, -3.29f)
                curveToRelative(0.46f, 0f, 0.91f, 0.1f, 1.32f, 0.28f)
                lineToRelative(-2.44f, 6.09f)
                close()
                moveTo(22.92f, 2.75f)
                lineToRelative(-0.44f, 1.1f)
                curveToRelative(-0.53f, -0.23f, -1.11f, -0.35f, -1.7f, -0.35f)
                curveToRelative(-2.36f, 0f, -4.29f, 1.92f, -4.29f, 4.29f)
                curveToRelative(0f, 1.81f, 1.14f, 3.4f, 2.79f, 4.01f)
                lineToRelative(-2.89f, 7.2f)
                curveToRelative(-7.11f, -0.04f, -11.36f, -4.29f, -11.4f, -11.4f)
                lineTo(21.23f, 1.08f)
                curveToRelative(0.49f, -0.18f, 1.01f, -0.06f, 1.38f, 0.31f)
                curveToRelative(0.37f, 0.37f, 0.48f, 0.89f, 0.31f, 1.36f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _PizzaSlice = it}
