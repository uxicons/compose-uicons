package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayCircle: ImageVector? = null

val Icons.Tr.PlayCircle: ImageVector
    get() = _PlayCircle ?: UXIcon(name = "PlayCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 10.44f)
                lineToRelative(-5.85f, -3.2f)
                curveToRelative(-0.56f, -0.32f, -1.23f, -0.31f, -1.78f, 0.01f)
                curveToRelative(-0.56f, 0.33f, -0.89f, 0.9f, -0.89f, 1.55f)
                verticalLineToRelative(6.41f)
                curveToRelative(0f, 0.64f, 0.33f, 1.22f, 0.89f, 1.55f)
                curveToRelative(0.28f, 0.17f, 0.59f, 0.25f, 0.91f, 0.25f)
                curveToRelative(0.3f, 0f, 0.6f, -0.08f, 0.87f, -0.23f)
                lineToRelative(5.86f, -3.21f)
                curveToRelative(0.57f, -0.32f, 0.91f, -0.91f, 0.91f, -1.56f)
                reflectiveCurveToRelative(-0.34f, -1.24f, -0.92f, -1.56f)
                close()
                moveTo(16.07f, 12.69f)
                lineToRelative(-5.86f, 3.21f)
                curveToRelative(-0.25f, 0.14f, -0.54f, 0.14f, -0.79f, -0.01f)
                curveToRelative(-0.25f, -0.14f, -0.39f, -0.4f, -0.39f, -0.69f)
                verticalLineToRelative(-6.41f)
                curveToRelative(0f, -0.28f, 0.15f, -0.54f, 0.39f, -0.69f)
                curveToRelative(0.12f, -0.07f, 0.26f, -0.11f, 0.4f, -0.11f)
                curveToRelative(0.13f, 0f, 0.27f, 0.04f, 0.4f, 0.1f)
                lineToRelative(5.85f, 3.2f)
                curveToRelative(0.25f, 0.14f, 0.4f, 0.4f, 0.4f, 0.69f)
                reflectiveCurveToRelative(-0.15f, 0.55f, -0.4f, 0.69f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _PlayCircle = it}
