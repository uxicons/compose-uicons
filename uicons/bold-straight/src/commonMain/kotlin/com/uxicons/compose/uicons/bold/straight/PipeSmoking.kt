package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Bs.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.62f, 0f)
                curveToRelative(-1.15f, 0f, -2.23f, 0.56f, -2.88f, 1.51f)
                lineToRelative(-6.15f, 8.89f)
                curveToRelative(-1.15f, -0.75f, -2.69f, -0.43f, -3.41f, 0.66f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-0.22f, -1.08f)
                lineToRelative(-8.66f, -0.02f)
                reflectiveCurveToRelative(-0.42f, 2.01f, -0.51f, 2.4f)
                curveTo(0.37f, 14.15f, -0.0f, 15.81f, 0f, 18.52f)
                curveToRelative(0.0f, 3.02f, 2.47f, 5.48f, 5.5f, 5.48f)
                horizontalLineToRelative(1.4f)
                curveToRelative(2.35f, 0f, 4.57f, -1.15f, 5.94f, -3.11f)
                lineToRelative(3.75f, -5.66f)
                curveToRelative(0.37f, -0.56f, 0.5f, -1.22f, 0.36f, -1.88f)
                curveToRelative(-0.11f, -0.53f, -0.38f, -1.0f, -0.8f, -1.37f)
                lineTo(22.21f, 3.21f)
                curveToRelative(0.09f, -0.14f, 0.25f, -0.21f, 0.41f, -0.21f)
                horizontalLineToRelative(1.38f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1.38f)
                close()
                moveTo(10.36f, 19.2f)
                curveToRelative(-0.79f, 1.13f, -2.08f, 1.8f, -3.46f, 1.8f)
                horizontalLineToRelative(-1.4f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.11f, -2.5f, -2.48f)
                curveToRelative(-0.0f, -2.38f, 0.32f, -3.81f, 0.69f, -5.47f)
                curveToRelative(0.0f, -0.02f, 0.01f, -0.03f, 0.01f, -0.05f)
                lineToRelative(3.79f, 0.01f)
                curveToRelative(0.13f, 0.63f, 0.22f, 1.16f, 0.35f, 2.0f)
                lineToRelative(0.54f, 3.64f)
                lineToRelative(3.98f, -5.49f)
                lineToRelative(1.43f, 0.85f)
                lineToRelative(-3.44f, 5.19f)
                close()
            }
        }.also { _PipeSmoking = it}
