package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chimney: ImageVector? = null

val Icons.Sc.Chimney: ImageVector
    get() = _Chimney ?: UXIcon(name = "Chimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.6f, 18f)
                curveToRelative(-0.31f, 2.14f, -0.7f, 3.26f, -0.72f, 3.33f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.5f, -0.59f, 0.6f)
                curveToRelative(-0.09f, 0.03f, -1.66f, 0.61f, -4.28f, 0.9f)
                verticalLineToRelative(-4.84f)
                horizontalLineToRelative(5.6f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-9.6f)
                curveToRelative(0.31f, 2.14f, 0.7f, 3.26f, 0.72f, 3.33f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.5f, 0.59f, 0.6f)
                curveToRelative(0.12f, 0.04f, 2.89f, 1.06f, 7.28f, 1.06f)
                curveToRelative(0.34f, 0f, 0.68f, -0.01f, 1f, -0.02f)
                close()
                moveTo(21.73f, 8.38f)
                curveToRelative(0.3f, -0.06f, 0.57f, -0.25f, 0.71f, -0.53f)
                curveToRelative(0.06f, -0.11f, 0.56f, -1.16f, 0.56f, -2.85f)
                reflectiveCurveToRelative(-0.5f, -2.74f, -0.56f, -2.85f)
                curveToRelative(-0.14f, -0.28f, -0.4f, -0.47f, -0.71f, -0.53f)
                curveToRelative(-0.13f, -0.03f, -3.35f, -0.62f, -9.73f, -0.62f)
                reflectiveCurveToRelative(-9.6f, 0.59f, -9.73f, 0.62f)
                curveToRelative(-0.3f, 0.06f, -0.57f, 0.25f, -0.71f, 0.53f)
                curveToRelative(-0.06f, 0.11f, -0.56f, 1.16f, -0.56f, 2.85f)
                reflectiveCurveToRelative(0.5f, 2.74f, 0.56f, 2.85f)
                curveToRelative(0.14f, 0.28f, 0.4f, 0.47f, 0.71f, 0.53f)
                curveToRelative(0.13f, 0.03f, 3.35f, 0.62f, 9.73f, 0.62f)
                reflectiveCurveToRelative(9.6f, -0.59f, 9.73f, -0.62f)
                close()
                moveTo(3.02f, 10.52f)
                curveToRelative(-0.01f, 0.49f, -0.02f, 0.98f, -0.02f, 1.48f)
                curveToRelative(0f, 1.52f, 0.07f, 2.85f, 0.17f, 4f)
                horizontalLineToRelative(5.83f)
                verticalLineToRelative(-5.05f)
                curveToRelative(-2.85f, -0.09f, -4.84f, -0.29f, -5.98f, -0.44f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.0f, -1f, -0.01f)
                verticalLineToRelative(5.01f)
                horizontalLineToRelative(9.83f)
                curveToRelative(0.1f, -1.15f, 0.17f, -2.48f, 0.17f, -4f)
                curveToRelative(0f, -0.5f, -0.01f, -0.99f, -0.02f, -1.48f)
                curveToRelative(-1.5f, 0.2f, -4.48f, 0.48f, -8.98f, 0.48f)
                close()
            }
        }.also { _Chimney = it}
