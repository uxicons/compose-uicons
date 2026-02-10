package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Galaxy: ImageVector? = null

val Icons.Ts.Galaxy: ImageVector
    get() = _Galaxy ?: UXIcon(name = "Galaxy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 17.58f)
                lineToRelative(-0.88f, -0.99f)
                curveToRelative(-1.26f, -1.43f, -2.88f, -2.48f, -4.7f, -3.05f)
                curveToRelative(0.18f, 1.3f, 0.15f, 2.59f, -0.16f, 3.86f)
                curveToRelative(-0.96f, 3.89f, -4.54f, 6.6f, -8.7f, 6.6f)
                horizontalLineToRelative(-3.14f)
                reflectiveCurveToRelative(0.99f, -0.88f, 0.99f, -0.88f)
                curveToRelative(1.43f, -1.26f, 2.48f, -2.88f, 3.05f, -4.7f)
                curveToRelative(-1.3f, 0.18f, -2.59f, 0.15f, -3.86f, -0.16f)
                curveTo(2.72f, 17.3f, 0.0f, 13.73f, 0f, 9.56f)
                verticalLineToRelative(-3.14f)
                reflectiveCurveToRelative(0.88f, 0.99f, 0.88f, 0.99f)
                curveToRelative(1.26f, 1.43f, 2.88f, 2.48f, 4.7f, 3.05f)
                curveToRelative(-0.18f, -1.3f, -0.15f, -2.59f, 0.16f, -3.86f)
                curveTo(6.7f, 2.72f, 10.27f, 0.0f, 14.44f, 0f)
                horizontalLineToRelative(3.14f)
                reflectiveCurveToRelative(-0.99f, 0.88f, -0.99f, 0.88f)
                curveToRelative(-1.43f, 1.26f, -2.48f, 2.88f, -3.05f, 4.7f)
                curveToRelative(1.3f, -0.18f, 2.59f, -0.15f, 3.86f, 0.16f)
                curveToRelative(3.89f, 0.96f, 6.6f, 4.54f, 6.6f, 8.7f)
                verticalLineToRelative(3.14f)
                close()
                moveTo(23f, 14.44f)
                curveToRelative(0f, -3.65f, -2.46f, -6.9f, -5.84f, -7.73f)
                curveToRelative(-1.12f, -0.28f, -2.26f, -0.3f, -3.38f, -0.08f)
                curveToRelative(-0.36f, 0.07f, -0.72f, -0.05f, -0.97f, -0.32f)
                curveToRelative(-0.25f, -0.28f, -0.34f, -0.68f, -0.22f, -1.03f)
                curveToRelative(0.5f, -1.59f, 1.34f, -3.05f, 2.45f, -4.27f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-3.65f, 0f, -6.9f, 2.46f, -7.73f, 5.84f)
                curveToRelative(-0.28f, 1.13f, -0.3f, 2.26f, -0.08f, 3.38f)
                curveToRelative(0.07f, 0.36f, -0.05f, 0.72f, -0.32f, 0.97f)
                curveToRelative(-0.28f, 0.25f, -0.68f, 0.34f, -1.03f, 0.22f)
                curveToRelative(-1.59f, -0.5f, -3.05f, -1.34f, -4.27f, -2.45f)
                verticalLineToRelative(0.6f)
                curveToRelative(0f, 3.65f, 2.46f, 6.9f, 5.84f, 7.73f)
                curveToRelative(1.13f, 0.28f, 2.26f, 0.31f, 3.38f, 0.08f)
                curveToRelative(0.07f, -0.01f, 0.14f, -0.02f, 0.21f, -0.02f)
                curveToRelative(0.29f, 0f, 0.56f, 0.12f, 0.76f, 0.34f)
                curveToRelative(0.25f, 0.28f, 0.34f, 0.68f, 0.22f, 1.03f)
                curveToRelative(-0.5f, 1.59f, -1.34f, 3.05f, -2.45f, 4.27f)
                horizontalLineToRelative(0.6f)
                curveToRelative(3.65f, 0f, 6.9f, -2.46f, 7.73f, -5.84f)
                curveToRelative(0.28f, -1.13f, 0.3f, -2.26f, 0.08f, -3.38f)
                curveToRelative(-0.07f, -0.36f, 0.05f, -0.72f, 0.32f, -0.97f)
                curveToRelative(0.28f, -0.25f, 0.68f, -0.33f, 1.03f, -0.22f)
                curveToRelative(1.59f, 0.5f, 3.05f, 1.34f, 4.27f, 2.45f)
                verticalLineToRelative(-0.6f)
                close()
            }
        }.also { _Galaxy = it}
