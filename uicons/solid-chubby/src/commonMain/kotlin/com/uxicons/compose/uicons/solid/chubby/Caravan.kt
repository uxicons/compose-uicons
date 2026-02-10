package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Sc.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.42f, 16.23f)
                curveToRelative(-1.67f, 0f, -3.03f, 1.36f, -3.03f, 3.02f)
                reflectiveCurveToRelative(1.36f, 3.02f, 3.03f, 3.02f)
                reflectiveCurveToRelative(3.03f, -1.36f, 3.03f, -3.02f)
                reflectiveCurveToRelative(-1.36f, -3.02f, -3.03f, -3.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.47f, 7.57f)
                verticalLineToRelative(12.96f)
                horizontalLineToRelative(3.69f)
                verticalLineTo(7.54f)
                curveToRelative(-0.34f, -0.12f, -0.94f, -0.27f, -1.84f, -0.27f)
                curveToRelative(-0.83f, 0f, -1.45f, 0.16f, -1.84f, 0.29f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.43f, 7.88f)
                horizontalLineToRelative(2.13f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(-2.13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17.57f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(0.31f, -1.36f, 0.72f, -3.68f, 0.72f, -6.44f)
                curveToRelative(0f, -4.38f, -1.02f, -7.61f, -1.06f, -7.74f)
                curveToRelative(-0.1f, -0.32f, -0.36f, -0.57f, -0.69f, -0.66f)
                curveToRelative(-0.15f, -0.04f, -3.79f, -1.0f, -8.08f, -1.0f)
                reflectiveCurveTo(2.91f, 2.68f, 2.76f, 2.73f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.34f, -0.69f, 0.66f)
                curveToRelative(-0.04f, 0.14f, -1.06f, 3.4f, -1.06f, 7.74f)
                curveToRelative(0f, 2.72f, 0.4f, 5.0f, 0.7f, 6.37f)
                curveToRelative(0.71f, -1.91f, 2.56f, -3.27f, 4.71f, -3.27f)
                curveToRelative(1.66f, 0f, 3.13f, 0.81f, 4.05f, 2.05f)
                lineTo(10.47f, 6.93f)
                curveToRelative(0f, -0.34f, 0.17f, -0.66f, 0.46f, -0.84f)
                curveToRelative(0.13f, -0.08f, 1.32f, -0.81f, 3.39f, -0.81f)
                curveToRelative(2.29f, 0f, 3.3f, 0.73f, 3.48f, 0.88f)
                curveToRelative(0.23f, 0.19f, 0.36f, 0.47f, 0.36f, 0.77f)
                verticalLineToRelative(12.64f)
                horizontalLineToRelative(3.85f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8.55f, 11.9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3.43f, 12.9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2.43f, 6.88f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.55f, 5.88f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.02f)
                close()
            }
        }.also { _Caravan = it}
