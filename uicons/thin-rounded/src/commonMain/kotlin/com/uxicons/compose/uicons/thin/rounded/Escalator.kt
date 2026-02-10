package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Tr.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(8.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20f, 5.0f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(-1.3f, 0f, -2.56f, 0.46f, -3.55f, 1.3f)
                lineToRelative(-3.3f, 2.79f)
                curveToRelative(-0.2f, -1.74f, -1.68f, -3.09f, -3.48f, -3.09f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineToRelative(-1.19f, 1.01f)
                curveTo(1.69f, 16.1f, 0f, 17.86f, 0f, 20.0f)
                curveToRelative(0f, 2.21f, 1.8f, 4.0f, 4f, 4.0f)
                horizontalLineToRelative(1.17f)
                curveToRelative(1.3f, 0f, 2.56f, -0.46f, 3.55f, -1.3f)
                lineToRelative(11.47f, -9.7f)
                curveToRelative(2.12f, -0.1f, 3.81f, -1.85f, 3.81f, -4.0f)
                curveToRelative(0f, -2.21f, -1.8f, -4f, -4.0f, -4f)
                close()
                moveTo(6f, 9.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.42f)
                lineToRelative(-5f, 4.23f)
                verticalLineToRelative(-4.65f)
                close()
                moveTo(20f, 12f)
                curveToRelative(-0.12f, 0f, -0.23f, 0.04f, -0.32f, 0.12f)
                lineToRelative(-11.6f, 9.82f)
                curveToRelative(-0.81f, 0.69f, -1.84f, 1.06f, -2.91f, 1.06f)
                horizontalLineToRelative(-1.17f)
                curveToRelative(-1.65f, 0f, -3.0f, -1.35f, -3f, -3.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(0.12f, 0f, 0.23f, -0.04f, 0.32f, -0.12f)
                lineTo(15.92f, 7.06f)
                curveToRelative(0.81f, -0.69f, 1.84f, -1.06f, 2.91f, -1.06f)
                horizontalLineToRelative(1.17f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3.0f, 3f)
                close()
            }
        }.also { _Escalator = it}
