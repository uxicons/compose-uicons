package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Tc.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 1f)
                curveToRelative(-1.55f, 0f, -2.33f, 0.57f, -2.41f, 0.63f)
                curveToRelative(-0.06f, 0.05f, -0.11f, 0.11f, -0.14f, 0.18f)
                curveToRelative(-0.05f, 0.1f, -4.59f, 9.52f, -8.42f, 12.48f)
                curveToRelative(-0.16f, -1.07f, -0.37f, -2.54f, -0.62f, -3.4f)
                curveToRelative(-0.04f, -0.15f, -0.15f, -0.27f, -0.29f, -0.32f)
                curveToRelative(-0.06f, -0.02f, -1.42f, -0.56f, -4.11f, -0.56f)
                reflectiveCurveToRelative(-4.17f, 0.53f, -4.23f, 0.56f)
                curveToRelative(-0.15f, 0.06f, -0.26f, 0.18f, -0.31f, 0.33f)
                curveToRelative(-0.66f, 2.27f, -0.96f, 4.95f, -0.96f, 6.62f)
                curveToRelative(0f, 3.8f, 1.77f, 5.5f, 5.75f, 5.5f)
                horizontalLineToRelative(1.05f)
                curveToRelative(8.0f, 0f, 12.37f, -14.85f, 13.62f, -19.86f)
                curveToRelative(0.51f, -0.13f, 1.08f, -0.14f, 1.08f, -0.14f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(7.8f, 22f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-3.42f, 0f, -4.75f, -1.26f, -4.75f, -4.5f)
                curveToRelative(0f, -1.53f, 0.26f, -3.96f, 0.84f, -6.08f)
                curveToRelative(0.49f, -0.14f, 1.75f, -0.42f, 3.65f, -0.42f)
                curveToRelative(1.87f, 0f, 3.05f, 0.28f, 3.51f, 0.41f)
                curveToRelative(0.26f, 1.06f, 0.47f, 2.68f, 0.65f, 3.82f)
                curveToRelative(0.05f, 0.34f, 0.46f, 0.53f, 0.75f, 0.35f)
                curveToRelative(3.5f, -2.06f, 7.56f, -9.61f, 8.95f, -12.35f)
                curveToRelative(-1.09f, 4.26f, -5.35f, 18.77f, -12.56f, 18.77f)
                close()
            }
        }.also { _PipeSmoking = it}
