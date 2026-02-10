package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CatHead: ImageVector? = null

val Icons.Ts.CatHead: ImageVector
    get() = _CatHead ?: UXIcon(name = "CatHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 13.55f)
                curveToRelative(0f, 5.67f, -4.81f, 10.45f, -10.5f, 10.45f)
                horizontalLineToRelative(-3f)
                curveTo(4.81f, 24f, 0f, 19.21f, 0f, 13.55f)
                curveTo(0f, 6.46f, 1.09f, 1.26f, 1.11f, 1.21f)
                lineToRelative(0.17f, -0.77f)
                lineToRelative(3.87f, 2.94f)
                curveToRelative(1.99f, -1.47f, 4.46f, -2.33f, 6.85f, -2.38f)
                curveToRelative(2.39f, -0.04f, 4.63f, 0.74f, 6.83f, 2.4f)
                lineToRelative(3.93f, -2.98f)
                lineToRelative(0.14f, 0.81f)
                curveToRelative(0.01f, 0.06f, 1.1f, 6.33f, 1.1f, 12.32f)
                close()
                moveTo(23f, 13.55f)
                curveToRelative(0f, -4.65f, -0.67f, -9.46f, -0.96f, -11.34f)
                lineToRelative(-3.23f, 2.45f)
                lineToRelative(-0.3f, -0.24f)
                curveToRelative(-2.11f, -1.67f, -4.25f, -2.47f, -6.5f, -2.42f)
                curveToRelative(-2.29f, 0.04f, -4.68f, 0.92f, -6.55f, 2.4f)
                lineToRelative(-0.3f, 0.24f)
                lineTo(1.94f, 2.2f)
                curveToRelative(-0.3f, 1.69f, -0.94f, 5.96f, -0.94f, 11.35f)
                curveToRelative(0f, 5.12f, 4.35f, 9.45f, 9.5f, 9.45f)
                horizontalLineToRelative(3f)
                curveToRelative(5.15f, 0f, 9.5f, -4.33f, 9.5f, -9.45f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(-2.35f, 0f, -3.46f, -1.1f, -4f, -2.15f)
                curveToRelative(-0.54f, 1.05f, -1.66f, 2.15f, -4f, 2.15f)
                verticalLineToRelative(-1f)
                curveToRelative(2.23f, 0f, 3.04f, -1.18f, 3.33f, -2.06f)
                curveToRelative(-1.46f, -0.27f, -2.33f, -1.41f, -2.33f, -2.25f)
                curveToRelative(0f, -0.78f, 0.79f, -1.69f, 3f, -1.69f)
                reflectiveCurveToRelative(3f, 0.91f, 3f, 1.69f)
                curveToRelative(0f, 0.84f, -0.87f, 1.98f, -2.33f, 2.25f)
                curveToRelative(0.29f, 0.89f, 1.1f, 2.06f, 3.33f, 2.06f)
                close()
                moveTo(11.99f, 15.0f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.31f, -0.01f, 1.99f, -0.92f, 1.99f, -1.31f)
                curveToRelative(0f, -0.28f, -0.64f, -0.69f, -2f, -0.69f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 0.69f)
                curveToRelative(0f, 0.39f, 0.68f, 1.31f, 1.99f, 1.31f)
                close()
            }
        }.also { _CatHead = it}
