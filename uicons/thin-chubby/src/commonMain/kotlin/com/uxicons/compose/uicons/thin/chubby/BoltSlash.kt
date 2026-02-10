package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoltSlash: ImageVector? = null

val Icons.Tc.BoltSlash: ImageVector
    get() = _BoltSlash ?: UXIcon(name = "BoltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 22.15f)
                lineToRelative(-5.75f, -5.75f)
                curveToRelative(1.98f, -2.96f, 2.87f, -5.72f, 2.88f, -5.75f)
                curveToRelative(0.1f, -0.31f, -0.15f, -0.65f, -0.48f, -0.64f)
                horizontalLineToRelative(-4.93f)
                lineToRelative(1.08f, -8.44f)
                curveToRelative(0.05f, -0.35f, -0.3f, -0.65f, -0.64f, -0.54f)
                curveToRelative(-2.81f, 0.84f, -5.34f, 2.79f, -7.52f, 5.76f)
                lineToRelative(-5.63f, -5.63f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(14.55f, 2.23f)
                lineTo(13.5f, 10.44f)
                curveToRelative(-0.04f, 0.29f, 0.2f, 0.57f, 0.5f, 0.56f)
                horizontalLineToRelative(4.79f)
                curveToRelative(-0.36f, 0.93f, -1.14f, 2.74f, -2.41f, 4.67f)
                lineToRelative(-8.17f, -8.17f)
                curveToRelative(1.88f, -2.6f, 4.0f, -4.37f, 6.35f, -5.26f)
                close()
                moveTo(14.85f, 18.51f)
                curveToRelative(0.2f, 0.19f, 0.21f, 0.51f, 0.02f, 0.71f)
                curveToRelative(-1.78f, 1.87f, -3.76f, 3.13f, -5.87f, 3.77f)
                curveToRelative(-0.33f, 0.11f, -0.69f, -0.2f, -0.64f, -0.54f)
                lineToRelative(1.08f, -8.44f)
                horizontalLineToRelative(-4.93f)
                curveToRelative(-0.33f, 0.01f, -0.58f, -0.34f, -0.48f, -0.65f)
                curveToRelative(0.0f, -0.01f, 0.49f, -1.54f, 1.59f, -3.59f)
                curveToRelative(0.13f, -0.24f, 0.43f, -0.34f, 0.68f, -0.2f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.2f, 0.68f)
                curveToRelative(-0.62f, 1.16f, -1.04f, 2.15f, -1.28f, 2.76f)
                horizontalLineToRelative(4.79f)
                curveToRelative(0.29f, -0.01f, 0.54f, 0.27f, 0.5f, 0.56f)
                lineToRelative(-1.05f, 8.21f)
                curveToRelative(1.67f, -0.64f, 3.24f, -1.73f, 4.69f, -3.25f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.02f)
                close()
            }
        }.also { _BoltSlash = it}
