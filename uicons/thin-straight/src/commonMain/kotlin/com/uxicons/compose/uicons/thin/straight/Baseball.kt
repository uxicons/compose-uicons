package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Baseball: ImageVector? = null

val Icons.Ts.Baseball: ImageVector
    get() = _Baseball ?: UXIcon(name = "Baseball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17.06f, 15.19f)
                lineToRelative(2.38f, -0.71f)
                lineToRelative(-0.28f, -0.96f)
                lineToRelative(-2.38f, 0.71f)
                curveToRelative(-0.18f, -0.72f, -0.27f, -1.47f, -0.27f, -2.23f)
                reflectiveCurveToRelative(0.09f, -1.51f, 0.27f, -2.23f)
                lineToRelative(2.38f, 0.71f)
                lineToRelative(0.28f, -0.96f)
                lineToRelative(-2.38f, -0.71f)
                curveToRelative(0.6f, -1.65f, 1.65f, -3.12f, 3.07f, -4.22f)
                curveToRelative(1.78f, 1.96f, 2.87f, 4.55f, 2.87f, 7.4f)
                reflectiveCurveToRelative(-1.09f, 5.45f, -2.87f, 7.4f)
                curveToRelative(-1.42f, -1.1f, -2.47f, -2.56f, -3.07f, -4.22f)
                close()
                moveTo(3.81f, 4.67f)
                curveToRelative(1.44f, 1.07f, 2.51f, 2.52f, 3.12f, 4.15f)
                lineToRelative(-2.36f, 0.7f)
                lineToRelative(0.28f, 0.96f)
                lineToRelative(2.37f, -0.71f)
                curveToRelative(0.18f, 0.72f, 0.28f, 1.47f, 0.28f, 2.23f)
                reflectiveCurveToRelative(-0.09f, 1.51f, -0.28f, 2.23f)
                lineToRelative(-2.37f, -0.71f)
                lineToRelative(-0.28f, 0.96f)
                lineToRelative(2.36f, 0.7f)
                curveToRelative(-0.61f, 1.64f, -1.68f, 3.08f, -3.12f, 4.15f)
                curveToRelative(-1.75f, -1.95f, -2.81f, -4.52f, -2.81f, -7.33f)
                reflectiveCurveToRelative(1.06f, -5.39f, 2.81f, -7.33f)
                close()
                moveTo(4.52f, 20.05f)
                curveToRelative(1.56f, -1.19f, 2.72f, -2.79f, 3.37f, -4.58f)
                lineToRelative(2.43f, 0.72f)
                lineToRelative(0.28f, -0.96f)
                lineToRelative(-2.42f, -0.72f)
                curveToRelative(0.21f, -0.81f, 0.32f, -1.66f, 0.32f, -2.52f)
                reflectiveCurveToRelative(-0.11f, -1.7f, -0.32f, -2.52f)
                lineToRelative(2.42f, -0.72f)
                lineToRelative(-0.28f, -0.96f)
                lineToRelative(-2.43f, 0.72f)
                curveToRelative(-0.66f, -1.8f, -1.81f, -3.4f, -3.37f, -4.58f)
                curveToRelative(1.97f, -1.83f, 4.59f, -2.94f, 7.48f, -2.94f)
                curveToRelative(2.85f, 0f, 5.46f, 1.09f, 7.42f, 2.88f)
                curveToRelative(-1.53f, 1.22f, -2.68f, 2.83f, -3.32f, 4.64f)
                lineToRelative(-2.41f, -0.72f)
                lineToRelative(-0.28f, 0.96f)
                lineToRelative(2.41f, 0.72f)
                curveToRelative(-0.2f, 0.81f, -0.31f, 1.66f, -0.31f, 2.52f)
                reflectiveCurveToRelative(0.11f, 1.7f, 0.31f, 2.52f)
                lineToRelative(-2.41f, 0.72f)
                lineToRelative(0.28f, 0.96f)
                lineToRelative(2.41f, -0.72f)
                curveToRelative(0.64f, 1.81f, 1.78f, 3.42f, 3.32f, 4.64f)
                curveToRelative(-1.96f, 1.79f, -4.56f, 2.88f, -7.42f, 2.88f)
                curveToRelative(-2.89f, 0f, -5.52f, -1.12f, -7.48f, -2.94f)
                close()
            }
        }.also { _Baseball = it}
