package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbExclamation: ImageVector? = null

val Icons.Ts.LightbulbExclamation: ImageVector
    get() = _LightbulbExclamation ?: UXIcon(name = "LightbulbExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 12f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.99f, 2.28f)
                curveTo(16.07f, 0.57f, 13.51f, -0.23f, 10.94f, 0.06f)
                curveToRelative(-3.99f, 0.46f, -7.29f, 3.67f, -7.85f, 7.65f)
                curveToRelative(-0.41f, 2.96f, 0.59f, 5.83f, 2.76f, 7.85f)
                curveToRelative(1.36f, 1.27f, 2.15f, 3.03f, 2.15f, 4.82f)
                verticalLineToRelative(3.62f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3.85f)
                curveToRelative(0f, -1.69f, 0.75f, -3.31f, 2.12f, -4.57f)
                curveToRelative(1.83f, -1.69f, 2.88f, -4.09f, 2.88f, -6.58f)
                curveToRelative(0f, -2.56f, -1.1f, -5.01f, -3.01f, -6.72f)
                close()
                moveTo(15f, 23f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2.62f)
                curveToRelative(0f, -0.46f, -0.05f, -0.93f, -0.13f, -1.38f)
                horizontalLineToRelative(6.23f)
                curveToRelative(-0.07f, 0.38f, -0.1f, 0.76f, -0.1f, 1.15f)
                verticalLineToRelative(2.85f)
                close()
                moveTo(17.44f, 14.84f)
                curveToRelative(-0.99f, 0.91f, -1.7f, 1.99f, -2.09f, 3.16f)
                horizontalLineToRelative(-6.75f)
                curveToRelative(-0.41f, -1.19f, -1.11f, -2.28f, -2.06f, -3.17f)
                curveToRelative(-1.93f, -1.8f, -2.82f, -4.35f, -2.46f, -6.99f)
                curveToRelative(0.49f, -3.53f, 3.42f, -6.38f, 6.97f, -6.79f)
                curveToRelative(2.32f, -0.27f, 4.55f, 0.43f, 6.27f, 1.97f)
                curveToRelative(1.7f, 1.52f, 2.68f, 3.69f, 2.68f, 5.97f)
                curveToRelative(0f, 2.24f, -0.91f, 4.32f, -2.56f, 5.84f)
                close()
            }
        }.also { _LightbulbExclamation = it}
