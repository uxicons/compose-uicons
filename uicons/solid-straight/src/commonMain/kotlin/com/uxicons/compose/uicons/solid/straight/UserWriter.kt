package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserWriter: ImageVector? = null

val Icons.Ss.UserWriter: ImageVector
    get() = _UserWriter ?: UXIcon(name = "UserWriter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(16.09f, 14.29f)
                curveToRelative(-2.76f, 2.23f, -3.59f, 5.54f, -3.75f, 6.91f)
                curveToRelative(-0.37f, 0.94f, -0.63f, 1.91f, -0.83f, 2.81f)
                horizontalLineToRelative(2.14f)
                curveToRelative(0.17f, -0.7f, 0.37f, -1.45f, 0.65f, -2.15f)
                curveToRelative(0.96f, -2.59f, 3.17f, -5.69f, 6.28f, -7.41f)
                curveToRelative(-3.07f, 3.57f, -4.07f, 6.94f, -4.07f, 6.94f)
                curveToRelative(1.06f, -0.34f, 2.23f, -0.89f, 3.36f, -1.81f)
                curveToRelative(3.55f, -2.86f, 4.14f, -7.51f, 4.14f, -7.51f)
                curveToRelative(0f, 0f, -4.37f, -0.63f, -7.91f, 2.23f)
                close()
                moveTo(9.55f, 23.56f)
                curveToRelative(0.16f, -0.72f, 0.42f, -1.78f, 0.83f, -2.87f)
                curveToRelative(0.17f, -1.07f, 0.81f, -4.05f, 3.05f, -6.61f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.3f, -0.05f, -0.61f, -0.09f, -0.93f, -0.09f)
                lineTo(5f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                lineTo(9.45f, 24f)
                lineToRelative(0.1f, -0.44f)
                close()
            }
        }.also { _UserWriter = it}
