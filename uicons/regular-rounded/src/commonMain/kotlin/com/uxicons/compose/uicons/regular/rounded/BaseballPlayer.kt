package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BaseballPlayer: ImageVector? = null

val Icons.Rr.BaseballPlayer: ImageVector
    get() = _BaseballPlayer ?: UXIcon(name = "BaseballPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(5f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(23.79f, 10.26f)
                curveToRelative(-0.27f, 0.46f, -0.76f, 0.74f, -1.29f, 0.74f)
                horizontalLineToRelative(-4.63f)
                curveToRelative(-0.37f, 0f, -0.73f, -0.07f, -1.08f, -0.2f)
                lineToRelative(-1.56f, -0.6f)
                lineToRelative(-2.17f, 6.12f)
                lineToRelative(1.72f, 1.27f)
                curveToRelative(0.76f, 0.56f, 1.22f, 1.47f, 1.22f, 2.41f)
                verticalLineToRelative(2.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.99f)
                curveToRelative(0f, -0.32f, -0.15f, -0.62f, -0.41f, -0.8f)
                lineToRelative(-4.58f, -3.39f)
                lineToRelative(-2.77f, 7.55f)
                curveToRelative(-0.19f, 0.52f, -0.78f, 0.78f, -1.28f, 0.59f)
                curveToRelative(-0.52f, -0.19f, -0.78f, -0.77f, -0.59f, -1.28f)
                lineToRelative(5.06f, -13.78f)
                curveToRelative(0.26f, -0.72f, 0.79f, -1.29f, 1.49f, -1.6f)
                curveToRelative(0.7f, -0.32f, 1.47f, -0.34f, 2.19f, -0.06f)
                lineToRelative(4.42f, 1.7f)
                curveToRelative(0.12f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                horizontalLineToRelative(3.75f)
                lineToRelative(-4.48f, -7.49f)
                curveToRelative(-0.28f, -0.47f, -0.13f, -1.09f, 0.34f, -1.37f)
                curveToRelative(0.47f, -0.28f, 1.09f, -0.13f, 1.37f, 0.34f)
                lineToRelative(4.94f, 8.26f)
                curveToRelative(0.28f, 0.5f, 0.27f, 1.06f, -0.0f, 1.52f)
                close()
                moveTo(13.37f, 9.48f)
                lineTo(12.38f, 9.1f)
                curveToRelative(-0.21f, -0.08f, -0.44f, -0.07f, -0.64f, 0.02f)
                curveToRelative(-0.2f, 0.09f, -0.36f, 0.26f, -0.44f, 0.47f)
                verticalLineToRelative(0.0f)
                lineToRelative(-1.56f, 4.26f)
                lineToRelative(1.65f, 1.22f)
                lineToRelative(1.99f, -5.59f)
                close()
            }
        }.also { _BaseballPlayer = it}
