package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Tr.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.28f)
                curveTo(22f, 4.16f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.16f, 2f, 9.28f)
                curveToRelative(0f, 5.49f, 3.58f, 11.59f, 8.58f, 12.58f)
                curveToRelative(-0.19f, 0.26f, -0.34f, 0.56f, -0.44f, 0.86f)
                curveToRelative(-0.1f, 0.29f, -0.05f, 0.62f, 0.13f, 0.87f)
                curveToRelative(0.18f, 0.26f, 0.48f, 0.41f, 0.8f, 0.41f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.31f, 0f, 0.61f, -0.15f, 0.8f, -0.41f)
                curveToRelative(0.18f, -0.25f, 0.23f, -0.58f, 0.13f, -0.87f)
                curveToRelative(-0.1f, -0.3f, -0.25f, -0.6f, -0.44f, -0.86f)
                curveToRelative(5.0f, -0.99f, 8.58f, -7.08f, 8.58f, -12.58f)
                close()
                moveTo(12.91f, 23f)
                lineToRelative(-1.82f, 0.04f)
                curveToRelative(0.19f, -0.57f, 0.6f, -1.04f, 0.91f, -1.04f)
                reflectiveCurveToRelative(0.71f, 0.46f, 0.91f, 1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.07f, 0f, -9f, -6.3f, -9f, -11.72f)
                curveTo(3f, 4.72f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 3.72f, 9f, 8.28f)
                curveToRelative(0f, 5.42f, -3.93f, 11.72f, -9f, 11.72f)
                close()
                moveTo(17.98f, 10.53f)
                curveToRelative(-0.14f, 1.97f, -1.02f, 3.96f, -2.37f, 5.32f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(1.17f, -1.17f, 1.97f, -2.97f, 2.08f, -4.68f)
                curveToRelative(0.02f, -0.28f, 0.26f, -0.49f, 0.53f, -0.47f)
                curveToRelative(0.28f, 0.02f, 0.48f, 0.26f, 0.47f, 0.53f)
                close()
            }
        }.also { _Balloon = it}
