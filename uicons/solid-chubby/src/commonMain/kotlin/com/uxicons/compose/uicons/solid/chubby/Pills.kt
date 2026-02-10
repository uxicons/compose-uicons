package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Sc.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(-4.04f, 0f, -6f, 1.96f, -6f, 6f)
                reflectiveCurveToRelative(1.96f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -1.96f, 6f, -6f)
                reflectiveCurveToRelative(-1.96f, -6f, -6f, -6f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0.31f, 0f, 0.59f, 0.01f, 0.84f, 0.04f)
                lineToRelative(-3.81f, 3.81f)
                curveToRelative(-0.02f, -0.25f, -0.04f, -0.53f, -0.04f, -0.84f)
                curveToRelative(0f, -2.38f, 0.62f, -3f, 3f, -3f)
                close()
                moveTo(17f, 20f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.01f, -0.84f, -0.04f)
                lineToRelative(3.81f, -3.81f)
                curveToRelative(0.02f, 0.25f, 0.04f, 0.53f, 0.04f, 0.84f)
                curveToRelative(0f, 2.38f, -0.62f, 3f, -3f, 3f)
                close()
                moveTo(7.5f, 11f)
                curveToRelative(-2.98f, 0f, -5.6f, -0.41f, -6.48f, -0.56f)
                curveToRelative(0.04f, -1.76f, 0.12f, -2.83f, 0.13f, -2.88f)
                curveToRelative(0.19f, -3.39f, 1.09f, -6.56f, 6.36f, -6.56f)
                reflectiveCurveToRelative(6.17f, 3.16f, 6.36f, 6.58f)
                curveToRelative(0.0f, 0.03f, 0.06f, 0.69f, 0.1f, 1.83f)
                curveToRelative(-1.01f, 0.3f, -1.87f, 0.76f, -2.58f, 1.38f)
                curveToRelative(-1.11f, 0.11f, -2.44f, 0.21f, -3.87f, 0.21f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 2.3f, 0.57f, 4.13f, 1.65f, 5.47f)
                curveToRelative(-0.82f, 0.34f, -1.85f, 0.53f, -3.15f, 0.53f)
                curveToRelative(-5.26f, 0f, -6.17f, -3.16f, -6.36f, -6.58f)
                curveToRelative(-0.0f, -0.04f, -0.12f, -1.54f, -0.14f, -3.95f)
                curveToRelative(1.16f, 0.19f, 3.64f, 0.53f, 6.5f, 0.53f)
                curveToRelative(0.8f, 0f, 1.57f, -0.03f, 2.29f, -0.07f)
                curveToRelative(-0.52f, 1.13f, -0.79f, 2.49f, -0.79f, 4.07f)
                close()
            }
        }.also { _Pills = it}
