package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Tr.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                curveToRelative(0.14f, 0f, -0.05f, 0.02f, 0f, 0f)
                horizontalLineToRelative(0f)
                close()
                moveTo(12.5f, 24f)
                curveTo(5f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 7f, -5.5f, 12f, -11.5f, 12f)
                close()
                moveTo(16.43f, 4f)
                horizontalLineToRelative(-0.93f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.11f, 0.06f, 2.58f, 2.52f, 3.94f)
                curveToRelative(1.55f, -1.9f, 2.48f, -4.31f, 2.48f, -6.94f)
                curveToRelative(0f, -3.69f, -1.83f, -6.96f, -4.63f, -8.95f)
                curveToRelative(-0.47f, 0.59f, -1.18f, 0.95f, -1.94f, 0.95f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-0.92f, 0f, -1.82f, -0.37f, -2.48f, -1.02f)
                lineToRelative(-3.73f, -3.73f)
                curveToRelative(-0.02f, 0.25f, -0.04f, 0.5f, -0.04f, 0.76f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(19.84f, 19.7f)
                curveToRelative(-2.8f, -1.68f, -2.84f, -4.57f, -2.84f, -4.7f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.93f)
                curveToRelative(0.42f, 0f, 0.82f, -0.19f, 1.1f, -0.49f)
                curveToRelative(-1.63f, -0.95f, -3.51f, -1.5f, -5.53f, -1.5f)
                curveTo(6.62f, 1f, 2.14f, 4.88f, 1.19f, 9.99f)
                lineToRelative(4.28f, 4.28f)
                curveToRelative(0.47f, 0.47f, 1.11f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(3.26f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.45f)
                curveToRelative(2.67f, -0.24f, 5.06f, -1.44f, 6.84f, -3.25f)
                close()
            }
        }.also { _World = it}
